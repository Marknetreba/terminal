package com.infoterminal.infoterminal;

import com.infoterminal.infoterminal.entities.Clients;
import com.infoterminal.infoterminal.entities.Filials;
import com.infoterminal.infoterminal.jpa.FilialsRepo;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    
    @RequestMapping(value = "/filials")
    @ResponseBody
    public List<Filials> getFilials() throws SQLException {
        
        List<Filials> filials = filialsRepo.findAll();
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
    }

//    @RequestMapping(value = "/{id}")
//    @ResponseBody
//    public String id(@PathVariable(required = false) String id){
//        return id;
//    }
}
