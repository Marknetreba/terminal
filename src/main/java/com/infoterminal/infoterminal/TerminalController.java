package com.infoterminal.infoterminal;

import com.infoterminal.infoterminal.entities.Clients;
import com.infoterminal.infoterminal.entities.Filials;
import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFmpegExecutor;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.RunProcessFunction;
import net.bramp.ffmpeg.builder.FFmpegBuilder;
import net.bramp.ffmpeg.job.FFmpegJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class TerminalController {

    @Qualifier("dataSource")
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate template;

    @Autowired
    private ResourceLoader resourceLoader;
    
    @RequestMapping(value ="/schedulePhone/{phone}")
    @ResponseBody
    public List getPacientsByPhone(@PathVariable(required = true) String phone) {
        String query = "select * from get_client_by_phone ('" + phone+"')";

        return template.query(query, new BeanPropertyRowMapper<>(Clients.class));
    }
    
    @RequestMapping(value = "/pacient/{name}/{date}/{filial}")
    @ResponseBody
    public List getPacient(@PathVariable(required = true) String name,
                           @PathVariable(required = true) String date,
                           @PathVariable(required = true) String filial) {
        String query = "select DISTINCT cl.fullname,cl.bdate from SCHEDULE sh\n" +
                "inner join clients cl on (cl.pcode = sh.pcode)\n" +
                "where WORKDATE='" +date+ "' and sh.FILIAL='"+filial+"' and LOWER (cl.FULLNAME) like LOWER("+"'%"+name+"%')\n" +
                "ORDER BY FULLNAME, BDATE";

        return template.query(query, new BeanPropertyRowMapper<>(Clients.class));
    }
    
    @RequestMapping(value ="/schedule/{name}/{date}/{filial}")
    @ResponseBody
    public List getPacientsByName(@PathVariable(required = true) String name,
                                  @PathVariable(required = true) String date,
                                  @PathVariable(required = true) String filial) {
        String newQuery = "\n" +
                "with patr as (select c.pcode,c.fullname\n" +
                "from clservice cls\n" +
                "left join clients c on cls.pcode = c.pcode\n" +
                "left join discountsprav dp on (cls.did = dp.did)\n" +
                "left join wschema ws on (dp.schid = ws.schid)\n" +
                "left join doctor d on d.dcode = c.dcode1\n" +
                "where\n" +
                "ws.speccode = 130\n" +
                "and\n" +
                " current_date between cls.sdate and cls.fdate";
        
        String query = "select sh.workdate,fil.WEBNAME, sh.SCHEDID,sh.CASHID,doc.dcode,ch.CHID,doc.fullname as docname,sh.filial,ch.chname,sh.pcode,sh.BHOUR,sh.bmin,sh.fHOUR,sh.fmin, cl.fullname,cl.bdate,cl.phone1,cl.phone2,cl.phone3, sh.clvisit from SCHEDULE sh\n" +
                "inner join clients cl on (cl.pcode = sh.pcode)\n" +
                "inner join doctor doc on (doc.dcode = sh.dcode)\n" +
                "inner join CHAIRS ch on (ch.CHID = sh.CHID)\n" +
                "INNER join FILIALS fil on (fil.FILID = sh.FILIAL)\n" +
                "where WORKDATE = '" +date+ "' and sh.FILIAL = '"+filial+"' and LOWER (cl.FULLNAME) like LOWER("+"'%"+name+"%') ";

        return template.query(query, new BeanPropertyRowMapper<>(Clients.class));
    }

    private DataSource database() {
        ArrayList<Filials> filials = new ArrayList<>(this.getFilials());
        String url = "jdbc:firebirdsql://"+filials.get(0).getDbipaddr()+"/"+filials.get(0).getDbalias()+"?charSet=Cp1251&encoding=win1251";
        System.out.println(url);

        return DataSourceBuilder.create().username("CHEA").password("PDNTP").url(url)
                .driverClassName("org.firebirdsql.jdbc.FBDriver").build();
    }
    
    private List<Filials> getFilials() {
        String query = "SELECT * from FILIALS WHERE FILID='55'";
        return template.query(query, new BeanPropertyRowMapper<>(Filials.class));
    }

    private List<Clients> getSchedident(Long dcode, String date) {
        return template.query("SELECT SCHEDIDENT FROM DOCTSHEDULE WHERE WDATE = '"+date+"' and DCODE = '"+dcode+"'", new BeanPropertyRowMapper<>(Clients.class));
    }
    
    @RequestMapping(value = "/submit/{dcode}/{pcode}/{bhour}/{bmin}/{fhour}/{fmin}/{shedid}/{cashid}/{chid}/{date}/{filial}")
    @ResponseBody
    public void submitIncoming(@PathVariable(required=true) Long dcode,
                               @PathVariable(required=true) Long pcode,
                               @PathVariable(required=true) Long bhour,
                               @PathVariable(required=true) Long bmin,
                               @PathVariable(required=true) Long fhour,
                               @PathVariable(required=true) Long fmin,
                               @PathVariable(required=true) Integer shedid,
                               @PathVariable(required=true) Long cashid,
                               @PathVariable(required = true) Long chid,
                               @PathVariable(required = true) String date,
                               @PathVariable(required = true) String filial)
    {
        List<Clients> schedident = new ArrayList<>(this.getSchedident(dcode, date));
        System.out.println("SCHEDIDENT: "+schedident.get(0).getSCHEDIDENT());
        
        String query = "SELECT * FROM CF_SCHEDULE_UPDATE('550000661','"+cashid+"','"+filial+"','"+shedid+"','"+filial+"','PDNTP','"+schedident.get(0).getSCHEDIDENT()+"','"+dcode+"','"+date+"','"+chid+"','"+bhour+"','"+bmin+"','"+fhour+"','"+fmin+"','"+pcode+"',\n" +
                "null,null,null,null,null,null,null,null,null,null,null,\n" +
                "null,null,null,null,null,null,null,null,null,null,\n" +
                "null,null,null,null,null,null,null,null,null,null,\n" +
                "null,null,null,null,null,null,null,null,null,null,\n" +
                "null,null,null,'1',null,'3','"+date+" 00:00:00','1')";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(this.database());
        jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Clients.class));
    }


    @RequestMapping(value = "/photo/{camera}", method = RequestMethod.GET)
    @ResponseBody
    public String takePhoto(@PathVariable(required=true) String camera) throws IOException {
        RunProcessFunction func = new RunProcessFunction();
        func.setWorkingDirectory("/usr/bin");

        FFmpeg ffmpeg = new FFmpeg("./ffmpeg", func);
        FFprobe ffprobe = new FFprobe("./ffprobe", func);

        String time = new SimpleDateFormat("yyyy.MM.dd_HH:mm:ss").format(new Date());
        String output = "/root/sadko-infomat.tmp/src/main/resources/static/images/"+time+".jpeg";
        String link = time+".jpeg";
        
        String input = "rtsp://admin:admin@192.168."+camera+":554/RVi/1/1";
        System.out.println(input);
        
        FFmpegBuilder fFmpegBuilder = new FFmpegBuilder()
                .setInput(input)
                .addOutput(output)
                .setDuration(30, TimeUnit.MILLISECONDS)
                .done();
        
        FFmpegExecutor executor = new FFmpegExecutor(ffmpeg, ffprobe);

        FFmpegJob job = executor.createJob(fFmpegBuilder);
        job.run();
        
        return link;
    }
    
    @RequestMapping(value = "/images/{image}", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public ResponseEntity<byte[]> getImage(@PathVariable(required = true) String image) throws IOException {

        // Windows file system test;
        //final Resource fileResource = resourceLoader.getResource("file:///C:/terminal/src/main/resources/static/images/"+image+".jpeg");

        final Resource fileResource = resourceLoader.getResource("file:/root/sadko-infomat.tmp/src/main/resources/static/images/"+image+".jpeg");

        System.out.println(fileResource.getFilename());
        System.out.println(fileResource.getURL());

        byte[] bytes = StreamUtils.copyToByteArray(fileResource.getInputStream());

        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG)
                .body(bytes);
    }
}
