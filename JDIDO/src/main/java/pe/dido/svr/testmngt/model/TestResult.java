package pe.dido.svr.testmngt.model;

import java.io.Serializable;
import java.util.Date;

public class TestResult implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test_result
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer testResultId;
	private Integer testPlnId;
	private String test_ty;
	private String real_result;
	private String testExcDe;
	private String testExcMan;
	private String error_cn;
	private String managt_cn;
	private Date managtDe;
	private String maner;
	public Integer getTestResultId() {
		return testResultId;
	}
	public void setTestResultId(Integer testResultId) {
		this.testResultId = testResultId;
	}
	public Integer getTestPlnId() {
		return testPlnId;
	}
	public void setTestPlnId(Integer testPlnId) {
		this.testPlnId = testPlnId;
	}
	public String getTest_ty() {
		return test_ty;
	}
	public void setTest_ty(String test_ty) {
		this.test_ty = test_ty;
	}
	public String getReal_result() {
		return real_result;
	}
	public void setReal_result(String real_result) {
		this.real_result = real_result;
	}
	public String getTestExcDe() {
		return testExcDe;
	}
	public void setTestExcDe(String testExcDe) {
		this.testExcDe = testExcDe;
	}
	public String getTestExcMan() {
		return testExcMan;
	}
	public void setTestExcMan(String testExcMan) {
		this.testExcMan = testExcMan;
	}
	public String getError_cn() {
		return error_cn;
	}
	public void setError_cn(String error_cn) {
		this.error_cn = error_cn;
	}
	public String getManagt_cn() {
		return managt_cn;
	}
	public void setManagt_cn(String managt_cn) {
		this.managt_cn = managt_cn;
	}
	public Date getManagtDe() {
		return managtDe;
	}
	public void setManagtDe(Date managtDe) {
		this.managtDe = managtDe;
	}
	public String getManer() {
		return maner;
	}
	public void setManer(String maner) {
		this.maner = maner;
	}

}