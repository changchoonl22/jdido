package pe.dido.svr.lnkdesign.model;

import java.io.Serializable;

public class LnkSysNode implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table lnk_sys_node
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer sysNodeId;
	private String sysNodeNm;
	private String sysNodeDc;
	private String ntwrkChartr;
	public Integer getSysNodeId() {
		return sysNodeId;
	}
	public void setSysNodeId(Integer sysNodeId) {
		this.sysNodeId = sysNodeId;
	}
	public String getSysNodeNm() {
		return sysNodeNm;
	}
	public void setSysNodeNm(String sysNodeNm) {
		this.sysNodeNm = sysNodeNm;
	}
	public String getSysNodeDc() {
		return sysNodeDc;
	}
	public void setSysNodeDc(String sysNodeDc) {
		this.sysNodeDc = sysNodeDc;
	}
	public String getNtwrkChartr() {
		return ntwrkChartr;
	}
	public void setNtwrkChartr(String ntwrkChartr) {
		this.ntwrkChartr = ntwrkChartr;
	}

	
	private String statusYn;
	public String getStatusYn() {
		return statusYn;
	}
	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}
}