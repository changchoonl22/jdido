package pe.dido.svr.bizmodeling.model;

import java.io.Serializable;

public class BizProcs implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table biz_procs
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;

	
	private Integer procsId;
	private Integer pckageId;
	private String procsNm;
	private String procsCd;
	private String procsDc;
	private String cndcyUcYn;
	public Integer getProcsId() {
		return procsId;
	}
	public void setProcsId(Integer procsId) {
		this.procsId = procsId;
	}
	public Integer getPckageId() {
		return pckageId;
	}
	public void setPckageId(Integer pckageId) {
		this.pckageId = pckageId;
	}
	public String getProcsNm() {
		return procsNm;
	}
	public void setProcsNm(String procsNm) {
		this.procsNm = procsNm;
	}
	public String getProcsCd() {
		return procsCd;
	}
	public void setProcsCd(String procsCd) {
		this.procsCd = procsCd;
	}
	public String getProcsDc() {
		return procsDc;
	}
	public void setProcsDc(String procsDc) {
		this.procsDc = procsDc;
	}
	public String getCndcyUcYn() {
		return cndcyUcYn;
	}
	public void setCndcyUcYn(String cndcyUcYn) {
		this.cndcyUcYn = cndcyUcYn;
	}

	
	private String statusYn;
	public String getStatusYn() {
		return statusYn;
	}
	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}
	
	
}