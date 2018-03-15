package com.infoterminal.infoterminal;

import com.infoterminal.infoterminal.entities.Clients;
import com.infoterminal.infoterminal.entities.Filials;
import com.infoterminal.infoterminal.jpa.FilialsRepo;
import com.xuggle.mediatool.IMediaListener;
import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.MediaListenerAdapter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.mediatool.event.IVideoPictureEvent;
import com.xuggle.xuggler.IError;
import com.xuggle.xuggler.demos.VideoImage;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.List;

@Controller
public class TerminalController {

    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate template;
    
    @Autowired
    FilialsRepo filialsRepo;

//    public DataSource configure(){
//        return dataSource;
//    }
    
    @RequestMapping(value = "/filials")
    @ResponseBody
    public List<Filials> getFilials() throws SQLException {
        
        String query = "SELECT * from FILIALS WHERE FILID='55'";
        List<Filials> filials = template.query(query, new BeanPropertyRowMapper<>(Filials.class));
        return filials;
    }
    
    @RequestMapping(value ="/schedulePhone/{phone}")
    @ResponseBody
    public List getPacientsByPhone(@PathVariable(required = true) String phone) throws SQLException {
        String query = "select * from get_client_by_phone ('" + phone+"')";
        
        List schedule = template.query(query, new BeanPropertyRowMapper<>(Clients.class));
        return schedule;
    }
    
    @RequestMapping(value = "/pacient/{name}/{date}")
    @ResponseBody
    public List getPacient(@PathVariable(required = true) String name, @PathVariable(required = true) String date) throws SQLException{
        String query = "select DISTINCT cl.fullname,cl.bdate from SCHEDULE sh\n" +
                "inner join clients cl on (cl.pcode = sh.pcode)\n" +
                "where WORKDATE='" +date+ "' and sh.FILIAL='8' and LOWER (cl.FULLNAME) like LOWER("+"'%"+name+"%')\n" +
                "ORDER BY FULLNAME, BDATE";
        
        List client = template.query(query, new BeanPropertyRowMapper<>(Clients.class));
        return client;
    }
    
    @RequestMapping(value ="/schedule/{name}/{date}")
    @ResponseBody
    public List getPacientsByName(@PathVariable(required = true) String name, @PathVariable(required = true) String date) throws SQLException {
        String query = "select sh.SCHEDID,doc.fullname as docname,sh.filial,ch.chname,sh.pcode,sh.BHOUR,sh.bmin,sh.fHOUR,sh.fmin, cl.fullname,cl.bdate,cl.phone1,cl.phone2,cl.phone3 from SCHEDULE sh\n" +
                "inner join clients cl on (cl.pcode = sh.pcode)\n" +
                "inner join doctor doc on (doc.dcode = sh.dcode)\n" +
                "inner join CHAIRS ch on (ch.CHID = sh.CHID)\n" +
                "where WORKDATE = '" +date+ "' and sh.FILIAL = '8' and LOWER (cl.FULLNAME) like LOWER("+"'%"+name+"%') ";

        List schedule = template.query(query, new BeanPropertyRowMapper<>(Clients.class));

        return schedule;
    }
    
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public void submitIncoming(){
        System.out.println("Отметься уже о приеме");
        String query = "SELECT * FROM CF_SCHEDULE_UPDATE('550000661','990000023','55','550938647','55','PDNTP','550164554','550000438','15.03.2018','990008904','8','0','8','30','510000022',\n" +
                "null,null,null,null,null,null,null,null,null,null,'55',\n" +
                "null,null,null,null,null,null,null,null,null,null,\n" +
                "null,null,null,null,null,null,null,null,null,null,\n" +
                "null,null,null,'1',null,'3',null,'1')";
        template.query(query, new BeanPropertyRowMapper<>(Clients.class));
    }

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
