package pe.dido.svr.termcodedfn.model;

import java.io.Serializable;

public class CodeD implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table code_d
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column code_d.CODE_VALUE
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String codeValueID;
	
	public String getCodeValueID() {
		return codeValueID;
	}

	public void setCodeValueID(String codeValueID) {
		this.codeValueID = codeValueID;
	}
	
	public String getCodeID() {
		return codeID;
	}

	public void setCodeID(String codeID) {
		this.codeID = codeID;
	}

	private String codeID;

	private String codeValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column code_d.CODE_VALUE_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String codeValueNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column code_d.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String dc;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column code_d.CODE_VALUE
	 * @return  the value of code_d.CODE_VALUE
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getCodeValue() {
		return codeValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column code_d.CODE_VALUE_NM
	 * @return  the value of code_d.CODE_VALUE_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getCodeValueNm() {
		return codeValueNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column code_d.DC
	 * @return  the value of code_d.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getDc() {
		return dc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column code_d.CODE_VALUE
	 * @param codeValue  the value for code_d.CODE_VALUE
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column code_d.CODE_VALUE_NM
	 * @param codeValueNm  the value for code_d.CODE_VALUE_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setCodeValueNm(String codeValueNm) {
		this.codeValueNm = codeValueNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column code_d.DC
	 * @param dc  the value for code_d.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setDc(String dc) {
		this.dc = dc;
	}

}