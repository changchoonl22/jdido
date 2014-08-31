package pe.dido.svr.reqmngt.model;

import java.io.Serializable;

public class DmndM implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table dmnd_m
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dmnd_m.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String dc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dmnd_m.DMND_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer dmndId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dmnd_m.DMND_IDNTFR
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String dmndIdntfr;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dmnd_m.DMND_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String dmndNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dmnd_m.DMND_PRIORT
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String dmndPriort;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dmnd_m.DMND_TY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String dmndTy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dmnd_m.PRE_CND
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String preCnd;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dmnd_m
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		DmndM other = (DmndM) that;
		return (this.getDmndId() == null ? other.getDmndId() == null : this
				.getDmndId().equals(other.getDmndId()))
				&& (this.getDmndIdntfr() == null ? other.getDmndIdntfr() == null
						: this.getDmndIdntfr().equals(other.getDmndIdntfr()))
				&& (this.getDmndNm() == null ? other.getDmndNm() == null : this
						.getDmndNm().equals(other.getDmndNm()))
				&& (this.getDmndTy() == null ? other.getDmndTy() == null : this
						.getDmndTy().equals(other.getDmndTy()))
				&& (this.getPreCnd() == null ? other.getPreCnd() == null : this
						.getPreCnd().equals(other.getPreCnd()))
				&& (this.getDmndPriort() == null ? other.getDmndPriort() == null
						: this.getDmndPriort().equals(other.getDmndPriort()))
				&& (this.getDc() == null ? other.getDc() == null : this.getDc()
						.equals(other.getDc()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dmnd_m.DC
	 * @return  the value of dmnd_m.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getDc() {
		return dc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dmnd_m.DMND_ID
	 * @return  the value of dmnd_m.DMND_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public Integer getDmndId() {
		return dmndId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dmnd_m.DMND_IDNTFR
	 * @return  the value of dmnd_m.DMND_IDNTFR
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getDmndIdntfr() {
		return dmndIdntfr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dmnd_m.DMND_NM
	 * @return  the value of dmnd_m.DMND_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getDmndNm() {
		return dmndNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dmnd_m.DMND_PRIORT
	 * @return  the value of dmnd_m.DMND_PRIORT
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getDmndPriort() {
		return dmndPriort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dmnd_m.DMND_TY
	 * @return  the value of dmnd_m.DMND_TY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getDmndTy() {
		return dmndTy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dmnd_m.PRE_CND
	 * @return  the value of dmnd_m.PRE_CND
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getPreCnd() {
		return preCnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dmnd_m
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getDmndId() == null) ? 0 : getDmndId().hashCode());
		result = prime * result
				+ ((getDmndIdntfr() == null) ? 0 : getDmndIdntfr().hashCode());
		result = prime * result
				+ ((getDmndNm() == null) ? 0 : getDmndNm().hashCode());
		result = prime * result
				+ ((getDmndTy() == null) ? 0 : getDmndTy().hashCode());
		result = prime * result
				+ ((getPreCnd() == null) ? 0 : getPreCnd().hashCode());
		result = prime * result
				+ ((getDmndPriort() == null) ? 0 : getDmndPriort().hashCode());
		result = prime * result + ((getDc() == null) ? 0 : getDc().hashCode());
		return result;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dmnd_m.DC
	 * @param dc  the value for dmnd_m.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setDc(String dc) {
		this.dc = dc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dmnd_m.DMND_ID
	 * @param dmndId  the value for dmnd_m.DMND_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setDmndId(Integer dmndId) {
		this.dmndId = dmndId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dmnd_m.DMND_IDNTFR
	 * @param dmndIdntfr  the value for dmnd_m.DMND_IDNTFR
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setDmndIdntfr(String dmndIdntfr) {
		this.dmndIdntfr = dmndIdntfr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dmnd_m.DMND_NM
	 * @param dmndNm  the value for dmnd_m.DMND_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setDmndNm(String dmndNm) {
		this.dmndNm = dmndNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dmnd_m.DMND_PRIORT
	 * @param dmndPriort  the value for dmnd_m.DMND_PRIORT
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setDmndPriort(String dmndPriort) {
		this.dmndPriort = dmndPriort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dmnd_m.DMND_TY
	 * @param dmndTy  the value for dmnd_m.DMND_TY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setDmndTy(String dmndTy) {
		this.dmndTy = dmndTy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dmnd_m.PRE_CND
	 * @param preCnd  the value for dmnd_m.PRE_CND
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setPreCnd(String preCnd) {
		this.preCnd = preCnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dmnd_m
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", dmndId=").append(dmndId);
		sb.append(", dmndIdntfr=").append(dmndIdntfr);
		sb.append(", dmndNm=").append(dmndNm);
		sb.append(", dmndTy=").append(dmndTy);
		sb.append(", preCnd=").append(preCnd);
		sb.append(", dmndPriort=").append(dmndPriort);
		sb.append(", dc=").append(dc);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}