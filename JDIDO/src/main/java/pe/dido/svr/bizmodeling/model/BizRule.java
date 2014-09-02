package pe.dido.svr.bizmodeling.model;

import java.io.Serializable;

public class BizRule implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table biz_rule
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;

	private Integer bizActnId;
	private Integer procsId;
	private String bizActnNm;
	private String bizRuleNm;
	public Integer getBizActnId() {
		return bizActnId;
	}
	public void setBizActnId(Integer bizActnId) {
		this.bizActnId = bizActnId;
	}
	public Integer getProcsId() {
		return procsId;
	}
	public void setProcsId(Integer procsId) {
		this.procsId = procsId;
	}
	public String getBizActnNm() {
		return bizActnNm;
	}
	public void setBizActnNm(String bizActnNm) {
		this.bizActnNm = bizActnNm;
	}
	public String getBizRuleNm() {
		return bizRuleNm;
	}
	public void setBizRuleNm(String bizRuleNm) {
		this.bizRuleNm = bizRuleNm;
	}
	public String getBizRuleDc() {
		return bizRuleDc;
	}
	public void setBizRuleDc(String bizRuleDc) {
		this.bizRuleDc = bizRuleDc;
	}
	public String getCndcyEventYn() {
		return cndcyEventYn;
	}
	public void setCndcyEventYn(String cndcyEventYn) {
		this.cndcyEventYn = cndcyEventYn;
	}
	private String bizRuleDc;
	private String cndcyEventYn;

	
}