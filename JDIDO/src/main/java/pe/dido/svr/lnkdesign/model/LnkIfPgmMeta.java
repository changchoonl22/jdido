package pe.dido.svr.lnkdesign.model;

import java.io.Serializable;

public class LnkIfPgmMeta implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table lnk_if_pgm_meta
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;

	
	public Integer getDataId() {
		return dataId;
	}
	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}
	public Integer getPgmId() {
		return pgmId;
	}
	public void setPgmId(Integer pgmId) {
		this.pgmId = pgmId;
	}
	public Integer getIntrfcId() {
		return intrfcId;
	}
	public void setIntrfcId(Integer intrfcId) {
		this.intrfcId = intrfcId;
	}
	public String getDataIem() {
		return dataIem;
	}
	public void setDataIem(String dataIem) {
		this.dataIem = dataIem;
	}
	public String getDataAtrb() {
		return dataAtrb;
	}
	public void setDataAtrb(String dataAtrb) {
		this.dataAtrb = dataAtrb;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	private Integer dataId;
	private Integer pgmId;
	private Integer intrfcId;
	private String dataIem;
	private String dataAtrb;
	private String dc;
	private String crudTy;
	public String getCrudTy() {
		return crudTy;
	}
	public void setCrudTy(String crudTy) {
		this.crudTy = crudTy;
	}
}