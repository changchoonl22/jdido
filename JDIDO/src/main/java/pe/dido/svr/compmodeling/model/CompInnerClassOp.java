package pe.dido.svr.compmodeling.model;

import java.io.Serializable;

public class CompInnerClassOp implements Serializable {
	public Integer getOprtinId() {
		return oprtinId;
	}
	public void setOprtinId(Integer oprtinId) {
		this.oprtinId = oprtinId;
	}
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
	public String getOprtinNm() {
		return oprtinNm;
	}
	public void setOprtinNm(String oprtinNm) {
		this.oprtinNm = oprtinNm;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getReturnTy() {
		return returnTy;
	}
	public void setReturnTy(String returnTy) {
		this.returnTy = returnTy;
	}
	public String getParamtrNm() {
		return paramtrNm;
	}
	public void setParamtrNm(String paramtrNm) {
		this.paramtrNm = paramtrNm;
	}
	public String getParamtrDc() {
		return paramtrDc;
	}
	public void setParamtrDc(String paramtrDc) {
		this.paramtrDc = paramtrDc;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table comp_inner_class_op
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;

	
	private Integer oprtinId;
	private Integer innerClassId;
	private Integer compnId;
	private String oprtinNm;
	private String scope;
	private String returnTy;
	private String paramtrNm;
	private String paramtrDc;
	private String dc;

}