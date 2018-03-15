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
  private Long jid;
  private String dbalias;
  private Long pricejid;
  private String dbpath;
  private String dbipaddr;
  private Long dbport;
  private String dbpath2;
  
  private String extlabcode;
  private Long grpid;
  private Long bottomgen;
  private Long topgen;
  private String mediaid;
  private String labsecretkey;


  public Filials() {}

  public Long getFilid() {
    return filid;
  }

  public void setFilid(Long filid) {
    this.filid = filid;
  }



  public Long getJid() {
    return jid;
  }

  public void setJid(Long jid) {
    this.jid = jid;
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



  public String getDbpath2() {
    return dbpath2;
  }

  public void setDbpath2(String dbpath2) {
    this.dbpath2 = dbpath2;
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



  public String getLabsecretkey() {
    return labsecretkey;
  }

  public void setLabsecretkey(String labsecretkey) {
    this.labsecretkey = labsecretkey;
  }

}
