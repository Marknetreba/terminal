package com.infoterminal.infoterminal;

import com.infoterminal.infoterminal.entities.Clients;
import com.infoterminal.infoterminal.entities.Filials;
import com.infoterminal.infoterminal.entities.Schedule;
import com.infoterminal.infoterminal.jpa.ClientsRepo;
import com.infoterminal.infoterminal.jpa.FilialsRepo;
import com.infoterminal.infoterminal.jpa.ScheduleRepo;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TerminalController {

    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate template;
    
    @Autowired
    FilialsRepo filialsRepo;
    
    @Autowired
    ScheduleRepo scheduleRepo;
    
    @Autowired
    ClientsRepo clientsRepo;
    
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
    
    @RequestMapping(value ="/schedule/{name}/{date}")
    @ResponseBody
    public List getPacientsByName(@PathVariable(required = true) String name, @PathVariable(required = true) String date) throws SQLException {
        String query = "select sh.SCHEDID,sh.filial,ch.chname,sh.pcode,sh.BHOUR,sh.bmin,sh.fHOUR,sh.fmin, cl.fullname,cl.bdate,cl.phone1,cl.phone2,cl.phone3 from SCHEDULE sh\n" +
                "inner join clients cl on (cl.pcode = sh.pcode)\n" +
                "inner join CHAIRS ch on (ch.CHID = sh.CHID)\n" +
                "where WORKDATE = '" +date+ "' and sh.FILIAL = '8' and LOWER (cl.FULLNAME) like LOWER("+"'%"+name+"%') ";

        List schedule = template.query(query, new BeanPropertyRowMapper<>(Clients.class));

        return schedule;
    }
    
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public void submitIncoming(){}

//    @RequestMapping(value = "/{id}")
//    @ResponseBody
//    public String id(@PathVariable(required = false) String id){
//        return id;
//    }
}
