package pe.dido.svr.bizmodeling.model;

import java.io.Serializable;

public class BizCncpt implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table biz_cncpt
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer cncptId;
	private String cncptKrNm;
	private String cncptDc;
	private Integer pckageId;
	public Integer getCncptId() {
		return cncptId;
	}
	public void setCncptId(Integer cncptId) {
		this.cncptId = cncptId;
	}
	public String getCncptKrNm() {
		return cncptKrNm;
	}
	public void setCncptKrNm(String cncptKrNm) {
		this.cncptKrNm = cncptKrNm;
	}
	public String getCncptDc() {
		return cncptDc;
	}
	public void setCncptDc(String cncptDc) {
		this.cncptDc = cncptDc;
	}
	public Integer getPckageId() {
		return pckageId;
	}
	public void setPckageId(Integer pckageId) {
		this.pckageId = pckageId;
	}
	private String crudTy;
	public String getCrudTy() {
		return crudTy;
	}
	public void setCrudTy(String crudTy) {
		this.crudTy = crudTy;
	}
}