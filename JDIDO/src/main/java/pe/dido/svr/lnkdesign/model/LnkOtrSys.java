package pe.dido.svr.lnkdesign.model;

import java.io.Serializable;

public class LnkOtrSys implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table lnk_otr_sys
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Integer getOtrSysId() {
		return otrSysId;
	}
	public void setOtrSysId(Integer otrSysId) {
		this.otrSysId = otrSysId;
	}
	public String getOtrSysNm() {
		return otrSysNm;
	}
	public void setOtrSysNm(String otrSysNm) {
		this.otrSysNm = otrSysNm;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public Integer getSysNodeId() {
		return sysNodeId;
	}
	public void setSysNodeId(Integer sysNodeId) {
		this.sysNodeId = sysNodeId;
	}
	private Integer otrSysId;
	private String otrSysNm;
	private String dc;
	private Integer sysNodeId;

	private String statusYn;
	public String getStatusYn() {
		return statusYn;
	}
	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}
}