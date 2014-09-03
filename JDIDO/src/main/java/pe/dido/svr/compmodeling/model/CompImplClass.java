package pe.dido.svr.compmodeling.model;

import java.io.Serializable;

public class CompImplClass implements Serializable {
	public Integer getInnerClassId() {
		return innerClassId;
	}
	public void setInnerClassId(Integer innerClassId) {
		this.innerClassId = innerClassId;
	}
	public Integer getCompnId() {
		return compnId;
	}
	public void setCompnId(Integer compnId) {
		this.compnId = compnId;
	}
	public String getEmbdClassNm() {
		return embdClassNm;
	}
	public void setEmbdClassNm(String embdClassNm) {
		this.embdClassNm = embdClassNm;
	}
	public String getEmbdClassDc() {
		return embdClassDc;
	}
	public void setEmbdClassDc(String embdClassDc) {
		this.embdClassDc = embdClassDc;
	}
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table comp_impl_class
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer innerClassId;
	private Integer compnId;
	private String embdClassNm;
	private String embdClassDc;

	private String crudTy;
	public String getCrudTy() {
		return crudTy;
	}
	public void setCrudTy(String crudTy) {
		this.crudTy = crudTy;
	}
}