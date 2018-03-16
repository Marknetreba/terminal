//GET ALL PACIENTS BY DATE AND FILIAL ID

select sh.SCHEDID,sh.CASHID,sh.filial,doc.dcode,ch.CHID,doc.fullname,ch.chname,sh.pcode,sh.BHOUR,sh.bmin,sh.fHOUR,sh.fmin, cl.fullname,cl.bdate, sh.visit_uid, sh.visittime, sh.clvisit from SCHEDULE sh
inner join clients cl on (cl.pcode = sh.pcode)
inner join doctor doc on (doc.dcode = sh.dcode)
inner join CHAIRS ch on (ch.CHID = sh.CHID)
where sh.workdate = '16.03.2018' and sh.FILIAL='55' and sh.SCHEDID = '550938875'



//CHANGE CLVISIT

SELECT * FROM CF_SCHEDULE_UPDATE('550000661','990000023','55','550938875','55','PDNTP','550164559','550000438','16.03.2018','990008904','8','0','8','30','510000022',
                null,null,null,null,null,null,null,null,null,null,'55',
                null,null,null,null,null,null,null,null,null,null,
                null,null,null,null,null,null,null,null,null,null,
                null,null,null,null,null,null,null,null,null,null,
                null,null,null,'1',null,'3','16.03.2018 08:10:00','1')



//GET FILIAL'S DB PATH

SELECT FILID, DBALIAS, DBPATH, DBIPADDR, DBPORT from FILIALS WHERE FILID='55'

//GET SHEDIDENT

SELECT SCHEDIDENT FROM DOCTSHEDULE WHERE WDATE = '15.03.2018' and DCODE = '550000438'