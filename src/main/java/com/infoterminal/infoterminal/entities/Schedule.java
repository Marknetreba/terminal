package com.infoterminal.infoterminal.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SCHEDULE")
@JsonIgnoreProperties(ignoreUnknown = true)

public class Schedule  implements Serializable {
  
  @Id
  private Long schedid;
 
  @JoinColumn(name = "DCODE", table = "DOCTOR")
  private Long dcode;
  
  private java.sql.Timestamp workdate;
  private Long bhour;
  private Long bmin;
  private Long fhour;
  private Long fmin;

  
  @JoinColumn(table = "CLIENTS", name = "PCODE")
  private Long pcode;
  
  private Long treatcode;
  private Long tmstatus;
  private Long clvisit;
  private java.sql.Timestamp visittime;
  private String comment;
  private Long uid;
  private java.sql.Timestamp modifydate;
  private Long status;
  private Long reasid;
  private Long chid;
  private String schlist;
  private Long sqid;
  private Double schamount;
  private Long cashid;
  private Long clcall;
  private java.sql.Timestamp calltime;
  private Long calcstatus;
  private Long checkstatus;
  private Long talonnum;
  private Long filial;
  private Long remfromq;
  private Long fixhour;
  private java.sql.Timestamp fixdate;
  private Long refid;
  private Long dcode1;
  private Long absencecount;
  private java.sql.Timestamp exportdate;
  private Long receipid;
  private Long schedtype;
  private Long teamid;
  private Long emid;
  private String refercomment;
  private Long fromfilial;
  private String emrgcomment;
  private Long planid;
  private Long createuid;
  private Long modifyfilial;
  private Long creatorid;
  private java.sql.Timestamp starttreat;
  private Long groupcount;
  private Long garantletter;
  private String garantnum;
  private Long agrid;
  private Long lstid;
  private java.sql.Timestamp finishtreat;
  private Long kateg;
  private java.sql.Timestamp createdate;
  
//  private Long replId;
//  private Long replGrpid;
  
  private Long schuslid;
  private Long calltype;
  private Long visit_uid;
  private Long anaestype;
  private Long sms_sent;
  private String ringuptime;
  private Long waitneartime;
  private Long histid;
  private Long sectid;
  private Long sectid2;
  private Long specserv;
  private Long specservprice;
  private Double specproc;
  private Double specpriceproc;
  private Long discaccum;
  private Long smtdetid;
  private Long dirid;
  private Long treatcomplete;
  private Long schedident;
  private Long reserveschedid;
  private Long schedlevel;
  private Long represpcode;
  private Long sufficienttime;
  private String tmstatuscomment;
  private Long frompid;
  private Long quid;
  private Long protocolid;
  private Long livequeue;
  private Long queuenum;
  private String disccard;
  private String disccardnum;
  private Long bonussyst;
  private Long booktype;
  private Long represhisttype;
  private Long onlinetype;
  private Long parentschedid;
  private java.sql.Timestamp visitcalltime;
  private java.sql.Timestamp transftime;
  private String callerid;
  private Long plantype;
  private Long dailyplanfilial;
  private Long plan_createmode;
  private Long treatfilial;

  public Schedule() {
  }

  public Long getSchedid() {
    return schedid;
  }

  public void setSchedid(Long schedid) {
    this.schedid = schedid;
  }

  public Long getDcode() {
    return dcode;
  }

  public void setDcode(Long dcode) {
    this.dcode = dcode;
  }

  public java.sql.Timestamp getWorkdate() {
    return workdate;
  }

  public void setWorkdate(java.sql.Timestamp workdate) {
    this.workdate = workdate;
  }

  public Long getBhour() {
    return bhour;
  }

  public void setBhour(Long bhour) {
    this.bhour = bhour;
  }

  public Long getBmin() {
    return bmin;
  }

  public void setBmin(Long bmin) {
    this.bmin = bmin;
  }

  public Long getFhour() {
    return fhour;
  }

  public void setFhour(Long fhour) {
    this.fhour = fhour;
  }

  public Long getFmin() {
    return fmin;
  }

  public void setFmin(Long fmin) {
    this.fmin = fmin;
  }

  public Long getPcode() {
    return pcode;
  }

  public void setPcode(Long pcode) {
    this.pcode = pcode;
  }

  public Long getTreatcode() {
    return treatcode;
  }

  public void setTreatcode(Long treatcode) {
    this.treatcode = treatcode;
  }

