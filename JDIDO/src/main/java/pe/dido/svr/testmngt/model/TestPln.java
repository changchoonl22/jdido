package pe.dido.svr.testmngt.model;

import java.io.Serializable;

public class TestPln implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test_pln
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer testPlnId;
	private String test_ty;
	private String test_iem;
	private String testcase_nm;
	private String input_value;
	private String dicaryCndDc;
	private String expect_result;
	private String testExcProcss_dc;
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
	public String getTest_iem() {
		return test_iem;
	}
	public void setTest_iem(String test_iem) {
		this.test_iem = test_iem;
	}
	public String getTestcase_nm() {
		return testcase_nm;
	}
	public void setTestcase_nm(String testcase_nm) {
		this.testcase_nm = testcase_nm;
	}
	public String getInput_value() {
		return input_value;
	}
	public void setInput_value(String input_value) {
		this.input_value = input_value;
	}
	public String getDicaryCndDc() {
		return dicaryCndDc;
	}
	public void setDicaryCndDc(String dicaryCndDc) {
		this.dicaryCndDc = dicaryCndDc;
	}
	public String getExpect_result() {
		return expect_result;
	}
	public void setExpect_result(String expect_result) {
		this.expect_result = expect_result;
	}
	public String getTestExcProcss_dc() {
		return testExcProcss_dc;
	}
	public void setTestExcProcss_dc(String testExcProcss_dc) {
		this.testExcProcss_dc = testExcProcss_dc;
	}
	
	
	private String statusYn;
	public String getStatusYn() {
		return statusYn;
	}
	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}

}