package com.infoterminal.infoterminal.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "DOCTOR")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Doctor implements Serializable {
  @Id
  private Long dcode;
  private Long filial;
  private String dname;
  private String dphone1;
  private String dphone2;
  private String dpasswrd;
  private Long drights;
  private Long stdtype;
  private String fullname;
  private String terap;
  private String hirurg;
  private String parodont;
  private String ortoped;
  private String ortodont;
  private Long rnum;
  private Long assistcode;
  private String doctcode;
  private Long mechanic;
  private Long locked;
  private Long depnum;
  private Long salarytype;
  private Long persontype;
  private Long chair;
  private Long assistchk;
  private Long incmode;
  private Long workwithfilial;
  private Long viewinsched;
  private Long extpcode;
  private Long usestavka;
  private Long useinnarad;
  private Long asdspeccode;
  private String mphone;
  private Long shorttalon;
  private Long specserv;
  private Long assisttype;
  private Long jid;
  private Long schedchairs;
  private Long matresp;
  private String grstreet;
  private Long grsdoct;
  private String schedcomment;
  private Long inventcode;
  private java.sql.Timestamp inventdate;
  private Long accesslevel;
  private String shedcardkey;
  private Long kateg;
  private Long callcentre;
  private java.sql.Timestamp lockdate;
  private Long cashcode;
  private String texttosched;
  private String fullname2;
  private Long matpersresp;
  private String doctpost;
  private java.sql.Timestamp bdate;
  private Long schid;
  private java.sql.Timestamp enterdate;
  private Long instat;
  private Long replId;
  private Long replGrpid;
  private Long nazncount;
  private Long userid;
  private Long schedrazdel;
  private String schedinfo;
  private Long bt_profile;
  private Long grsvid;
  private Long bt_enter_profile;
  private Long bt_use;
  private String bt_password;
  private Long shinterv;
  private Long stepen;
  private Long zvanie;
  private Long schedreserv;
  private Long obsladd_dis;
  private Long respons;
  private String ntuser;
  private String keyprofile;
  private String grs_koef;
  private String clmail;
  private Long systype;
  private Long profid;
  private Long chairman;
  private Long costtype;
  private Long sex;
  private Long fcfsworktype;
  private Long viewinweb;
  private Long schedgridtype;
  private String weblogin;
  private String snils;
  private Long parttype;
  private Long smtid;
  private String doctcode_reg;
  private String calluserid;
  private String phoneint;
  private Long napravreq;
  private String cashname;
  private Long lasttreatfilday;
  private Long lasttreatdepday;
  private Long lasttreatdocday;
  private String calluserpassword;
  private java.sql.Timestamp modifydate;
  private String callsysuser;
  private String callsyspassword;
  private String webname;
  private String mediaid;
  private String webcomment;
  private Long sched_filial_group_id;
  private Long extjid;
  private Long doctqualifyid;
  private String doctcode_lgot;
  private String onlineuserid;
  private java.sql.Timestamp dpasswrddate;
  private String poadata;
  private String extguid;

  public Doctor() {
  }

  public Long getDcode() {
    return dcode;
  }

  public void setDcode(Long dcode) {
    this.dcode = dcode;
  }

  public Long getFilial() {
    return filial;
  }

  public void setFilial(Long filial) {
    this.filial = filial;
  }

  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }

  public String getDphone1() {
    return dphone1;
  }

  public void setDphone1(String dphone1) {
    this.dphone1 = dphone1;
  }

  public String getDphone2() {
    return dphone2;
  }

  public void setDphone2(String dphone2) {
    this.dphone2 = dphone2;
  }

  public String getDpasswrd() {
    return dpasswrd;
  }

  public void setDpasswrd(String dpasswrd) {
    this.dpasswrd = dpasswrd;
  }

  public Long getDrights() {
    return drights;
  }

  public void setDrights(Long drights) {
    this.drights = drights;
  }

  public Long getStdtype() {
    return stdtype;
  }

  public void setStdtype(Long stdtype) {
    this.stdtype = stdtype;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public String getTerap() {
    return terap;
  }

  public void setTerap(String terap) {
    this.terap = terap;
  }

  public String getHirurg() {
    return hirurg;
  }

  public void setHirurg(String hirurg) {
    this.hirurg = hirurg;
  }

  public String getParodont() {
    return parodont;
  }

  public void setParodont(String parodont) {
    this.parodont = parodont;
  }

  public String getOrtoped() {
    return ortoped;
  }

  public void setOrtoped(String ortoped) {
    this.ortoped = ortoped;
  }

  public String getOrtodont() {
    return ortodont;
  }

  public void setOrtodont(String ortodont) {
    this.ortodont = ortodont;
  }

  public Long getRnum() {
    return rnum;
  }

  public void setRnum(Long rnum) {
    this.rnum = rnum;
  }

  public Long getAssistcode() {
    return assistcode;
  }

  public void setAssistcode(Long assistcode) {
    this.assistcode = assistcode;
  }

  public String getDoctcode() {
    return doctcode;
  }

  public void setDoctcode(String doctcode) {
    this.doctcode = doctcode;
  }

  public Long getMechanic() {
    return mechanic;
  }

  public void setMechanic(Long mechanic) {
    this.mechanic = mechanic;
  }

  public Long getLocked() {
    return locked;
  }

  public void setLocked(Long locked) {
    this.locked = locked;
  }

  public Long getDepnum() {
    return depnum;
  }

  public void setDepnum(Long depnum) {
    this.depnum = depnum;
  }

  public Long getSalarytype() {
    return salarytype;
  }

  public void setSalarytype(Long salarytype) {
    this.salarytype = salarytype;
  }

  public Long getPersontype() {
    return persontype;
  }

  public void setPersontype(Long persontype) {
    this.persontype = persontype;
  }

  public Long getChair() {
    return chair;
  }

  public void setChair(Long chair) {
    this.chair = chair;
  }

  public Long getAssistchk() {
    return assistchk;
  }

  public void setAssistchk(Long assistchk) {
    this.assistchk = assistchk;
  }

  public Long getIncmode() {
    return incmode;
  }

  public void setIncmode(Long incmode) {
    this.incmode = incmode;
  }

  public Long getWorkwithfilial() {
    return workwithfilial;
  }

  public void setWorkwithfilial(Long workwithfilial) {
    this.workwithfilial = workwithfilial;
  }

  public Long getViewinsched() {
    return viewinsched;
  }

  public void setViewinsched(Long viewinsched) {
    this.viewinsched = viewinsched;
  }

  public Long getExtpcode() {
    return extpcode;
  }

  public void setExtpcode(Long extpcode) {
    this.extpcode = extpcode;
  }

  public Long getUsestavka() {
    return usestavka;
  }

  public void setUsestavka(Long usestavka) {
    this.usestavka = usestavka;
  }

  public Long getUseinnarad() {
    return useinnarad;
  }

  public void setUseinnarad(Long useinnarad) {
    this.useinnarad = useinnarad;
  }

  public Long getAsdspeccode() {
    return asdspeccode;
  }

  public void setAsdspeccode(Long asdspeccode) {
    this.asdspeccode = asdspeccode;
  }

  public String getMphone() {
    return mphone;
  }

  public void setMphone(String mphone) {
    this.mphone = mphone;
  }

  public Long getShorttalon() {
    return shorttalon;
  }

  public void setShorttalon(Long shorttalon) {
    this.shorttalon = shorttalon;
  }

  public Long getSpecserv() {
    return specserv;
  }

  public void setSpecserv(Long specserv) {
    this.specserv = specserv;
  }

  public Long getAssisttype() {
    return assisttype;
  }

  public void setAssisttype(Long assisttype) {
    this.assisttype = assisttype;
  }

  public Long getJid() {
    return jid;
  }

  public void setJid(Long jid) {
    this.jid = jid;
  }

  public Long getSchedchairs() {
    return schedchairs;
  }

  public void setSchedchairs(Long schedchairs) {
    this.schedchairs = schedchairs;
  }

  public Long getMatresp() {
    return matresp;
  }

  public void setMatresp(Long matresp) {
    this.matresp = matresp;
  }

  public String getGrstreet() {
    return grstreet;
  }

  public void setGrstreet(String grstreet) {
    this.grstreet = grstreet;
  }

  public Long getGrsdoct() {
    return grsdoct;
  }

  public void setGrsdoct(Long grsdoct) {
    this.grsdoct = grsdoct;
  }

  public String getSchedcomment() {
    return schedcomment;
  }

  public void setSchedcomment(String schedcomment) {
    this.schedcomment = schedcomment;
  }

  public Long getInventcode() {
    return inventcode;
  }

  public void setInventcode(Long inventcode) {
    this.inventcode = inventcode;
  }

  public java.sql.Timestamp getInventdate() {
    return inventdate;
  }

  public void setInventdate(java.sql.Timestamp inventdate) {
    this.inventdate = inventdate;
  }

  public Long getAccesslevel() {
    return accesslevel;
  }

  public void setAccesslevel(Long accesslevel) {
    this.accesslevel = accesslevel;
  }

  public String getShedcardkey() {
    return shedcardkey;
  }

  public void setShedcardkey(String shedcardkey) {
    this.shedcardkey = shedcardkey;
  }

  public Long getKateg() {
    return kateg;
  }

  public void setKateg(Long kateg) {
    this.kateg = kateg;
  }

  public Long getCallcentre() {
    return callcentre;
  }

  public void setCallcentre(Long callcentre) {
    this.callcentre = callcentre;
  }

  public java.sql.Timestamp getLockdate() {
    return lockdate;
  }

  public void setLockdate(java.sql.Timestamp lockdate) {
    this.lockdate = lockdate;
  }

  public Long getCashcode() {
    return cashcode;
  }

  public void setCashcode(Long cashcode) {
    this.cashcode = cashcode;
  }

  public String getTexttosched() {
    return texttosched;
  }

  public void setTexttosched(String texttosched) {
    this.texttosched = texttosched;
  }

  public String getFullname2() {
    return fullname2;
  }

  public void setFullname2(String fullname2) {
    this.fullname2 = fullname2;
  }

  public Long getMatpersresp() {
    return matpersresp;
  }

  public void setMatpersresp(Long matpersresp) {
    this.matpersresp = matpersresp;
  }

  public String getDoctpost() {
    return doctpost;
  }

  public void setDoctpost(String doctpost) {
    this.doctpost = doctpost;
  }

  public java.sql.Timestamp getBdate() {
    return bdate;
  }

  public void setBdate(java.sql.Timestamp bdate) {
    this.bdate = bdate;
  }

  public Long getSchid() {
    return schid;
  }

  public void setSchid(Long schid) {
    this.schid = schid;
  }

  public java.sql.Timestamp getEnterdate() {
    return enterdate;
  }

  public void setEnterdate(java.sql.Timestamp enterdate) {
    this.enterdate = enterdate;
  }

  public Long getInstat() {
    return instat;
  }

  public void setInstat(Long instat) {
    this.instat = instat;
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

  public Long getNazncount() {
    return nazncount;
  }

  public void setNazncount(Long nazncount) {
    this.nazncount = nazncount;
  }

  public Long getUserid() {
    return userid;
  }

  public void setUserid(Long userid) {
    this.userid = userid;
  }

  public Long getSchedrazdel() {
    return schedrazdel;
  }

  public void setSchedrazdel(Long schedrazdel) {
    this.schedrazdel = schedrazdel;
  }

  public String getSchedinfo() {
    return schedinfo;
  }

  public void setSchedinfo(String schedinfo) {
    this.schedinfo = schedinfo;
  }

  public Long getBt_profile() {
    return bt_profile;
  }

  public void setBt_profile(Long bt_profile) {
    this.bt_profile = bt_profile;
  }

  public Long getGrsvid() {
    return grsvid;
  }

  public void setGrsvid(Long grsvid) {
    this.grsvid = grsvid;
  }

  public Long getBt_enter_profile() {
    return bt_enter_profile;
  }

  public void setBt_enter_profile(Long bt_enter_profile) {
    this.bt_enter_profile = bt_enter_profile;
  }

  public Long getBt_use() {
    return bt_use;
  }

  public void setBt_use(Long bt_use) {
    this.bt_use = bt_use;
  }

  public String getBt_password() {
    return bt_password;
  }

  public void setBt_password(String bt_password) {
    this.bt_password = bt_password;
  }

  public Long getShinterv() {
    return shinterv;
  }

  public void setShinterv(Long shinterv) {
    this.shinterv = shinterv;
  }

  public Long getStepen() {
    return stepen;
  }

  public void setStepen(Long stepen) {
    this.stepen = stepen;
  }

  public Long getZvanie() {
    return zvanie;
  }

  public void setZvanie(Long zvanie) {
    this.zvanie = zvanie;
  }

  public Long getSchedreserv() {
    return schedreserv;
  }

  public void setSchedreserv(Long schedreserv) {
    this.schedreserv = schedreserv;
  }

  public Long getObsladd_dis() {
    return obsladd_dis;
  }

  public void setObsladd_dis(Long obsladd_dis) {
    this.obsladd_dis = obsladd_dis;
  }

  public Long getRespons() {
    return respons;
  }

  public void setRespons(Long respons) {
    this.respons = respons;
  }

  public String getNtuser() {
    return ntuser;
  }

  public void setNtuser(String ntuser) {
    this.ntuser = ntuser;
  }

  public String getKeyprofile() {
    return keyprofile;
  }

  public void setKeyprofile(String keyprofile) {
    this.keyprofile = keyprofile;
  }

  public String getGrs_koef() {
    return grs_koef;
  }

  public void setGrs_koef(String grs_koef) {
    this.grs_koef = grs_koef;
  }

  public String getClmail() {
    return clmail;
  }

  public void setClmail(String clmail) {
    this.clmail = clmail;
  }

  public Long getSystype() {
    return systype;
  }

  public void setSystype(Long systype) {
    this.systype = systype;
  }

  public Long getProfid() {
    return profid;
  }

  public void setProfid(Long profid) {
    this.profid = profid;
  }

  public Long getChairman() {
    return chairman;
  }

  public void setChairman(Long chairman) {
    this.chairman = chairman;
  }

  public Long getCosttype() {
    return costtype;
  }

  public void setCosttype(Long costtype) {
    this.costtype = costtype;
  }

  public Long getSex() {
    return sex;
  }

  public void setSex(Long sex) {
    this.sex = sex;
  }

  public Long getFcfsworktype() {
    return fcfsworktype;
  }

  public void setFcfsworktype(Long fcfsworktype) {
    this.fcfsworktype = fcfsworktype;
  }

  public Long getViewinweb() {
    return viewinweb;
  }

  public void setViewinweb(Long viewinweb) {
    this.viewinweb = viewinweb;
  }

  public Long getSchedgridtype() {
    return schedgridtype;
  }

  public void setSchedgridtype(Long schedgridtype) {
    this.schedgridtype = schedgridtype;
  }

  public String getWeblogin() {
    return weblogin;
  }

  public void setWeblogin(String weblogin) {
    this.weblogin = weblogin;
  }

  public String getSnils() {
    return snils;
  }

  public void setSnils(String snils) {
    this.snils = snils;
  }

  public Long getParttype() {
    return parttype;
  }

  public void setParttype(Long parttype) {
    this.parttype = parttype;
  }

  public Long getSmtid() {
    return smtid;
  }

  public void setSmtid(Long smtid) {
    this.smtid = smtid;
  }

  public String getDoctcode_reg() {
    return doctcode_reg;
  }

  public void setDoctcode_reg(String doctcode_reg) {
    this.doctcode_reg = doctcode_reg;
  }

  public String getCalluserid() {
    return calluserid;
  }

  public void setCalluserid(String calluserid) {
    this.calluserid = calluserid;
  }

  public String getPhoneint() {
    return phoneint;
  }

  public void setPhoneint(String phoneint) {
    this.phoneint = phoneint;
  }

  public Long getNapravreq() {
    return napravreq;
  }

  public void setNapravreq(Long napravreq) {
    this.napravreq = napravreq;
  }

  public String getCashname() {
    return cashname;
  }

  public void setCashname(String cashname) {
    this.cashname = cashname;
  }

  public Long getLasttreatfilday() {
    return lasttreatfilday;
  }

  public void setLasttreatfilday(Long lasttreatfilday) {
    this.lasttreatfilday = lasttreatfilday;
  }

  public Long getLasttreatdepday() {
    return lasttreatdepday;
  }

  public void setLasttreatdepday(Long lasttreatdepday) {
    this.lasttreatdepday = lasttreatdepday;
  }

  public Long getLasttreatdocday() {
    return lasttreatdocday;
  }

  public void setLasttreatdocday(Long lasttreatdocday) {
    this.lasttreatdocday = lasttreatdocday;
  }

  public String getCalluserpassword() {
    return calluserpassword;
  }

  public void setCalluserpassword(String calluserpassword) {
    this.calluserpassword = calluserpassword;
  }

  public java.sql.Timestamp getModifydate() {
    return modifydate;
  }

  public void setModifydate(java.sql.Timestamp modifydate) {
    this.modifydate = modifydate;
  }

  public String getCallsysuser() {
    return callsysuser;
  }

  public void setCallsysuser(String callsysuser) {
    this.callsysuser = callsysuser;
  }

  public String getCallsyspassword() {
    return callsyspassword;
  }

  public void setCallsyspassword(String callsyspassword) {
    this.callsyspassword = callsyspassword;
  }

  public String getWebname() {
    return webname;
  }

  public void setWebname(String webname) {
    this.webname = webname;
  }

  public String getMediaid() {
    return mediaid;
  }

  public void setMediaid(String mediaid) {
    this.mediaid = mediaid;
  }

  public String getWebcomment() {
    return webcomment;
  }

  public void setWebcomment(String webcomment) {
    this.webcomment = webcomment;
  }

  public Long getSched_filial_group_id() {
    return sched_filial_group_id;
  }

  public void setSched_filial_group_id(Long sched_filial_group_id) {
    this.sched_filial_group_id = sched_filial_group_id;
  }

  public Long getExtjid() {
    return extjid;
  }

  public void setExtjid(Long extjid) {
    this.extjid = extjid;
  }

  public Long getDoctqualifyid() {
    return doctqualifyid;
  }

  public void setDoctqualifyid(Long doctqualifyid) {
    this.doctqualifyid = doctqualifyid;
  }

  public String getDoctcode_lgot() {
    return doctcode_lgot;
  }

  public void setDoctcode_lgot(String doctcode_lgot) {
    this.doctcode_lgot = doctcode_lgot;
  }

  public String getOnlineuserid() {
    return onlineuserid;
  }

  public void setOnlineuserid(String onlineuserid) {
    this.onlineuserid = onlineuserid;
  }

  public java.sql.Timestamp getDpasswrddate() {
    return dpasswrddate;
  }

  public void setDpasswrddate(java.sql.Timestamp dpasswrddate) {
    this.dpasswrddate = dpasswrddate;
  }

  public String getPoadata() {
    return poadata;
  }

  public void setPoadata(String poadata) {
    this.poadata = poadata;
  }

  public String getExtguid() {
    return extguid;
  }

  public void setExtguid(String extguid) {
    this.extguid = extguid;
  }

  @Override
  public String toString() {
    return "Doctor{" +
            "dcode=" + dcode +
            ", filial=" + filial +
            ", dname='" + dname + '\'' +
            ", dphone1='" + dphone1 + '\'' +
            ", dphone2='" + dphone2 + '\'' +
            ", dpasswrd='" + dpasswrd + '\'' +
            ", drights=" + drights +
            ", stdtype=" + stdtype +
            ", fullname='" + fullname + '\'' +
            ", terap='" + terap + '\'' +
            ", hirurg='" + hirurg + '\'' +
            ", parodont='" + parodont + '\'' +
            ", ortoped='" + ortoped + '\'' +
            ", ortodont='" + ortodont + '\'' +
            ", rnum=" + rnum +
            ", assistcode=" + assistcode +
            ", doctcode='" + doctcode + '\'' +
            ", mechanic=" + mechanic +
            ", locked=" + locked +
            ", depnum=" + depnum +
            ", salarytype=" + salarytype +
            ", persontype=" + persontype +
            ", chair=" + chair +
            ", assistchk=" + assistchk +
            ", incmode=" + incmode +
            ", workwithfilial=" + workwithfilial +
            ", viewinsched=" + viewinsched +
            ", extpcode=" + extpcode +
            ", usestavka=" + usestavka +
            ", useinnarad=" + useinnarad +
            ", asdspeccode=" + asdspeccode +
            ", mphone='" + mphone + '\'' +
            ", shorttalon=" + shorttalon +
            ", specserv=" + specserv +
            ", assisttype=" + assisttype +
            ", jid=" + jid +
            ", schedchairs=" + schedchairs +
            ", matresp=" + matresp +
            ", grstreet='" + grstreet + '\'' +
            ", grsdoct=" + grsdoct +
            ", schedcomment='" + schedcomment + '\'' +
            ", inventcode=" + inventcode +
            ", inventdate=" + inventdate +
            ", accesslevel=" + accesslevel +
            ", shedcardkey='" + shedcardkey + '\'' +
            ", kateg=" + kateg +
            ", callcentre=" + callcentre +
            ", lockdate=" + lockdate +
            ", cashcode=" + cashcode +
            ", texttosched='" + texttosched + '\'' +
            ", fullname2='" + fullname2 + '\'' +
            ", matpersresp=" + matpersresp +
            ", doctpost='" + doctpost + '\'' +
            ", bdate=" + bdate +
            ", schid=" + schid +
            ", enterdate=" + enterdate +
            ", instat=" + instat +
            ", replId=" + replId +
            ", replGrpid=" + replGrpid +
            ", nazncount=" + nazncount +
            ", userid=" + userid +
            ", schedrazdel=" + schedrazdel +
            ", schedinfo='" + schedinfo + '\'' +
            ", bt_profile=" + bt_profile +
            ", grsvid=" + grsvid +
            ", bt_enter_profile=" + bt_enter_profile +
            ", bt_use=" + bt_use +
            ", bt_password='" + bt_password + '\'' +
            ", shinterv=" + shinterv +
            ", stepen=" + stepen +
            ", zvanie=" + zvanie +
            ", schedreserv=" + schedreserv +
            ", obsladd_dis=" + obsladd_dis +
            ", respons=" + respons +
            ", ntuser='" + ntuser + '\'' +
            ", keyprofile='" + keyprofile + '\'' +
            ", grs_koef='" + grs_koef + '\'' +
            ", clmail='" + clmail + '\'' +
            ", systype=" + systype +
            ", profid=" + profid +
            ", chairman=" + chairman +
            ", costtype=" + costtype +
            ", sex=" + sex +
            ", fcfsworktype=" + fcfsworktype +
            ", viewinweb=" + viewinweb +
            ", schedgridtype=" + schedgridtype +
            ", weblogin='" + weblogin + '\'' +
            ", snils='" + snils + '\'' +
            ", parttype=" + parttype +
            ", smtid=" + smtid +
            ", doctcode_reg='" + doctcode_reg + '\'' +
            ", calluserid='" + calluserid + '\'' +
            ", phoneint='" + phoneint + '\'' +
            ", napravreq=" + napravreq +
            ", cashname='" + cashname + '\'' +
            ", lasttreatfilday=" + lasttreatfilday +
            ", lasttreatdepday=" + lasttreatdepday +
            ", lasttreatdocday=" + lasttreatdocday +
            ", calluserpassword='" + calluserpassword + '\'' +
            ", modifydate=" + modifydate +
            ", callsysuser='" + callsysuser + '\'' +
            ", callsyspassword='" + callsyspassword + '\'' +
            ", webname='" + webname + '\'' +
            ", mediaid='" + mediaid + '\'' +
            ", webcomment='" + webcomment + '\'' +
            ", sched_filial_group_id=" + sched_filial_group_id +
            ", extjid=" + extjid +
            ", doctqualifyid=" + doctqualifyid +
            ", doctcode_lgot='" + doctcode_lgot + '\'' +
            ", onlineuserid='" + onlineuserid + '\'' +
            ", dpasswrddate=" + dpasswrddate +
            ", poadata='" + poadata + '\'' +
            ", extguid='" + extguid + '\'' +
            '}';
  }
}
