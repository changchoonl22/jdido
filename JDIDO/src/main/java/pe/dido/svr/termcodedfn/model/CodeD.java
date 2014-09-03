package pe.dido.svr.termcodedfn.model;

import java.io.Serializable;

public class CodeD implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer codeValueID;
	private Integer codeID;
	private String codeValue;
	private String codeValueNm;
	private String dc;
	private Float abc;
	
		
	
	public Integer getCodeValueID() {
		return codeValueID;
	}
	public void setCodeValueID(Integer codeValueID) {
		this.codeValueID = codeValueID;
	}
	public Integer getCodeID() {
		return codeID;
	}
	public void setCodeID(Integer codeID) {
		this.codeID = codeID;
	}
	public String getCodeValue() {
		return codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	public String getCodeValueNm() {
		return codeValueNm;
	}
	public void setCodeValueNm(String codeValueNm) {
		this.codeValueNm = codeValueNm;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String crudTy;
	public String getCrudTy() {
		return crudTy;
	}
	public void setCrudTy(String crudTy) {
		this.crudTy = crudTy;
	}
}