package pe.dido.svr.termcodedfn.model;

import java.io.Serializable;

public class CodeM implements Serializable {
	private static final long serialVersionUID = 1L;
	private int cdId;
	private String codeIdntfr;
	private String cdNm;
	private String cdEnNm;
	private String cdEnAbrvNm;
	private String dc;
	private String dataTy;
	private String dataLnth;
	private String stdCodeAt;
	private String rm;
	private String nwdAt;
	
	public int getCdId() {
		return cdId;
	}
	public void setCdId(int cdId) {
		this.cdId = cdId;
	}
	public String getCodeIdntfr() {
		return codeIdntfr;
	}
	public void setCodeIdntfr(String codeIdntfr) {
		this.codeIdntfr = codeIdntfr;
	}
	public String getCdNm() {
		return cdNm;
	}
	public void setCdNm(String cdNm) {
		this.cdNm = cdNm;
	}
	public String getCdEnNm() {
		return cdEnNm;
	}
	public void setCdEnNm(String cdEnNm) {
		this.cdEnNm = cdEnNm;
	}
	public String getCdEnAbrvNm() {
		return cdEnAbrvNm;
	}
	public void setCdEnAbrvNm(String cdEnAbrvNm) {
		this.cdEnAbrvNm = cdEnAbrvNm;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public String getDataTy() {
		return dataTy;
	}
	public void setDataTy(String dataTy) {
		this.dataTy = dataTy;
	}
	public String getDataLnth() {
		return dataLnth;
	}
	public void setDataLnth(String dataLnth) {
		this.dataLnth = dataLnth;
	}
	public String getStdCodeAt() {
		return stdCodeAt;
	}
	public void setStdCodeAt(String stdCodeAt) {
		this.stdCodeAt = stdCodeAt;
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getNwdAt() {
		return nwdAt;
	}
	public void setNwdAt(String nwdAt) {
		this.nwdAt = nwdAt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}