package pe.dido.svr.compmodeling.model;

import java.io.Serializable;

public class CompIfclass implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table comp_ifclass
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comp_ifclass.COMPN_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer compnId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comp_ifclass.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String dc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comp_ifclass.IF_OPRTIN_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer ifOprtinId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comp_ifclass.IF_OPRTIN_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String ifOprtinNm;

	/**
	 * @return the compnId
	 */
	public Integer getCompnId() {
		return compnId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_ifclass.DC
	 * @return  the value of comp_ifclass.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getDc() {
		return dc;
	}

	/**
	 * @return the ifOprtinId
	 */
	public Integer getIfOprtinId() {
		return ifOprtinId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_ifclass.IF_OPRTIN_NM
	 * @return  the value of comp_ifclass.IF_OPRTIN_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getIfOprtinNm() {
		return ifOprtinNm;
	}

	/**
	 * @param compnId the compnId to set
	 */
	public void setCompnId(Integer compnId) {
		this.compnId = compnId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_ifclass.DC
	 * @param dc  the value for comp_ifclass.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setDc(String dc) {
		this.dc = dc;
	}

	/**
	 * @param ifOprtinId the ifOprtinId to set
	 */
	public void setIfOprtinId(Integer ifOprtinId) {
		this.ifOprtinId = ifOprtinId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_ifclass.IF_OPRTIN_NM
	 * @param ifOprtinNm  the value for comp_ifclass.IF_OPRTIN_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setIfOprtinNm(String ifOprtinNm) {
		this.ifOprtinNm = ifOprtinNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comp_ifclass
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", ifOprtinNm=").append(ifOprtinNm);
		sb.append(", dc=").append(dc);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}