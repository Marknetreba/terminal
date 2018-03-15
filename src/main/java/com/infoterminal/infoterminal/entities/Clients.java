package com.infoterminal.infoterminal.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "CLIENTS")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Clients implements Serializable {
  @Id
  private Long pcode;
  private Long filial;
  private String lastname;
  private String firstname;
  private String midname;
  private String phone1;
  private String phone2;
  private String phone3;
  private Date bdate;
  private String fullname;
  
  //Additional params
  private Long bhour;
  private Long bmin;
  private Long fhour;
  private Long fmin;
  private String chname;
  private String time;
  private String docname;
  private Integer clvisit;
  private Integer schedid;
  private Long cashid;
  private Long dcode;
  private Long chid;
  private Long shedident;


  public Clients() {}


  public Long getPcode() {
    return pcode;
  }

  public void setPcode(Long pcode) {
    this.pcode = pcode;
  }

  public Long getFilial() {
    return filial;
  }

  public void setFilial(Long filial) {
    this.filial = filial;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getMidname() {
    return midname;
  }

  public void setMidname(String midname) {
    this.midname = midname;
  }

  public String getPhone1() {
    return phone1;
  }

  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }

  public String getPhone2() {
    return phone2;
  }

  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }

  public String getPhone3() {
    return phone3;
  }

  public void setPhone3(String phone3) {
    this.phone3 = phone3;
  }

  public Date getBdate() {
    return bdate;
  }

  public void setBdate(Date bdate) {
    this.bdate = bdate;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
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

  public String getChname() {
    return chname;
  }

  public void setChname(String chname) {
    this.chname = chname;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getDocname() {
    return docname;
  }

  public void setDocname(String docname) {
    this.docname = docname;
  }

  public Integer getClvisit() {
    return clvisit;
  }

  public void setClvisit(Integer clvisit) {
    this.clvisit = clvisit;
  }

  public Integer getSchedid() { return schedid; }

  public void setSchedid(Integer schedid) {
    this.schedid = schedid;
  }

  public Long getCashid() {
    return cashid;
  }

  public void setCashid(Long cashid) {
    this.cashid = cashid;
  }

  public Long getDcode() {
    return dcode;
  }

  public void setDcode(Long dcode) {
    this.dcode = dcode;
  }

  public Long getChid() {
    return chid;
  }

  public void setChid(Long chid) {
    this.chid = chid;
  }

  public Long getShedident() {
    return shedident;
  }

  public void setShedident(Long shedident) {
    this.shedident = shedident;
  }
}
