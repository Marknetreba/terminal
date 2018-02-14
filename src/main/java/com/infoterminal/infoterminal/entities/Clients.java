package com.infoterminal.infoterminal.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

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
  private String pager;
  private Long pol;
  private java.sql.Timestamp bdate;
  private String doctors;
  private String fullname;
  private Long nomilk;
  private String comment;
  private Long clientdis;
  private Long res1;
  private String specnum;
  private Long grtype;
  private String prof;
  private Long rcode;
  private String nsp;
  private Long byear;
  private String histnum;
  private Long laststate;
  private java.sql.Timestamp statedate;
  private Long statedoctor;
  private Long jid;
  private java.sql.Timestamp nspdate;
  private java.sql.Timestamp dateenter;
  private java.sql.Timestamp dateexit;
  private Long grpcode;
  private String omsnum;
  private String omsser;
  private java.sql.Timestamp omsdate;
  private Long omsjid;
  private Long isworked;
  private Long status;
  private String res2;
  private Long lstid;
  private Long cstatus;
  private Long uid;
  private java.sql.Timestamp modifydate;
  private String paspser;
  private String paspnum;
  private String paspplace;
  private Long kodter;
  private Long hfamily;
  private Double startsum;
  private String obpom;
  private Long sectid;
  private java.sql.Timestamp firstobsled;
  private Long ownerdcode;
  private Long externpcode;
  private Long typestatus;
  private Long agestatus;
  private String addr;
  private String adrindex;
  private String city;
  private String streetname;
  private String corp;
  private String flat;
  private String addrfull;
  private String klcode;
  private Long allergy;
  private Long specserv;
  private Long discaccum;
  private Double startsumrub;
  private String workplace;
  private String disccard;
  private Long extdcode;
  private java.sql.Timestamp createdate;
  private String pensnum;
  private java.sql.Timestamp exportdate;
  private Long fupgrade;
  private Long odusesum;
  private Long oduseproc;
  private Long odcurrenc;
  private Long odsumv;
  private Long odprocv;
  private Long clinicid;
  private String cars;
  private Long levelgroup;
  private Long persontype;
  private Long jpid;
  private String codelimits;
  private String clmail;
  private Long nazndis;
  private String hidecomment;
  private Long receipid;
  private Long limitsignore;
  private Long planscount;
  private Long grstreet;
  private String snils;
  private java.sql.Timestamp paspdate;
  private Long dcode1;
  private Long jid0;
  private java.sql.Timestamp lastdateexit;
  private Long checkinmaindb;
  private Long reklagrid;
  private Long docscount;
  private Long isemployeer;
  private Long educat;
  private String flang;
  private String famstatus;
  private Long nacional;
  private Long scstepen;
  private String inn;
  private String bplace;
  private String region;
  private String naselpun;
  private String streettype;
  private String parentsfio;
  private String schedfilials;
  private Long treatcode;
  private Long cardplace;
  private Long tradeclient;
  private Long pjid;
  private Long pdepnum;
  private Long staj;
  private Long profid;
  private Long isplanmec;
  private Long fromoldbase;
  private Long obmencard;
  private String fullname2;
  private java.sql.Timestamp datecancel;
  private String prof_vred;
  private Long jpcontact;
  private Long workplaceid;
  private Long jpaystat;
  private Long talks_dcode;
  private Long dcode_consult;
  private Long replId;
  private Long replGrpid;
  private String linkcode;
  private String addhistnum;
  private Long pr_clienttype;
  private String reklcomment;
  private Long rekldcode;
  private Long locktype;
  private Long refusecall;
  private Long reklpcode;
  private String descname;
  private Long nationalid;
  private String clientpass;
  private Long refuseaddr;
  private Long pasptype;
  private String paspother;
  private String adrindex_f;
  private Long kodter_f;
  private String region_f;
  private String naselpun_f;
  private String city_f;
  private String streetname_f;
  private String addr_f;
  private String corp_f;
  private String kladr_addrfull;
  private String flat_f;
  private java.sql.Timestamp adrregdate;
  private Long refusesms;
  private Long dmsid;
  private Long kodter_reg;
  private String adrindex_reg;
  private String city_reg;
  private String streetname_reg;
  private String addr_reg;
  private String corp_reg;
  private String flat_reg;
  private String klcode_reg;
  private String kladr_addrfull_reg;
  private String birthplace;
  private String paspdepcode;
  private java.sql.Timestamp regdate;
  private String build;
  private String build_reg;
  private String profpost;
  private Long worktypeid;
  private Long regid;
  private String clpassword;
  private String cllogin;
  private Long sendprotbymail;
  private Long protaccesspin;
  private String phoneaccessword;
  private Long inscompaccess;
  private java.sql.Timestamp omsfdate;
  private Long isnovor;
  private Long progserv;
  private Long socid;
  private String clwebcode;
  private String ocatd;
  private String ocatd_reg;
  private Long districtid;
  private Long districtid_reg;
  private String preplastname;
  private String prepfirstname;
  private String prepmidname;
  private String prepfullname;
  private Long anonymous;
  private String anonymousnum;
  private String addrentrance;
  private String addrfloor;
  private String addrcode;
  private Long webaccesstype;
  private Long webschedtype;
  private Long webhisttype;
  private Long clpasstype;
  private Long refuseclmail;
  private Long webpaytype;
  private String normlastname;
  private String normfirstname;
  private String normmidname;
  private String normfullname;
  private String extcontactcode;
  private Long deathstatus;
  private java.sql.Date deathdate;
  private java.sql.Time deathtime;
  private Long deathprotocolid;
  private Long deathdirid;
  private java.sql.Date deathfixdate;
  private Long snils_check_type;
  private Long uiastype;
  private String addrroom;
  private String addrroom_reg;
  private Long familystatus;
  private Long education;
  private Long newborncode;
  private String lpucheckreq;

  public Clients() {
  }

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

  public String getPager() {
    return pager;
  }

  public void setPager(String pager) {
    this.pager = pager;
  }

  public Long getPol() {
    return pol;
  }

  public void setPol(Long pol) {
    this.pol = pol;
  }

  public java.sql.Timestamp getBdate() {
    return bdate;
  }

  public void setBdate(java.sql.Timestamp bdate) {
    this.bdate = bdate;
  }

  public String getDoctors() {
    return doctors;
  }

  public void setDoctors(String doctors) {
    this.doctors = doctors;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public Long getNomilk() {
    return nomilk;
  }

  public void setNomilk(Long nomilk) {
    this.nomilk = nomilk;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Long getClientdis() {
    return clientdis;
  }

  public void setClientdis(Long clientdis) {
    this.clientdis = clientdis;
  }

  public Long getRes1() {
    return res1;
  }

  public void setRes1(Long res1) {
    this.res1 = res1;
  }

  public String getSpecnum() {
    return specnum;
  }

  public void setSpecnum(String specnum) {
    this.specnum = specnum;
  }

  public Long getGrtype() {
    return grtype;
  }

  public void setGrtype(Long grtype) {
    this.grtype = grtype;
  }

  public String getProf() {
    return prof;
  }

  public void setProf(String prof) {
    this.prof = prof;
  }

  public Long getRcode() {
    return rcode;
  }

  public void setRcode(Long rcode) {
    this.rcode = rcode;
  }

  public String getNsp() {
    return nsp;
  }

  public void setNsp(String nsp) {
    this.nsp = nsp;
  }

  public Long getByear() {
    return byear;
  }

  public void setByear(Long byear) {
    this.byear = byear;
  }

  public String getHistnum() {
    return histnum;
  }

  public void setHistnum(String histnum) {
    this.histnum = histnum;
  }

  public Long getLaststate() {
    return laststate;
  }

  public void setLaststate(Long laststate) {
    this.laststate = laststate;
  }

  public java.sql.Timestamp getStatedate() {
    return statedate;
  }

  public void setStatedate(java.sql.Timestamp statedate) {
    this.statedate = statedate;
  }

  public Long getStatedoctor() {
    return statedoctor;
  }

  public void setStatedoctor(Long statedoctor) {
    this.statedoctor = statedoctor;
  }

  public Long getJid() {
    return jid;
  }

  public void setJid(Long jid) {
    this.jid = jid;
  }

  public java.sql.Timestamp getNspdate() {
    return nspdate;
  }

  public void setNspdate(java.sql.Timestamp nspdate) {
    this.nspdate = nspdate;
  }

  public java.sql.Timestamp getDateenter() {
    return dateenter;
  }

  public void setDateenter(java.sql.Timestamp dateenter) {
    this.dateenter = dateenter;
  }

  public java.sql.Timestamp getDateexit() {
    return dateexit;
  }

  public void setDateexit(java.sql.Timestamp dateexit) {
    this.dateexit = dateexit;
  }

  public Long getGrpcode() {
    return grpcode;
  }

  public void setGrpcode(Long grpcode) {
    this.grpcode = grpcode;
  }

  public String getOmsnum() {
    return omsnum;
  }

  public void setOmsnum(String omsnum) {
    this.omsnum = omsnum;
  }

  public String getOmsser() {
    return omsser;
  }

  public void setOmsser(String omsser) {
    this.omsser = omsser;
  }

  public java.sql.Timestamp getOmsdate() {
    return omsdate;
  }

  public void setOmsdate(java.sql.Timestamp omsdate) {
    this.omsdate = omsdate;
  }

  public Long getOmsjid() {
    return omsjid;
  }

  public void setOmsjid(Long omsjid) {
    this.omsjid = omsjid;
  }

  public Long getIsworked() {
    return isworked;
  }

  public void setIsworked(Long isworked) {
    this.isworked = isworked;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public String getRes2() {
    return res2;
  }

  public void setRes2(String res2) {
    this.res2 = res2;
  }

  public Long getLstid() {
    return lstid;
  }

  public void setLstid(Long lstid) {
    this.lstid = lstid;
  }

  public Long getCstatus() {
    return cstatus;
  }

  public void setCstatus(Long cstatus) {
    this.cstatus = cstatus;
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

  public String getPaspser() {
    return paspser;
  }

  public void setPaspser(String paspser) {
    this.paspser = paspser;
  }

  public String getPaspnum() {
    return paspnum;
  }

  public void setPaspnum(String paspnum) {
    this.paspnum = paspnum;
  }

  public String getPaspplace() {
    return paspplace;
  }

  public void setPaspplace(String paspplace) {
    this.paspplace = paspplace;
  }

  public Long getKodter() {
    return kodter;
  }

  public void setKodter(Long kodter) {
    this.kodter = kodter;
  }

  public Long getHfamily() {
    return hfamily;
  }

  public void setHfamily(Long hfamily) {
    this.hfamily = hfamily;
  }

  public Double getStartsum() {
    return startsum;
  }

  public void setStartsum(Double startsum) {
    this.startsum = startsum;
  }

  public String getObpom() {
    return obpom;
  }

  public void setObpom(String obpom) {
    this.obpom = obpom;
  }

  public Long getSectid() {
    return sectid;
  }

  public void setSectid(Long sectid) {
    this.sectid = sectid;
  }

  public java.sql.Timestamp getFirstobsled() {
    return firstobsled;
  }

  public void setFirstobsled(java.sql.Timestamp firstobsled) {
    this.firstobsled = firstobsled;
  }

  public Long getOwnerdcode() {
    return ownerdcode;
  }

  public void setOwnerdcode(Long ownerdcode) {
    this.ownerdcode = ownerdcode;
  }

  public Long getExternpcode() {
    return externpcode;
  }

  public void setExternpcode(Long externpcode) {
    this.externpcode = externpcode;
  }

  public Long getTypestatus() {
    return typestatus;
  }

  public void setTypestatus(Long typestatus) {
    this.typestatus = typestatus;
  }

  public Long getAgestatus() {
    return agestatus;
  }

  public void setAgestatus(Long agestatus) {
    this.agestatus = agestatus;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public String getAdrindex() {
    return adrindex;
  }

  public void setAdrindex(String adrindex) {
    this.adrindex = adrindex;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreetname() {
    return streetname;
  }

  public void setStreetname(String streetname) {
    this.streetname = streetname;
  }

  public String getCorp() {
    return corp;
  }

  public void setCorp(String corp) {
    this.corp = corp;
  }

  public String getFlat() {
    return flat;
  }

  public void setFlat(String flat) {
    this.flat = flat;
  }

  public String getAddrfull() {
    return addrfull;
  }

  public void setAddrfull(String addrfull) {
    this.addrfull = addrfull;
  }

  public String getKlcode() {
    return klcode;
  }

  public void setKlcode(String klcode) {
    this.klcode = klcode;
  }

  public Long getAllergy() {
    return allergy;
  }

  public void setAllergy(Long allergy) {
    this.allergy = allergy;
  }

  public Long getSpecserv() {
    return specserv;
  }

  public void setSpecserv(Long specserv) {
    this.specserv = specserv;
  }

  public Long getDiscaccum() {
    return discaccum;
  }

  public void setDiscaccum(Long discaccum) {
    this.discaccum = discaccum;
  }

  public Double getStartsumrub() {
    return startsumrub;
  }

  public void setStartsumrub(Double startsumrub) {
    this.startsumrub = startsumrub;
  }

  public String getWorkplace() {
    return workplace;
  }

  public void setWorkplace(String workplace) {
    this.workplace = workplace;
  }

  public String getDisccard() {
    return disccard;
  }

  public void setDisccard(String disccard) {
    this.disccard = disccard;
  }

  public Long getExtdcode() {
    return extdcode;
  }

  public void setExtdcode(Long extdcode) {
    this.extdcode = extdcode;
  }

  public java.sql.Timestamp getCreatedate() {
    return createdate;
  }

  public void setCreatedate(java.sql.Timestamp createdate) {
    this.createdate = createdate;
  }

  public String getPensnum() {
    return pensnum;
  }

  public void setPensnum(String pensnum) {
    this.pensnum = pensnum;
  }

  public java.sql.Timestamp getExportdate() {
    return exportdate;
  }

  public void setExportdate(java.sql.Timestamp exportdate) {
    this.exportdate = exportdate;
  }

  public Long getFupgrade() {
    return fupgrade;
  }

  public void setFupgrade(Long fupgrade) {
    this.fupgrade = fupgrade;
  }

  public Long getOdusesum() {
    return odusesum;
  }

  public void setOdusesum(Long odusesum) {
    this.odusesum = odusesum;
  }

  public Long getOduseproc() {
    return oduseproc;
  }

  public void setOduseproc(Long oduseproc) {
    this.oduseproc = oduseproc;
  }

  public Long getOdcurrenc() {
    return odcurrenc;
  }

  public void setOdcurrenc(Long odcurrenc) {
    this.odcurrenc = odcurrenc;
  }

  public Long getOdsumv() {
    return odsumv;
  }

  public void setOdsumv(Long odsumv) {
    this.odsumv = odsumv;
  }

  public Long getOdprocv() {
    return odprocv;
  }

  public void setOdprocv(Long odprocv) {
    this.odprocv = odprocv;
  }

  public Long getClinicid() {
    return clinicid;
  }

  public void setClinicid(Long clinicid) {
    this.clinicid = clinicid;
  }

  public String getCars() {
    return cars;
  }

  public void setCars(String cars) {
    this.cars = cars;
  }

  public Long getLevelgroup() {
    return levelgroup;
  }

  public void setLevelgroup(Long levelgroup) {
    this.levelgroup = levelgroup;
  }

  public Long getPersontype() {
    return persontype;
  }

  public void setPersontype(Long persontype) {
    this.persontype = persontype;
  }

  public Long getJpid() {
    return jpid;
  }

  public void setJpid(Long jpid) {
    this.jpid = jpid;
  }

  public String getCodelimits() {
    return codelimits;
  }

  public void setCodelimits(String codelimits) {
    this.codelimits = codelimits;
  }

  public String getClmail() {
    return clmail;
  }

  public void setClmail(String clmail) {
    this.clmail = clmail;
  }

  public Long getNazndis() {
    return nazndis;
  }

  public void setNazndis(Long nazndis) {
    this.nazndis = nazndis;
  }

  public String getHidecomment() {
    return hidecomment;
  }

  public void setHidecomment(String hidecomment) {
    this.hidecomment = hidecomment;
  }

  public Long getReceipid() {
    return receipid;
  }

  public void setReceipid(Long receipid) {
    this.receipid = receipid;
  }

  public Long getLimitsignore() {
    return limitsignore;
  }

  public void setLimitsignore(Long limitsignore) {
    this.limitsignore = limitsignore;
  }

  public Long getPlanscount() {
    return planscount;
  }

  public void setPlanscount(Long planscount) {
    this.planscount = planscount;
  }

  public Long getGrstreet() {
    return grstreet;
  }

  public void setGrstreet(Long grstreet) {
    this.grstreet = grstreet;
  }

  public String getSnils() {
    return snils;
  }

  public void setSnils(String snils) {
    this.snils = snils;
  }

  public java.sql.Timestamp getPaspdate() {
    return paspdate;
  }

  public void setPaspdate(java.sql.Timestamp paspdate) {
    this.paspdate = paspdate;
  }

  public Long getDcode1() {
    return dcode1;
  }

  public void setDcode1(Long dcode1) {
    this.dcode1 = dcode1;
  }

  public Long getJid0() {
    return jid0;
  }

  public void setJid0(Long jid0) {
    this.jid0 = jid0;
  }

  public java.sql.Timestamp getLastdateexit() {
    return lastdateexit;
  }

  public void setLastdateexit(java.sql.Timestamp lastdateexit) {
    this.lastdateexit = lastdateexit;
  }

  public Long getCheckinmaindb() {
    return checkinmaindb;
  }

  public void setCheckinmaindb(Long checkinmaindb) {
    this.checkinmaindb = checkinmaindb;
  }

  public Long getReklagrid() {
    return reklagrid;
  }

  public void setReklagrid(Long reklagrid) {
    this.reklagrid = reklagrid;
  }

  public Long getDocscount() {
    return docscount;
  }

  public void setDocscount(Long docscount) {
    this.docscount = docscount;
  }

  public Long getIsemployeer() {
    return isemployeer;
  }

  public void setIsemployeer(Long isemployeer) {
    this.isemployeer = isemployeer;
  }

  public Long getEducat() {
    return educat;
  }

  public void setEducat(Long educat) {
    this.educat = educat;
  }

  public String getFlang() {
    return flang;
  }

  public void setFlang(String flang) {
    this.flang = flang;
  }

  public String getFamstatus() {
    return famstatus;
  }

  public void setFamstatus(String famstatus) {
    this.famstatus = famstatus;
  }

  public Long getNacional() {
    return nacional;
  }

  public void setNacional(Long nacional) {
    this.nacional = nacional;
  }

  public Long getScstepen() {
    return scstepen;
  }

  public void setScstepen(Long scstepen) {
    this.scstepen = scstepen;
  }

  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public String getBplace() {
    return bplace;
  }

  public void setBplace(String bplace) {
    this.bplace = bplace;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getNaselpun() {
    return naselpun;
  }

  public void setNaselpun(String naselpun) {
    this.naselpun = naselpun;
  }

  public String getStreettype() {
    return streettype;
  }

  public void setStreettype(String streettype) {
    this.streettype = streettype;
  }

  public String getParentsfio() {
    return parentsfio;
  }

  public void setParentsfio(String parentsfio) {
    this.parentsfio = parentsfio;
  }

  public String getSchedfilials() {
    return schedfilials;
  }

  public void setSchedfilials(String schedfilials) {
    this.schedfilials = schedfilials;
  }

  public Long getTreatcode() {
    return treatcode;
  }

  public void setTreatcode(Long treatcode) {
    this.treatcode = treatcode;
  }

  public Long getCardplace() {
    return cardplace;
  }

  public void setCardplace(Long cardplace) {
    this.cardplace = cardplace;
  }

  public Long getTradeclient() {
    return tradeclient;
  }

  public void setTradeclient(Long tradeclient) {
    this.tradeclient = tradeclient;
  }

  public Long getPjid() {
    return pjid;
  }

  public void setPjid(Long pjid) {
    this.pjid = pjid;
  }

  public Long getPdepnum() {
    return pdepnum;
  }

  public void setPdepnum(Long pdepnum) {
    this.pdepnum = pdepnum;
  }

  public Long getStaj() {
    return staj;
  }

  public void setStaj(Long staj) {
    this.staj = staj;
  }

  public Long getProfid() {
    return profid;
  }

  public void setProfid(Long profid) {
    this.profid = profid;
  }

  public Long getIsplanmec() {
    return isplanmec;
  }

  public void setIsplanmec(Long isplanmec) {
    this.isplanmec = isplanmec;
  }

  public Long getFromoldbase() {
    return fromoldbase;
  }

  public void setFromoldbase(Long fromoldbase) {
    this.fromoldbase = fromoldbase;
  }

  public Long getObmencard() {
    return obmencard;
  }

  public void setObmencard(Long obmencard) {
    this.obmencard = obmencard;
  }

  public String getFullname2() {
    return fullname2;
  }

  public void setFullname2(String fullname2) {
    this.fullname2 = fullname2;
  }

  public java.sql.Timestamp getDatecancel() {
    return datecancel;
  }

  public void setDatecancel(java.sql.Timestamp datecancel) {
    this.datecancel = datecancel;
  }

  public String getProf_vred() {
    return prof_vred;
  }

  public void setProf_vred(String prof_vred) {
    this.prof_vred = prof_vred;
  }

  public Long getJpcontact() {
    return jpcontact;
  }

  public void setJpcontact(Long jpcontact) {
    this.jpcontact = jpcontact;
  }

  public Long getWorkplaceid() {
    return workplaceid;
  }

  public void setWorkplaceid(Long workplaceid) {
    this.workplaceid = workplaceid;
  }

  public Long getJpaystat() {
    return jpaystat;
  }

  public void setJpaystat(Long jpaystat) {
    this.jpaystat = jpaystat;
  }

  public Long getTalks_dcode() {
    return talks_dcode;
  }

  public void setTalks_dcode(Long talks_dcode) {
    this.talks_dcode = talks_dcode;
  }

  public Long getDcode_consult() {
    return dcode_consult;
  }

  public void setDcode_consult(Long dcode_consult) {
    this.dcode_consult = dcode_consult;
  }

  public Long getReplId() {
    return replId;
  }

  public void setReplId(Long replId) {
    this.replId = replId;
  }

  public Long getReplGrpid() {
    return replGrpid;
  }

  public void setReplGrpid(Long replGrpid) {
    this.replGrpid = replGrpid;
  }

  public String getLinkcode() {
    return linkcode;
  }

  public void setLinkcode(String linkcode) {
    this.linkcode = linkcode;
  }

  public String getAddhistnum() {
    return addhistnum;
  }

  public void setAddhistnum(String addhistnum) {
    this.addhistnum = addhistnum;
  }

  public Long getPr_clienttype() {
    return pr_clienttype;
  }

  public void setPr_clienttype(Long pr_clienttype) {
    this.pr_clienttype = pr_clienttype;
  }

  public String getReklcomment() {
    return reklcomment;
  }

  public void setReklcomment(String reklcomment) {
    this.reklcomment = reklcomment;
  }

  public Long getRekldcode() {
    return rekldcode;
  }

  public void setRekldcode(Long rekldcode) {
    this.rekldcode = rekldcode;
  }

  public Long getLocktype() {
    return locktype;
  }

  public void setLocktype(Long locktype) {
    this.locktype = locktype;
  }

  public Long getRefusecall() {
    return refusecall;
  }

  public void setRefusecall(Long refusecall) {
    this.refusecall = refusecall;
  }

  public Long getReklpcode() {
    return reklpcode;
  }

  public void setReklpcode(Long reklpcode) {
    this.reklpcode = reklpcode;
  }

  public String getDescname() {
    return descname;
  }

  public void setDescname(String descname) {
    this.descname = descname;
  }

  public Long getNationalid() {
    return nationalid;
  }

  public void setNationalid(Long nationalid) {
    this.nationalid = nationalid;
  }

  public String getClientpass() {
    return clientpass;
  }

  public void setClientpass(String clientpass) {
    this.clientpass = clientpass;
  }

  public Long getRefuseaddr() {
    return refuseaddr;
  }

  public void setRefuseaddr(Long refuseaddr) {
    this.refuseaddr = refuseaddr;
  }

  public Long getPasptype() {
    return pasptype;
  }

  public void setPasptype(Long pasptype) {
    this.pasptype = pasptype;
  }

  public String getPaspother() {
    return paspother;
  }

  public void setPaspother(String paspother) {
    this.paspother = paspother;
  }

  public String getAdrindex_f() {
    return adrindex_f;
  }

  public void setAdrindex_f(String adrindex_f) {
    this.adrindex_f = adrindex_f;
  }

  public Long getKodter_f() {
    return kodter_f;
  }

  public void setKodter_f(Long kodter_f) {
    this.kodter_f = kodter_f;
  }

  public String getRegion_f() {
    return region_f;
  }

  public void setRegion_f(String region_f) {
    this.region_f = region_f;
  }

  public String getNaselpun_f() {
    return naselpun_f;
  }

  public void setNaselpun_f(String naselpun_f) {
    this.naselpun_f = naselpun_f;
  }

  public String getCity_f() {
    return city_f;
  }

  public void setCity_f(String city_f) {
    this.city_f = city_f;
  }

  public String getStreetname_f() {
    return streetname_f;
  }

  public void setStreetname_f(String streetname_f) {
    this.streetname_f = streetname_f;
  }

  public String getAddr_f() {
    return addr_f;
  }

  public void setAddr_f(String addr_f) {
    this.addr_f = addr_f;
  }

  public String getCorp_f() {
    return corp_f;
  }

  public void setCorp_f(String corp_f) {
    this.corp_f = corp_f;
  }

  public String getKladr_addrfull() {
    return kladr_addrfull;
  }

  public void setKladr_addrfull(String kladr_addrfull) {
    this.kladr_addrfull = kladr_addrfull;
  }

  public String getFlat_f() {
    return flat_f;
  }

  public void setFlat_f(String flat_f) {
    this.flat_f = flat_f;
  }

  public java.sql.Timestamp getAdrregdate() {
    return adrregdate;
  }

  public void setAdrregdate(java.sql.Timestamp adrregdate) {
    this.adrregdate = adrregdate;
  }

  public Long getRefusesms() {
    return refusesms;
  }

  public void setRefusesms(Long refusesms) {
    this.refusesms = refusesms;
  }

  public Long getDmsid() {
    return dmsid;
  }

  public void setDmsid(Long dmsid) {
    this.dmsid = dmsid;
  }

  public Long getKodter_reg() {
    return kodter_reg;
  }

  public void setKodter_reg(Long kodter_reg) {
    this.kodter_reg = kodter_reg;
  }

  public String getAdrindex_reg() {
    return adrindex_reg;
  }

  public void setAdrindex_reg(String adrindex_reg) {
    this.adrindex_reg = adrindex_reg;
  }

  public String getCity_reg() {
    return city_reg;
  }

  public void setCity_reg(String city_reg) {
    this.city_reg = city_reg;
  }

  public String getStreetname_reg() {
    return streetname_reg;
  }

  public void setStreetname_reg(String streetname_reg) {
    this.streetname_reg = streetname_reg;
  }

  public String getAddr_reg() {
    return addr_reg;
  }

  public void setAddr_reg(String addr_reg) {
    this.addr_reg = addr_reg;
  }

  public String getCorp_reg() {
    return corp_reg;
  }

  public void setCorp_reg(String corp_reg) {
    this.corp_reg = corp_reg;
  }

  public String getFlat_reg() {
    return flat_reg;
  }

  public void setFlat_reg(String flat_reg) {
    this.flat_reg = flat_reg;
  }

  public String getKlcode_reg() {
    return klcode_reg;
  }

  public void setKlcode_reg(String klcode_reg) {
    this.klcode_reg = klcode_reg;
  }

  public String getKladr_addrfull_reg() {
    return kladr_addrfull_reg;
  }

  public void setKladr_addrfull_reg(String kladr_addrfull_reg) {
    this.kladr_addrfull_reg = kladr_addrfull_reg;
  }

  public String getBirthplace() {
    return birthplace;
  }

  public void setBirthplace(String birthplace) {
    this.birthplace = birthplace;
  }

  public String getPaspdepcode() {
    return paspdepcode;
  }

  public void setPaspdepcode(String paspdepcode) {
    this.paspdepcode = paspdepcode;
  }

  public java.sql.Timestamp getRegdate() {
    return regdate;
  }

  public void setRegdate(java.sql.Timestamp regdate) {
    this.regdate = regdate;
  }

  public String getBuild() {
    return build;
  }

  public void setBuild(String build) {
    this.build = build;
  }

  public String getBuild_reg() {
    return build_reg;
  }

  public void setBuild_reg(String build_reg) {
    this.build_reg = build_reg;
  }

  public String getProfpost() {
    return profpost;
  }

  public void setProfpost(String profpost) {
    this.profpost = profpost;
  }

  public Long getWorktypeid() {
    return worktypeid;
  }

  public void setWorktypeid(Long worktypeid) {
    this.worktypeid = worktypeid;
  }

  public Long getRegid() {
    return regid;
  }

  public void setRegid(Long regid) {
    this.regid = regid;
  }

  public String getClpassword() {
    return clpassword;
  }

  public void setClpassword(String clpassword) {
    this.clpassword = clpassword;
  }

  public String getCllogin() {
    return cllogin;
  }

  public void setCllogin(String cllogin) {
    this.cllogin = cllogin;
  }

  public Long getSendprotbymail() {
    return sendprotbymail;
  }

  public void setSendprotbymail(Long sendprotbymail) {
    this.sendprotbymail = sendprotbymail;
  }

  public Long getProtaccesspin() {
    return protaccesspin;
  }

  public void setProtaccesspin(Long protaccesspin) {
    this.protaccesspin = protaccesspin;
  }

  public String getPhoneaccessword() {
    return phoneaccessword;
  }

  public void setPhoneaccessword(String phoneaccessword) {
    this.phoneaccessword = phoneaccessword;
  }

  public Long getInscompaccess() {
    return inscompaccess;
  }

  public void setInscompaccess(Long inscompaccess) {
    this.inscompaccess = inscompaccess;
  }

  public java.sql.Timestamp getOmsfdate() {
    return omsfdate;
  }

  public void setOmsfdate(java.sql.Timestamp omsfdate) {
    this.omsfdate = omsfdate;
  }

  public Long getIsnovor() {
    return isnovor;
  }

  public void setIsnovor(Long isnovor) {
    this.isnovor = isnovor;
  }

  public Long getProgserv() {
    return progserv;
  }

  public void setProgserv(Long progserv) {
    this.progserv = progserv;
  }

  public Long getSocid() {
    return socid;
  }

  public void setSocid(Long socid) {
    this.socid = socid;
  }

  public String getClwebcode() {
    return clwebcode;
  }

  public void setClwebcode(String clwebcode) {
    this.clwebcode = clwebcode;
  }

  public String getOcatd() {
    return ocatd;
  }

  public void setOcatd(String ocatd) {
    this.ocatd = ocatd;
  }

  public String getOcatd_reg() {
    return ocatd_reg;
  }

  public void setOcatd_reg(String ocatd_reg) {
    this.ocatd_reg = ocatd_reg;
  }

  public Long getDistrictid() {
    return districtid;
  }

  public void setDistrictid(Long districtid) {
    this.districtid = districtid;
  }

  public Long getDistrictid_reg() {
    return districtid_reg;
  }

  public void setDistrictid_reg(Long districtid_reg) {
    this.districtid_reg = districtid_reg;
  }

  public String getPreplastname() {
    return preplastname;
  }

  public void setPreplastname(String preplastname) {
    this.preplastname = preplastname;
  }

  public String getPrepfirstname() {
    return prepfirstname;
  }

  public void setPrepfirstname(String prepfirstname) {
    this.prepfirstname = prepfirstname;
  }

  public String getPrepmidname() {
    return prepmidname;
  }

  public void setPrepmidname(String prepmidname) {
    this.prepmidname = prepmidname;
  }

  public String getPrepfullname() {
    return prepfullname;
  }

  public void setPrepfullname(String prepfullname) {
    this.prepfullname = prepfullname;
  }

  public Long getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Long anonymous) {
    this.anonymous = anonymous;
  }

  public String getAnonymousnum() {
    return anonymousnum;
  }

  public void setAnonymousnum(String anonymousnum) {
    this.anonymousnum = anonymousnum;
  }

  public String getAddrentrance() {
    return addrentrance;
  }

  public void setAddrentrance(String addrentrance) {
    this.addrentrance = addrentrance;
  }

  public String getAddrfloor() {
    return addrfloor;
  }

  public void setAddrfloor(String addrfloor) {
    this.addrfloor = addrfloor;
  }

  public String getAddrcode() {
    return addrcode;
  }

  public void setAddrcode(String addrcode) {
    this.addrcode = addrcode;
  }

  public Long getWebaccesstype() {
    return webaccesstype;
  }

  public void setWebaccesstype(Long webaccesstype) {
    this.webaccesstype = webaccesstype;
  }

  public Long getWebschedtype() {
    return webschedtype;
  }

  public void setWebschedtype(Long webschedtype) {
    this.webschedtype = webschedtype;
  }

  public Long getWebhisttype() {
    return webhisttype;
  }

  public void setWebhisttype(Long webhisttype) {
    this.webhisttype = webhisttype;
  }

  public Long getClpasstype() {
    return clpasstype;
  }

  public void setClpasstype(Long clpasstype) {
    this.clpasstype = clpasstype;
  }

  public Long getRefuseclmail() {
    return refuseclmail;
  }

  public void setRefuseclmail(Long refuseclmail) {
    this.refuseclmail = refuseclmail;
  }

  public Long getWebpaytype() {
    return webpaytype;
  }

  public void setWebpaytype(Long webpaytype) {
    this.webpaytype = webpaytype;
  }

  public String getNormlastname() {
    return normlastname;
  }

  public void setNormlastname(String normlastname) {
    this.normlastname = normlastname;
  }

  public String getNormfirstname() {
    return normfirstname;
  }

  public void setNormfirstname(String normfirstname) {
    this.normfirstname = normfirstname;
  }

  public String getNormmidname() {
    return normmidname;
  }

  public void setNormmidname(String normmidname) {
    this.normmidname = normmidname;
  }

  public String getNormfullname() {
    return normfullname;
  }

  public void setNormfullname(String normfullname) {
    this.normfullname = normfullname;
  }

  public String getExtcontactcode() {
    return extcontactcode;
  }

  public void setExtcontactcode(String extcontactcode) {
    this.extcontactcode = extcontactcode;
  }

  public Long getDeathstatus() {
    return deathstatus;
  }

  public void setDeathstatus(Long deathstatus) {
    this.deathstatus = deathstatus;
  }

  public java.sql.Date getDeathdate() {
    return deathdate;
  }

  public void setDeathdate(java.sql.Date deathdate) {
    this.deathdate = deathdate;
  }

  public java.sql.Time getDeathtime() {
    return deathtime;
  }

  public void setDeathtime(java.sql.Time deathtime) {
    this.deathtime = deathtime;
  }

  public Long getDeathprotocolid() {
    return deathprotocolid;
  }

  public void setDeathprotocolid(Long deathprotocolid) {
    this.deathprotocolid = deathprotocolid;
  }

  public Long getDeathdirid() {
    return deathdirid;
  }

  public void setDeathdirid(Long deathdirid) {
    this.deathdirid = deathdirid;
  }

  public java.sql.Date getDeathfixdate() {
    return deathfixdate;
  }

  public void setDeathfixdate(java.sql.Date deathfixdate) {
    this.deathfixdate = deathfixdate;
  }

  public Long getSnils_check_type() {
    return snils_check_type;
  }

  public void setSnils_check_type(Long snils_check_type) {
    this.snils_check_type = snils_check_type;
  }

  public Long getUiastype() {
    return uiastype;
  }

  public void setUiastype(Long uiastype) {
    this.uiastype = uiastype;
  }

  public String getAddrroom() {
    return addrroom;
  }

  public void setAddrroom(String addrroom) {
    this.addrroom = addrroom;
  }

  public String getAddrroom_reg() {
    return addrroom_reg;
  }

  public void setAddrroom_reg(String addrroom_reg) {
    this.addrroom_reg = addrroom_reg;
  }

  public Long getFamilystatus() {
    return familystatus;
  }

  public void setFamilystatus(Long familystatus) {
    this.familystatus = familystatus;
  }

  public Long getEducation() {
    return education;
  }

  public void setEducation(Long education) {
    this.education = education;
  }

  public Long getNewborncode() {
    return newborncode;
  }

  public void setNewborncode(Long newborncode) {
    this.newborncode = newborncode;
  }

  public String getLpucheckreq() {
    return lpucheckreq;
  }

  public void setLpucheckreq(String lpucheckreq) {
    this.lpucheckreq = lpucheckreq;
  }

  @Override
  public String toString() {
    return "Clients{" +
            "pcode=" + pcode +
            ", filial=" + filial +
            ", lastname='" + lastname + '\'' +
            ", firstname='" + firstname + '\'' +
            ", midname='" + midname + '\'' +
            ", phone1='" + phone1 + '\'' +
            ", phone2='" + phone2 + '\'' +
            ", phone3='" + phone3 + '\'' +
            ", pager='" + pager + '\'' +
            ", pol=" + pol +
            ", bdate=" + bdate +
            ", doctors='" + doctors + '\'' +
            ", fullname='" + fullname + '\'' +
            ", nomilk=" + nomilk +
            ", comment='" + comment + '\'' +
            ", clientdis=" + clientdis +
            ", res1=" + res1 +
            ", specnum='" + specnum + '\'' +
            ", grtype=" + grtype +
            ", prof='" + prof + '\'' +
            ", rcode=" + rcode +
            ", nsp='" + nsp + '\'' +
            ", byear=" + byear +
            ", histnum='" + histnum + '\'' +
            ", laststate=" + laststate +
            ", statedate=" + statedate +
            ", statedoctor=" + statedoctor +
            ", jid=" + jid +
            ", nspdate=" + nspdate +
            ", dateenter=" + dateenter +
            ", dateexit=" + dateexit +
            ", grpcode=" + grpcode +
            ", omsnum='" + omsnum + '\'' +
            ", omsser='" + omsser + '\'' +
            ", omsdate=" + omsdate +
            ", omsjid=" + omsjid +
            ", isworked=" + isworked +
            ", status=" + status +
            ", res2='" + res2 + '\'' +
            ", lstid=" + lstid +
            ", cstatus=" + cstatus +
            ", uid=" + uid +
            ", modifydate=" + modifydate +
            ", paspser='" + paspser + '\'' +
            ", paspnum='" + paspnum + '\'' +
            ", paspplace='" + paspplace + '\'' +
            ", kodter=" + kodter +
            ", hfamily=" + hfamily +
            ", startsum=" + startsum +
            ", obpom='" + obpom + '\'' +
            ", sectid=" + sectid +
            ", firstobsled=" + firstobsled +
            ", ownerdcode=" + ownerdcode +
            ", externpcode=" + externpcode +
            ", typestatus=" + typestatus +
            ", agestatus=" + agestatus +
            ", addr='" + addr + '\'' +
            ", adrindex='" + adrindex + '\'' +
            ", city='" + city + '\'' +
            ", streetname='" + streetname + '\'' +
            ", corp='" + corp + '\'' +
            ", flat='" + flat + '\'' +
            ", addrfull='" + addrfull + '\'' +
            ", klcode='" + klcode + '\'' +
            ", allergy=" + allergy +
            ", specserv=" + specserv +
            ", discaccum=" + discaccum +
            ", startsumrub=" + startsumrub +
            ", workplace='" + workplace + '\'' +
            ", disccard='" + disccard + '\'' +
            ", extdcode=" + extdcode +
            ", createdate=" + createdate +
            ", pensnum='" + pensnum + '\'' +
            ", exportdate=" + exportdate +
            ", fupgrade=" + fupgrade +
            ", odusesum=" + odusesum +
            ", oduseproc=" + oduseproc +
            ", odcurrenc=" + odcurrenc +
            ", odsumv=" + odsumv +
            ", odprocv=" + odprocv +
            ", clinicid=" + clinicid +
            ", cars='" + cars + '\'' +
            ", levelgroup=" + levelgroup +
            ", persontype=" + persontype +
            ", jpid=" + jpid +
            ", codelimits='" + codelimits + '\'' +
            ", clmail='" + clmail + '\'' +
            ", nazndis=" + nazndis +
            ", hidecomment='" + hidecomment + '\'' +
            ", receipid=" + receipid +
            ", limitsignore=" + limitsignore +
            ", planscount=" + planscount +
            ", grstreet=" + grstreet +
            ", snils='" + snils + '\'' +
            ", paspdate=" + paspdate +
            ", dcode1=" + dcode1 +
            ", jid0=" + jid0 +
            ", lastdateexit=" + lastdateexit +
            ", checkinmaindb=" + checkinmaindb +
            ", reklagrid=" + reklagrid +
            ", docscount=" + docscount +
            ", isemployeer=" + isemployeer +
            ", educat=" + educat +
            ", flang='" + flang + '\'' +
            ", famstatus='" + famstatus + '\'' +
            ", nacional=" + nacional +
            ", scstepen=" + scstepen +
            ", inn='" + inn + '\'' +
            ", bplace='" + bplace + '\'' +
            ", region='" + region + '\'' +
            ", naselpun='" + naselpun + '\'' +
            ", streettype='" + streettype + '\'' +
            ", parentsfio='" + parentsfio + '\'' +
            ", schedfilials='" + schedfilials + '\'' +
            ", treatcode=" + treatcode +
            ", cardplace=" + cardplace +
            ", tradeclient=" + tradeclient +
            ", pjid=" + pjid +
            ", pdepnum=" + pdepnum +
            ", staj=" + staj +
            ", profid=" + profid +
            ", isplanmec=" + isplanmec +
            ", fromoldbase=" + fromoldbase +
            ", obmencard=" + obmencard +
            ", fullname2='" + fullname2 + '\'' +
            ", datecancel=" + datecancel +
            ", prof_vred='" + prof_vred + '\'' +
            ", jpcontact=" + jpcontact +
            ", workplaceid=" + workplaceid +
            ", jpaystat=" + jpaystat +
            ", talks_dcode=" + talks_dcode +
            ", dcode_consult=" + dcode_consult +
            ", replId=" + replId +
            ", replGrpid=" + replGrpid +
            ", linkcode='" + linkcode + '\'' +
            ", addhistnum='" + addhistnum + '\'' +
            ", pr_clienttype=" + pr_clienttype +
            ", reklcomment='" + reklcomment + '\'' +
            ", rekldcode=" + rekldcode +
            ", locktype=" + locktype +
            ", refusecall=" + refusecall +
            ", reklpcode=" + reklpcode +
            ", descname='" + descname + '\'' +
            ", nationalid=" + nationalid +
            ", clientpass='" + clientpass + '\'' +
            ", refuseaddr=" + refuseaddr +
            ", pasptype=" + pasptype +
            ", paspother='" + paspother + '\'' +
            ", adrindex_f='" + adrindex_f + '\'' +
            ", kodter_f=" + kodter_f +
            ", region_f='" + region_f + '\'' +
            ", naselpun_f='" + naselpun_f + '\'' +
            ", city_f='" + city_f + '\'' +
            ", streetname_f='" + streetname_f + '\'' +
            ", addr_f='" + addr_f + '\'' +
            ", corp_f='" + corp_f + '\'' +
            ", kladr_addrfull='" + kladr_addrfull + '\'' +
            ", flat_f='" + flat_f + '\'' +
            ", adrregdate=" + adrregdate +
            ", refusesms=" + refusesms +
            ", dmsid=" + dmsid +
            ", kodter_reg=" + kodter_reg +
            ", adrindex_reg='" + adrindex_reg + '\'' +
            ", city_reg='" + city_reg + '\'' +
            ", streetname_reg='" + streetname_reg + '\'' +
            ", addr_reg='" + addr_reg + '\'' +
            ", corp_reg='" + corp_reg + '\'' +
            ", flat_reg='" + flat_reg + '\'' +
            ", klcode_reg='" + klcode_reg + '\'' +
            ", kladr_addrfull_reg='" + kladr_addrfull_reg + '\'' +
            ", birthplace='" + birthplace + '\'' +
            ", paspdepcode='" + paspdepcode + '\'' +
            ", regdate=" + regdate +
            ", build='" + build + '\'' +
            ", build_reg='" + build_reg + '\'' +
            ", profpost='" + profpost + '\'' +
            ", worktypeid=" + worktypeid +
            ", regid=" + regid +
            ", clpassword='" + clpassword + '\'' +
            ", cllogin='" + cllogin + '\'' +
            ", sendprotbymail=" + sendprotbymail +
            ", protaccesspin=" + protaccesspin +
            ", phoneaccessword='" + phoneaccessword + '\'' +
            ", inscompaccess=" + inscompaccess +
            ", omsfdate=" + omsfdate +
            ", isnovor=" + isnovor +
            ", progserv=" + progserv +
            ", socid=" + socid +
            ", clwebcode='" + clwebcode + '\'' +
            ", ocatd='" + ocatd + '\'' +
            ", ocatd_reg='" + ocatd_reg + '\'' +
            ", districtid=" + districtid +
            ", districtid_reg=" + districtid_reg +
            ", preplastname='" + preplastname + '\'' +
            ", prepfirstname='" + prepfirstname + '\'' +
            ", prepmidname='" + prepmidname + '\'' +
            ", prepfullname='" + prepfullname + '\'' +
            ", anonymous=" + anonymous +
            ", anonymousnum='" + anonymousnum + '\'' +
            ", addrentrance='" + addrentrance + '\'' +
            ", addrfloor='" + addrfloor + '\'' +
            ", addrcode='" + addrcode + '\'' +
            ", webaccesstype=" + webaccesstype +
            ", webschedtype=" + webschedtype +
            ", webhisttype=" + webhisttype +
            ", clpasstype=" + clpasstype +
            ", refuseclmail=" + refuseclmail +
            ", webpaytype=" + webpaytype +
            ", normlastname='" + normlastname + '\'' +
            ", normfirstname='" + normfirstname + '\'' +
            ", normmidname='" + normmidname + '\'' +
            ", normfullname='" + normfullname + '\'' +
            ", extcontactcode='" + extcontactcode + '\'' +
            ", deathstatus=" + deathstatus +
            ", deathdate=" + deathdate +
            ", deathtime=" + deathtime +
            ", deathprotocolid=" + deathprotocolid +
            ", deathdirid=" + deathdirid +
            ", deathfixdate=" + deathfixdate +
            ", snils_check_type=" + snils_check_type +
            ", uiastype=" + uiastype +
            ", addrroom='" + addrroom + '\'' +
            ", addrroom_reg='" + addrroom_reg + '\'' +
            ", familystatus=" + familystatus +
            ", education=" + education +
            ", newborncode=" + newborncode +
            ", lpucheckreq='" + lpucheckreq + '\'' +
            '}';
  }
}
