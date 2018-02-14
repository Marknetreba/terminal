package com.infoterminal.infoterminal.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "FILIALS")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Filials implements Serializable {
  
  @Id
  @GeneratedValue
  private Long filid;
  private String shortname;
  private String fullname;
  private Long jid;
  private Long fcolor;
  private String dbalias;
  private Long pricejid;
  private Long ismain;
  private String dbpath;
  private String dbipaddr;
  private Long dbport;
  private Long callcentre;
  private String dbpath2;
  
//  private Long replId;
//  private Long replGrpid;
  
  private Long connecttimeout;
  private String archivebase;
  private String mediabase;
  private Long filial_group_ignore;
  private Long dis_in_schedule;
  private String defimagepath;
  private String lpucode;
  private Long speclpucode;
  private Long tid;
  private String trmask;
  private Long mainpacspid;
  private Long diagnosticfilial;
  private String er_placeid;
  private String er_authtoken;
  private Long viewinweb;
  private Long showcashref;
  private Long addrid;
  private String extlabcode;
  private Long grpid;
  private Long sitegrpid;
  private Long matappfilialtype;
  private Long matappfilial;
  private Long iconid;
  private String webname;
  private Long bottomgen;
  private Long topgen;
  private String mediaid;
  private String instructions;
  private String instructtitle;
  private String intructionipaddr;
  private Long sched_filial_group_id;
  private String wspath;
  private String labsecretkey;
  private Long onlinetype;
  private Long timezone;
  private Long viewpriceinweb;
  private String webpricename;

  public Filials() {}

  public Long getFilid() {
    return filid;
  }

  public void setFilid(Long filid) {
    this.filid = filid;
  }

  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public Long getJid() {
    return jid;
  }

  public void setJid(Long jid) {
    this.jid = jid;
  }

  public Long getFcolor() {
    return fcolor;
  }

  public void setFcolor(Long fcolor) {
    this.fcolor = fcolor;
  }

  public String getDbalias() {
    return dbalias;
  }

  public void setDbalias(String dbalias) {
    this.dbalias = dbalias;
  }

  public Long getPricejid() {
    return pricejid;
  }

  public void setPricejid(Long pricejid) {
    this.pricejid = pricejid;
  }

  public Long getIsmain() {
    return ismain;
  }

  public void setIsmain(Long ismain) {
    this.ismain = ismain;
  }

  public String getDbpath() {
    return dbpath;
  }

  public void setDbpath(String dbpath) {
    this.dbpath = dbpath;
  }

  public String getDbipaddr() {
    return dbipaddr;
  }

  public void setDbipaddr(String dbipaddr) {
    this.dbipaddr = dbipaddr;
  }

  public Long getDbport() {
    return dbport;
  }

  public void setDbport(Long dbport) {
    this.dbport = dbport;
  }

  public Long getCallcentre() {
    return callcentre;
  }

  public void setCallcentre(Long callcentre) {
    this.callcentre = callcentre;
  }

  public String getDbpath2() {
    return dbpath2;
  }

  public void setDbpath2(String dbpath2) {
    this.dbpath2 = dbpath2;
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
  

  public Long getConnecttimeout() {
    return connecttimeout;
  }

  public void setConnecttimeout(Long connecttimeout) {
    this.connecttimeout = connecttimeout;
  }

  public String getArchivebase() {
    return archivebase;
  }

  public void setArchivebase(String archivebase) {
    this.archivebase = archivebase;
  }

  public String getMediabase() {
    return mediabase;
  }

  public void setMediabase(String mediabase) {
    this.mediabase = mediabase;
  }

  public Long getFilial_group_ignore() {
    return filial_group_ignore;
  }

  public void setFilial_group_ignore(Long filial_group_ignore) {
    this.filial_group_ignore = filial_group_ignore;
  }

  public Long getDis_in_schedule() {
    return dis_in_schedule;
  }

  public void setDis_in_schedule(Long dis_in_schedule) {
    this.dis_in_schedule = dis_in_schedule;
  }

  public String getDefimagepath() {
    return defimagepath;
  }

  public void setDefimagepath(String defimagepath) {
    this.defimagepath = defimagepath;
  }

  public String getLpucode() {
    return lpucode;
  }

  public void setLpucode(String lpucode) {
    this.lpucode = lpucode;
  }

  public Long getSpeclpucode() {
    return speclpucode;
  }

  public void setSpeclpucode(Long speclpucode) {
    this.speclpucode = speclpucode;
  }

  public Long getTid() {
    return tid;
  }

  public void setTid(Long tid) {
    this.tid = tid;
  }

  public String getTrmask() {
    return trmask;
  }

  public void setTrmask(String trmask) {
    this.trmask = trmask;
  }

  public Long getMainpacspid() {
    return mainpacspid;
  }

  public void setMainpacspid(Long mainpacspid) {
    this.mainpacspid = mainpacspid;
  }

  public Long getDiagnosticfilial() {
    return diagnosticfilial;
  }

  public void setDiagnosticfilial(Long diagnosticfilial) {
    this.diagnosticfilial = diagnosticfilial;
  }

  public String getEr_placeid() {
    return er_placeid;
  }

  public void setEr_placeid(String er_placeid) {
    this.er_placeid = er_placeid;
  }

  public String getEr_authtoken() {
    return er_authtoken;
  }

  public void setEr_authtoken(String er_authtoken) {
    this.er_authtoken = er_authtoken;
  }

  public Long getViewinweb() {
    return viewinweb;
  }

  public void setViewinweb(Long viewinweb) {
    this.viewinweb = viewinweb;
  }

  public Long getShowcashref() {
    return showcashref;
  }

  public void setShowcashref(Long showcashref) {
    this.showcashref = showcashref;
  }

  public Long getAddrid() {
    return addrid;
  }

  public void setAddrid(Long addrid) {
    this.addrid = addrid;
  }

  public String getExtlabcode() {
    return extlabcode;
  }

  public void setExtlabcode(String extlabcode) {
    this.extlabcode = extlabcode;
  }

  public Long getGrpid() {
    return grpid;
  }

  public void setGrpid(Long grpid) {
    this.grpid = grpid;
  }

  public Long getSitegrpid() {
    return sitegrpid;
  }

  public void setSitegrpid(Long sitegrpid) {
    this.sitegrpid = sitegrpid;
  }

  public Long getMatappfilialtype() {
    return matappfilialtype;
  }

  public void setMatappfilialtype(Long matappfilialtype) {
    this.matappfilialtype = matappfilialtype;
  }

  public Long getMatappfilial() {
    return matappfilial;
  }

  public void setMatappfilial(Long matappfilial) {
    this.matappfilial = matappfilial;
  }

  public Long getIconid() {
    return iconid;
  }

  public void setIconid(Long iconid) {
    this.iconid = iconid;
  }

  public String getWebname() {
    return webname;
  }

  public void setWebname(String webname) {
    this.webname = webname;
  }

  public Long getBottomgen() {
    return bottomgen;
  }

  public void setBottomgen(Long bottomgen) {
    this.bottomgen = bottomgen;
  }

  public Long getTopgen() {
    return topgen;
  }

  public void setTopgen(Long topgen) {
    this.topgen = topgen;
  }

  public String getMediaid() {
    return mediaid;
  }

  public void setMediaid(String mediaid) {
    this.mediaid = mediaid;
  }

  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public String getInstructtitle() {
    return instructtitle;
  }

  public void setInstructtitle(String instructtitle) {
    this.instructtitle = instructtitle;
  }

  public String getIntructionipaddr() {
    return intructionipaddr;
  }

  public void setIntructionipaddr(String intructionipaddr) {
    this.intructionipaddr = intructionipaddr;
  }

  public Long getSched_filial_group_id() {
    return sched_filial_group_id;
  }

  public void setSched_filial_group_id(Long sched_filial_group_id) {
    this.sched_filial_group_id = sched_filial_group_id;
  }

  public String getWspath() {
    return wspath;
  }

  public void setWspath(String wspath) {
    this.wspath = wspath;
  }

  public String getLabsecretkey() {
    return labsecretkey;
  }

  public void setLabsecretkey(String labsecretkey) {
    this.labsecretkey = labsecretkey;
  }

  public Long getOnlinetype() {
    return onlinetype;
  }

  public void setOnlinetype(Long onlinetype) {
    this.onlinetype = onlinetype;
  }

  public Long getTimezone() {
    return timezone;
  }

  public void setTimezone(Long timezone) {
    this.timezone = timezone;
  }

  public Long getViewpriceinweb() {
    return viewpriceinweb;
  }

  public void setViewpriceinweb(Long viewpriceinweb) {
    this.viewpriceinweb = viewpriceinweb;
  }

  public String getWebpricename() {
    return webpricename;
  }

  public void setWebpricename(String webpricename) {
    this.webpricename = webpricename;
  }

  @Override
  public String toString() {
    return "Filials{" +
            "filid=" + filid +
            ", shortname='" + shortname + '\'' +
            ", fullname='" + fullname + '\'' +
            ", jid=" + jid +
            ", fcolor=" + fcolor +
            ", dbalias='" + dbalias + '\'' +
            ", pricejid=" + pricejid +
            ", ismain=" + ismain +
            ", dbpath='" + dbpath + '\'' +
            ", dbipaddr='" + dbipaddr + '\'' +
            ", dbport=" + dbport +
            ", callcentre=" + callcentre +
            ", dbpath2='" + dbpath2 + '\'' +
//            ", replId=" + replId +
//            ", replGrpid=" + replGrpid +
            ", connecttimeout=" + connecttimeout +
            ", archivebase='" + archivebase + '\'' +
            ", mediabase='" + mediabase + '\'' +
            ", filial_group_ignore=" + filial_group_ignore +
            ", dis_in_schedule=" + dis_in_schedule +
            ", defimagepath='" + defimagepath + '\'' +
            ", lpucode='" + lpucode + '\'' +
            ", speclpucode=" + speclpucode +
            ", tid=" + tid +
            ", trmask='" + trmask + '\'' +
            ", mainpacspid=" + mainpacspid +
            ", diagnosticfilial=" + diagnosticfilial +
            ", er_placeid='" + er_placeid + '\'' +
            ", er_authtoken='" + er_authtoken + '\'' +
            ", viewinweb=" + viewinweb +
            ", showcashref=" + showcashref +
            ", addrid=" + addrid +
            ", extlabcode='" + extlabcode + '\'' +
            ", grpid=" + grpid +
            ", sitegrpid=" + sitegrpid +
            ", matappfilialtype=" + matappfilialtype +
            ", matappfilial=" + matappfilial +
            ", iconid=" + iconid +
            ", webname='" + webname + '\'' +
            ", bottomgen=" + bottomgen +
            ", topgen=" + topgen +
            ", mediaid='" + mediaid + '\'' +
            ", instructions='" + instructions + '\'' +
            ", instructtitle='" + instructtitle + '\'' +
            ", intructionipaddr='" + intructionipaddr + '\'' +
            ", sched_filial_group_id=" + sched_filial_group_id +
            ", wspath='" + wspath + '\'' +
            ", labsecretkey='" + labsecretkey + '\'' +
            ", onlinetype=" + onlinetype +
            ", timezone=" + timezone +
            ", viewpriceinweb=" + viewpriceinweb +
            ", webpricename='" + webpricename + '\'' +
            '}';
  }
}
