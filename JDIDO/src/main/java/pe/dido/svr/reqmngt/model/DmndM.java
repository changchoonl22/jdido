package pe.dido.svr.reqmngt.model;

import java.io.Serializable;

public class DmndM implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table dmnd_m
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer dmndId;
	private String dmndIdntfr;
	private String dmndNm;
	private String dmndTy;
	private String dc;
	private String preCnd;
	private String dmndPriorty;
	public Integer getDmndId() {
		return dmndId;
	}
	public void setDmndId(Integer dmndId) {
		this.dmndId = dmndId;
	}
	public String getDmndIdntfr() {
		return dmndIdntfr;
	}
	public void setDmndIdntfr(String dmndIdntfr) {
		this.dmndIdntfr = dmndIdntfr;
	}
	public String getDmndNm() {
		return dmndNm;
	}
	public void setDmndNm(String dmndNm) {
		this.dmndNm = dmndNm;
	}
	public String getDmndTy() {
		return dmndTy;
	}
	public void setDmndTy(String dmndTy) {
		this.dmndTy = dmndTy;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public String getPreCnd() {
		return preCnd;
	}
	public void setPreCnd(String preCnd) {
		this.preCnd = preCnd;
	}
	public String getDmndPriorty() {
		return dmndPriorty;
	}
	public void setDmndPriorty(String dmndPriorty) {
		this.dmndPriorty = dmndPriorty;
	}
	private String crudTy;
	public String getCrudTy() {
		return crudTy;
	}
	public void setCrudTy(String crudTy) {
		this.crudTy = crudTy;
	}
}