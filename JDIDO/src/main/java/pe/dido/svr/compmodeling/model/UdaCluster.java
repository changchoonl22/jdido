package pe.dido.svr.compmodeling.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class UdaCluster implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table uda_cluster
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column uda_cluster.ACCES_VALUE
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Long accesValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column uda_cluster.CLASS_EN_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer classEnNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column uda_cluster.COMPN_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String compnNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column uda_cluster.COMPN_TY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String compnTy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column uda_cluster.GRAD
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String grad;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column uda_cluster.UC_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer ucId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column uda_cluster.WGHTVAL
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private BigDecimal wghtval;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column uda_cluster.ACCES_VALUE
	 * @return  the value of uda_cluster.ACCES_VALUE
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public Long getAccesValue() {
		return accesValue;
	}

	/**
	 * @return the classEnNm
	 */
	public Integer getClassEnNm() {
		return classEnNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column uda_cluster.COMPN_NM
	 * @return  the value of uda_cluster.COMPN_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getCompnNm() {
		return compnNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column uda_cluster.COMPN_TY
	 * @return  the value of uda_cluster.COMPN_TY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getCompnTy() {
		return compnTy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column uda_cluster.GRAD
	 * @return  the value of uda_cluster.GRAD
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getGrad() {
		return grad;
	}

	/**
	 * @return the ucId
	 */
	public Integer getUcId() {
		return ucId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column uda_cluster.WGHTVAL
	 * @return  the value of uda_cluster.WGHTVAL
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public BigDecimal getWghtval() {
		return wghtval;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column uda_cluster.ACCES_VALUE
	 * @param accesValue  the value for uda_cluster.ACCES_VALUE
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setAccesValue(Long accesValue) {
		this.accesValue = accesValue;
	}

	/**
	 * @param classEnNm the classEnNm to set
	 */
	public void setClassEnNm(Integer classEnNm) {
		this.classEnNm = classEnNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column uda_cluster.COMPN_NM
	 * @param compnNm  the value for uda_cluster.COMPN_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setCompnNm(String compnNm) {
		this.compnNm = compnNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column uda_cluster.COMPN_TY
	 * @param compnTy  the value for uda_cluster.COMPN_TY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setCompnTy(String compnTy) {
		this.compnTy = compnTy;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column uda_cluster.GRAD
	 * @param grad  the value for uda_cluster.GRAD
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setGrad(String grad) {
		this.grad = grad;
	}

	/**
	 * @param ucId the ucId to set
	 */
	public void setUcId(Integer ucId) {
		this.ucId = ucId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column uda_cluster.WGHTVAL
	 * @param wghtval  the value for uda_cluster.WGHTVAL
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setWghtval(BigDecimal wghtval) {
		this.wghtval = wghtval;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uda_cluster
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", grad=").append(grad);
		sb.append(", accesValue=").append(accesValue);
		sb.append(", wghtval=").append(wghtval);
		sb.append(", compnTy=").append(compnTy);
		sb.append(", compnNm=").append(compnNm);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}


}