package pe.dido.svr.termcodedfn.model;

import java.io.Serializable;

public class Term implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String enAbrv;
	private String enNm;
	private String etcMatterDc;
	private String krAbrv;
	private String krNm;
	private String wordApplcScope;
	private String wordDfn;
	private Integer wordId;
	private String wordNm;
	
	public String getEnAbrv() {
		return enAbrv;
	}
	public String getEnNm() {
		return enNm;
	}
	public String getEtcMatterDc() {
		return etcMatterDc;
	}
	public String getKrAbrv() {
		return krAbrv;
	}
	public String getKrNm() {
		return krNm;
	}
	public String getWordApplcScope() {
		return wordApplcScope;
	}
	public String getWordDfn() {
		return wordDfn;
	}
	public Integer getWordId() {
		return wordId;
	}
	public String getWordNm() {
		return wordNm;
	}
	public void setEnAbrv(String enAbrv) {
		this.enAbrv = enAbrv;
	}
	public void setEnNm(String enNm) {
		this.enNm = enNm;
	}
	public void setEtcMatterDc(String etcMatterDc) {
		this.etcMatterDc = etcMatterDc;
	}
	public void setKrAbrv(String krAbrv) {
		this.krAbrv = krAbrv;
	}
	public void setKrNm(String krNm) {
		this.krNm = krNm;
	}
	public void setWordApplcScope(String wordApplcScope) {
		this.wordApplcScope = wordApplcScope;
	}
	public void setWordDfn(String wordDfn) {
		this.wordDfn = wordDfn;
	}
	public void setWordId(Integer wordId) {
		this.wordId = wordId;
	}
	public void setWordNm(String wordNm) {
		this.wordNm = wordNm;
	}
}