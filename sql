//GET ALL PACIENTS BY DATE AND FILIAL ID

select sh.SCHEDID,sh.filial,doc.fullname,ch.chname,sh.pcode,sh.BHOUR,sh.bmin,sh.fHOUR,sh.fmin, cl.fullname,cl.bdate,sh.clvisit from SCHEDULE sh
inner join clients cl on (cl.pcode = sh.pcode)
inner join doctor doc on (doc.dcode = sh.dcode)
inner join CHAIRS ch on (ch.CHID = sh.CHID)
where sh.workdate = '15.03.2018' and sh.FILIAL='55' and sh.SCHEDID = '550938647'



//CHANGE CLVISIT

SELECT * FROM CF_SCHEDULE_UPDATE('550000001','990000023','55','550938647','55','PDNTP','550164554','550000438','15.03.2018','990008904','8','0','8','30','510000022',
null,null,null,null,null,null,null,null,null,null,'55',
null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,
null,null,null,'1',null,'3',null,'1')



//GET FILIAL'S DB PATH

SELECT FILID, DBALIAS, DBPATH, DBIPADDR, DBPORT from FILIALS WHERE FILID='55'