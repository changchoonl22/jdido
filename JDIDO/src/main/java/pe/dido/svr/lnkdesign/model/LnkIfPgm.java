package pe.dido.svr.lnkdesign.model;

import java.io.Serializable;

public class LnkIfPgm implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table lnk_if_pgm
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;

	public Integer getIntrfcId() {
		return intrfcId;
	}
	public void setIntrfcId(Integer intrfcId) {
		this.intrfcId = intrfcId;
	}
	public Integer getPgmId() {
		return pgmId;
	}
	public void setPgmId(Integer pgmId) {
		this.pgmId = pgmId;
	}
	public String getPgmNm() {
		return pgmNm;
	}
	public void setPgmNm(String pgmNm) {
		this.pgmNm = pgmNm;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public String getIntrlckIemNm() {
		return intrlckIemNm;
	}
	public void setIntrlckIemNm(String intrlckIemNm) {
		this.intrlckIemNm = intrlckIemNm;
	}
	public String getRstrct_matter() {
		return rstrct_matter;
	}
	public void setRstrct_matter(String rstrct_matter) {
		this.rstrct_matter = rstrct_matter;
	}
	public String getPrpos() {
		return prpos;
	}
	public void setPrpos(String prpos) {
		this.prpos = prpos;
	}
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public String getScrtyGrad() {
		return scrtyGrad;
	}
	public void setScrtyGrad(String scrtyGrad) {
		this.scrtyGrad = scrtyGrad;
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	private Integer intrfcId;
	private Integer pgmId;
	private String pgmNm;
	private String dc;
	private String intrlckIemNm;
	private String rstrct_matter;
	private String prpos;
	private String cycle;
	private String scrtyGrad;
	private String rm;

	private String statusYn;
	public String getStatusYn() {
		return statusYn;
	}
	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}
}