  public Long getTmstatus() {
    return tmstatus;
  }

  public void setTmstatus(Long tmstatus) {
    this.tmstatus = tmstatus;
  }

  public Long getClvisit() {
    return clvisit;
  }

  public void setClvisit(Long clvisit) {
    this.clvisit = clvisit;
  }

  public java.sql.Timestamp getVisittime() {
    return visittime;
  }

  public void setVisittime(java.sql.Timestamp visittime) {
    this.visittime = visittime;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
  }

  public java.sql.Timestamp getModifydate() {
    return modifydate;
  }

  public void setModifydate(java.sql.Timestamp modifydate) {
    this.modifydate = modifydate;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public Long getReasid() {
    return reasid;
  }

  public void setReasid(Long reasid) {
    this.reasid = reasid;
  }

  public Long getChid() {
    return chid;
  }

  public void setChid(Long chid) {
    this.chid = chid;
  }

  public String getSchlist() {
    return schlist;
  }

  public void setSchlist(String schlist) {
    this.schlist = schlist;
  }

  public Long getSqid() {
    return sqid;
  }

  public void setSqid(Long sqid) {
    this.sqid = sqid;
  }

  public Double getSchamount() {
    return schamount;
  }

  public void setSchamount(Double schamount) {
    this.schamount = schamount;
  }

  public Long getCashid() {
    return cashid;
  }

  public void setCashid(Long cashid) {
    this.cashid = cashid;
  }

  public Long getClcall() {
    return clcall;
  }

  public void setClcall(Long clcall) {
    this.clcall = clcall;
  }

  public java.sql.Timestamp getCalltime() {
    return calltime;
  }

  public void setCalltime(java.sql.Timestamp calltime) {
    this.calltime = calltime;
  }

  public Long getCalcstatus() {
    return calcstatus;
  }

  public void setCalcstatus(Long calcstatus) {
    this.calcstatus = calcstatus;
  }

  public Long getCheckstatus() {
    return checkstatus;
  }

  public void setCheckstatus(Long checkstatus) {
    this.checkstatus = checkstatus;
  }

  public Long getTalonnum() {
    return talonnum;
  }

  public void setTalonnum(Long talonnum) {
    this.talonnum = talonnum;
  }

  public Long getFilial() {
    return filial;
  }

  public void setFilial(Long filial) {
    this.filial = filial;
  }

  public Long getRemfromq() {
    return remfromq;
  }

  public void setRemfromq(Long remfromq) {
    this.remfromq = remfromq;
  }

  public Long getFixhour() {
    return fixhour;
  }

  public void setFixhour(Long fixhour) {
    this.fixhour = fixhour;
  }

  public java.sql.Timestamp getFixdate() {
    return fixdate;
  }

  public void setFixdate(java.sql.Timestamp fixdate) {
    this.fixdate = fixdate;
  }

  public Long getRefid() {
    return refid;
  }

  public void setRefid(Long refid) {
    this.refid = refid;
  }

  public Long getDcode1() {
    return dcode1;
  }

  public void setDcode1(Long dcode1) {
    this.dcode1 = dcode1;
  }

  public Long getAbsencecount() {
    return absencecount;
  }

  public void setAbsencecount(Long absencecount) {
    this.absencecount = absencecount;
  }

  public java.sql.Timestamp getExportdate() {
    return exportdate;
  }

  public void setExportdate(java.sql.Timestamp exportdate) {
    this.exportdate = exportdate;
  }

  public Long getReceipid() {
    return receipid;
  }

  public void setReceipid(Long receipid) {
    this.receipid = receipid;
  }

  public Long getSchedtype() {
    return schedtype;
  }

  public void setSchedtype(Long schedtype) {
    this.schedtype = schedtype;
  }

  public Long getTeamid() {
    return teamid;
  }

  public void setTeamid(Long teamid) {
    this.teamid = teamid;
  }

  public Long getEmid() {
    return emid;
  }

  public void setEmid(Long emid) {
    this.emid = emid;
  }

  public String getRefercomment() {
    return refercomment;
  }

  public void setRefercomment(String refercomment) {
    this.refercomment = refercomment;
  }

  public Long getFromfilial() {
    return fromfilial;
  }

  public void setFromfilial(Long fromfilial) {
    this.fromfilial = fromfilial;
  }

  public String getEmrgcomment() {
    return emrgcomment;
  }

  public void setEmrgcomment(String emrgcomment) {
    this.emrgcomment = emrgcomment;
  }

  public Long getPlanid() {
    return planid;
  }

  public void setPlanid(Long planid) {
    this.planid = planid;
  }

  public Long getCreateuid() {
    return createuid;
  }

  public void setCreateuid(Long createuid) {
    this.createuid = createuid;
  }

  public Long getModifyfilial() {
    return modifyfilial;
  }

  public void setModifyfilial(Long modifyfilial) {
    this.modifyfilial = modifyfilial;
  }

  public Long getCreatorid() {
    return creatorid;
  }

  public void setCreatorid(Long creatorid) {
    this.creatorid = creatorid;
  }

  public java.sql.Timestamp getStarttreat() {
    return starttreat;
  }

  public void setStarttreat(java.sql.Timestamp starttreat) {
    this.starttreat = starttreat;
  }

  public Long getGroupcount() {
    return groupcount;
  }

  public void setGroupcount(Long groupcount) {
    this.groupcount = groupcount;
  }

  public Long getGarantletter() {
    return garantletter;
  }

  public void setGarantletter(Long garantletter) {
    this.garantletter = garantletter;
  }

  public String getGarantnum() {
    return garantnum;
  }

  public void setGarantnum(String garantnum) {
    this.garantnum = garantnum;
  }

  public Long getAgrid() {
    return agrid;
  }

  public void setAgrid(Long agrid) {
    this.agrid = agrid;
  }

  public Long getLstid() {
    return lstid;
  }

  public void setLstid(Long lstid) {
    this.lstid = lstid;
  }

  public java.sql.Timestamp getFinishtreat() {
    return finishtreat;
  }

  public void setFinishtreat(java.sql.Timestamp finishtreat) {
    this.finishtreat = finishtreat;
  }

  public Long getKateg() {
    return kateg;
  }

  public void setKateg(Long kateg) {
    this.kateg = kateg;
  }

  public java.sql.Timestamp getCreatedate() {
    return createdate;
  }

  public void setCreatedate(java.sql.Timestamp createdate) {
    this.createdate = createdate;
  }

//  public Long getReplId() {
//    return replId;
//  }
//
//  public void setReplId(Long replId) {
//    this.replId = replId;
//  }
//
//  public Long getReplGrpid() {
//    return replGrpid;
//  }
//
//  public void setReplGrpid(Long replGrpid) {
//    this.replGrpid = replGrpid;
//  }

  public Long getSchuslid() {
    return schuslid;
  }

  public void setSchuslid(Long schuslid) {
    this.schuslid = schuslid;
  }

  public Long getCalltype() {
    return calltype;
  }

  public void setCalltype(Long calltype) {
    this.calltype = calltype;
  }

  public Long getVisit_uid() {
    return visit_uid;
  }

  public void setVisit_uid(Long visit_uid) {
    this.visit_uid = visit_uid;
  }

  public Long getAnaestype() {
    return anaestype;
  }

  public void setAnaestype(Long anaestype) {
    this.anaestype = anaestype;
  }

  public Long getSms_sent() {
    return sms_sent;
  }

  public void setSms_sent(Long sms_sent) {
    this.sms_sent = sms_sent;
  }

  public String getRinguptime() {
    return ringuptime;
  }

  public void setRinguptime(String ringuptime) {
    this.ringuptime = ringuptime;
  }

  public Long getWaitneartime() {
    return waitneartime;
  }

  public void setWaitneartime(Long waitneartime) {
    this.waitneartime = waitneartime;
  }

  public Long getHistid() {
    return histid;
  }

  public void setHistid(Long histid) {
    this.histid = histid;
  }

  public Long getSectid() {
    return sectid;
  }

  public void setSectid(Long sectid) {
    this.sectid = sectid;
  }

  public Long getSectid2() {
    return sectid2;
  }

  public void setSectid2(Long sectid2) {
    this.sectid2 = sectid2;
  }

  public Long getSpecserv() {
    return specserv;
  }

  public void setSpecserv(Long specserv) {
    this.specserv = specserv;
  }

  public Long getSpecservprice() {
    return specservprice;
  }

  public void setSpecservprice(Long specservprice) {
    this.specservprice = specservprice;
  }

  public Double getSpecproc() {
    return specproc;
  }

  public void setSpecproc(Double specproc) {
    this.specproc = specproc;
  }

  public Double getSpecpriceproc() {
    return specpriceproc;
  }

  public void setSpecpriceproc(Double specpriceproc) {
    this.specpriceproc = specpriceproc;
  }

  public Long getDiscaccum() {
    return discaccum;
  }

  public void setDiscaccum(Long discaccum) {
    this.discaccum = discaccum;
  }

  public Long getSmtdetid() {
    return smtdetid;
  }

  public void setSmtdetid(Long smtdetid) {
    this.smtdetid = smtdetid;
  }

  public Long getDirid() {
    return dirid;
  }

  public void setDirid(Long dirid) {
    this.dirid = dirid;
  }

  public Long getTreatcomplete() {
    return treatcomplete;
  }

  public void setTreatcomplete(Long treatcomplete) {
    this.treatcomplete = treatcomplete;
  }

  public Long getSchedident() {
    return schedident;
  }

  public void setSchedident(Long schedident) {
    this.schedident = schedident;
  }

  public Long getReserveschedid() {
    return reserveschedid;
  }

  public void setReserveschedid(Long reserveschedid) {
    this.reserveschedid = reserveschedid;
  }

  public Long getSchedlevel() {
    return schedlevel;
  }

  public void setSchedlevel(Long schedlevel) {
    this.schedlevel = schedlevel;
  }

  public Long getReprespcode() {
    return represpcode;
  }

  public void setReprespcode(Long represpcode) {
    this.represpcode = represpcode;
  }

  public Long getSufficienttime() {
    return sufficienttime;
  }

  public void setSufficienttime(Long sufficienttime) {
    this.sufficienttime = sufficienttime;
  }

  public String getTmstatuscomment() {
    return tmstatuscomment;
  }

  public void setTmstatuscomment(String tmstatuscomment) {
    this.tmstatuscomment = tmstatuscomment;
  }

  public Long getFrompid() {
    return frompid;
  }

  public void setFrompid(Long frompid) {
    this.frompid = frompid;
  }

  public Long getQuid() {
    return quid;
  }

  public void setQuid(Long quid) {
    this.quid = quid;
  }

  public Long getProtocolid() {
    return protocolid;
  }

  public void setProtocolid(Long protocolid) {
    this.protocolid = protocolid;
  }

  public Long getLivequeue() {
    return livequeue;
  }

  public void setLivequeue(Long livequeue) {
    this.livequeue = livequeue;
  }

  public Long getQueuenum() {
    return queuenum;
  }

  public void setQueuenum(Long queuenum) {
    this.queuenum = queuenum;
  }

  public String getDisccard() {
    return disccard;
  }

  public void setDisccard(String disccard) {
    this.disccard = disccard;
  }

  public String getDisccardnum() {
    return disccardnum;
  }

  public void setDisccardnum(String disccardnum) {
    this.disccardnum = disccardnum;
  }

  public Long getBonussyst() {
    return bonussyst;
  }

  public void setBonussyst(Long bonussyst) {
    this.bonussyst = bonussyst;
  }

  public Long getBooktype() {
    return booktype;
  }

  public void setBooktype(Long booktype) {
    this.booktype = booktype;
  }

  public Long getRepreshisttype() {
    return represhisttype;
  }

  public void setRepreshisttype(Long represhisttype) {
    this.represhisttype = represhisttype;
  }

  public Long getOnlinetype() {
    return onlinetype;
  }

  public void setOnlinetype(Long onlinetype) {
    this.onlinetype = onlinetype;
  }

  public Long getParentschedid() {
    return parentschedid;
  }

  public void setParentschedid(Long parentschedid) {
    this.parentschedid = parentschedid;
  }

  public java.sql.Timestamp getVisitcalltime() {
    return visitcalltime;
  }

  public void setVisitcalltime(java.sql.Timestamp visitcalltime) {
    this.visitcalltime = visitcalltime;
  }

  public java.sql.Timestamp getTransftime() {
    return transftime;
  }

  public void setTransftime(java.sql.Timestamp transftime) {
    this.transftime = transftime;
  }

  public String getCallerid() {
    return callerid;
  }

  public void setCallerid(String callerid) {
    this.callerid = callerid;
  }

  public Long getPlantype() {
    return plantype;
  }

  public void setPlantype(Long plantype) {
    this.plantype = plantype;
  }

  public Long getDailyplanfilial() {
    return dailyplanfilial;
  }

  public void setDailyplanfilial(Long dailyplanfilial) {
    this.dailyplanfilial = dailyplanfilial;
  }

  public Long getPlan_createmode() {
    return plan_createmode;
  }

  public void setPlan_createmode(Long plan_createmode) {
    this.plan_createmode = plan_createmode;
  }

  public Long getTreatfilial() {
    return treatfilial;
  }

  public void setTreatfilial(Long treatfilial) {
    this.treatfilial = treatfilial;
  }

  @Override
  public String toString() {
    return "Schedule{" +
            "schedid=" + schedid +
            ", dcode=" + dcode +
            ", workdate=" + workdate +
            ", bhour=" + bhour +
            ", bmin=" + bmin +
            ", fhour=" + fhour +
            ", fmin=" + fmin +
            ", pcode=" + pcode +
            ", treatcode=" + treatcode +
            ", tmstatus=" + tmstatus +
            ", clvisit=" + clvisit +
            ", visittime=" + visittime +
            ", comment='" + comment + '\'' +
            ", uid=" + uid +
            ", modifydate=" + modifydate +
            ", status=" + status +
            ", reasid=" + reasid +
            ", chid=" + chid +
            ", schlist='" + schlist + '\'' +
            ", sqid=" + sqid +
            ", schamount=" + schamount +
            ", cashid=" + cashid +
            ", clcall=" + clcall +
            ", calltime=" + calltime +
            ", calcstatus=" + calcstatus +
            ", checkstatus=" + checkstatus +
            ", talonnum=" + talonnum +
            ", filial=" + filial +
            ", remfromq=" + remfromq +
            ", fixhour=" + fixhour +
            ", fixdate=" + fixdate +
            ", refid=" + refid +
            ", dcode1=" + dcode1 +
            ", absencecount=" + absencecount +
            ", exportdate=" + exportdate +
            ", receipid=" + receipid +
            ", schedtype=" + schedtype +
            ", teamid=" + teamid +
            ", emid=" + emid +
            ", refercomment='" + refercomment + '\'' +
            ", fromfilial=" + fromfilial +
            ", emrgcomment='" + emrgcomment + '\'' +
            ", planid=" + planid +
            ", createuid=" + createuid +
            ", modifyfilial=" + modifyfilial +
            ", creatorid=" + creatorid +
            ", starttreat=" + starttreat +
            ", groupcount=" + groupcount +
            ", garantletter=" + garantletter +
            ", garantnum='" + garantnum + '\'' +
            ", agrid=" + agrid +
            ", lstid=" + lstid +
            ", finishtreat=" + finishtreat +
            ", kateg=" + kateg +
            ", createdate=" + createdate +
//            ", replId=" + replId +
//            ", replGrpid=" + replGrpid +
            ", schuslid=" + schuslid +
            ", calltype=" + calltype +
            ", visit_uid=" + visit_uid +
            ", anaestype=" + anaestype +
            ", sms_sent=" + sms_sent +
            ", ringuptime='" + ringuptime + '\'' +
            ", waitneartime=" + waitneartime +
            ", histid=" + histid +
            ", sectid=" + sectid +
            ", sectid2=" + sectid2 +
            ", specserv=" + specserv +
            ", specservprice=" + specservprice +
            ", specproc=" + specproc +
            ", specpriceproc=" + specpriceproc +
            ", discaccum=" + discaccum +
            ", smtdetid=" + smtdetid +
            ", dirid=" + dirid +
            ", treatcomplete=" + treatcomplete +
            ", schedident=" + schedident +
            ", reserveschedid=" + reserveschedid +
            ", schedlevel=" + schedlevel +
            ", represpcode=" + represpcode +
            ", sufficienttime=" + sufficienttime +
            ", tmstatuscomment='" + tmstatuscomment + '\'' +
            ", frompid=" + frompid +
            ", quid=" + quid +
            ", protocolid=" + protocolid +
            ", livequeue=" + livequeue +
            ", queuenum=" + queuenum +
            ", disccard='" + disccard + '\'' +
            ", disccardnum='" + disccardnum + '\'' +
            ", bonussyst=" + bonussyst +
            ", booktype=" + booktype +
            ", represhisttype=" + represhisttype +
            ", onlinetype=" + onlinetype +
            ", parentschedid=" + parentschedid +
            ", visitcalltime=" + visitcalltime +
            ", transftime=" + transftime +
            ", callerid='" + callerid + '\'' +
            ", plantype=" + plantype +
            ", dailyplanfilial=" + dailyplanfilial +
            ", plan_createmode=" + plan_createmode +
            ", treatfilial=" + treatfilial +
            '}';
  }
}
