package com.infoterminal.infoterminal;

import com.infoterminal.infoterminal.entities.Clients;
import com.infoterminal.infoterminal.entities.Filials;

import com.xuggle.mediatool.IMediaListener;
import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.MediaListenerAdapter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.mediatool.event.IVideoPictureEvent;
import com.xuggle.xuggler.IError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TerminalController {

    @Qualifier("dataSource")
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate template;

    
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
        String query = "select fil.WEBNAME, sh.SCHEDID,sh.CASHID,doc.dcode,ch.CHID,doc.fullname as docname,sh.filial,ch.chname,sh.pcode,sh.BHOUR,sh.bmin,sh.fHOUR,sh.fmin, cl.fullname,cl.bdate,cl.phone1,cl.phone2,cl.phone3, sh.clvisit from SCHEDULE sh\n" +
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


    @RequestMapping(value = "/notification", method = RequestMethod.POST)
    @ResponseBody
    public void pushNotification(){}


    @RequestMapping(value = "/photo", method = RequestMethod.GET)
    @ResponseBody
    public BufferedImage takePhoto() {

        BufferedImage[] image = new BufferedImage[1];

        IMediaListener mediaListener = new MediaListenerAdapter() {
            @Override
            public void onVideoPicture(IVideoPictureEvent event) {
                try {
                    image[0] = event.getImage();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };

        IMediaReader mediaReader = ToolFactory.makeReader("rtsp://admin:admin@192.168.128.51:554/RVi/1/1");
        mediaReader.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
        mediaReader.setQueryMetaData(false);
        mediaReader.addListener(mediaListener);

        while (true) {
            IError err = mediaReader.readPacket();
            if (err != null) {
                System.out.println("Error: " + err);
                break;
            }
        }

        return image[0];
    }

//    @RequestMapping(value = "/{id}")
//    @ResponseBody
//    public String id(@PathVariable(required = false) String id){
//        return id;
//    }
}
