package pe.dido.svr.lnkdesign.model;

import java.io.Serializable;

public class LnkOtrSys implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table lnk_otr_sys
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column lnk_otr_sys.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String dc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column lnk_otr_sys.OTR_SYS_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer otrSysId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column lnk_otr_sys.OTR_SYS_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String otrSysNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column lnk_otr_sys.SYS_NODE_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer sysNodeId;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table lnk_otr_sys
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
		LnkOtrSys other = (LnkOtrSys) that;
		return (this.getOtrSysId() == null ? other.getOtrSysId() == null : this
				.getOtrSysId().equals(other.getOtrSysId()))
				&& (this.getOtrSysNm() == null ? other.getOtrSysNm() == null
						: this.getOtrSysNm().equals(other.getOtrSysNm()))
				&& (this.getSysNodeId() == null ? other.getSysNodeId() == null
						: this.getSysNodeId().equals(other.getSysNodeId()))
				&& (this.getDc() == null ? other.getDc() == null : this.getDc()
						.equals(other.getDc()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column lnk_otr_sys.DC
	 * @return  the value of lnk_otr_sys.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getDc() {
		return dc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column lnk_otr_sys.OTR_SYS_ID
	 * @return  the value of lnk_otr_sys.OTR_SYS_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public Integer getOtrSysId() {
		return otrSysId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column lnk_otr_sys.OTR_SYS_NM
	 * @return  the value of lnk_otr_sys.OTR_SYS_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getOtrSysNm() {
		return otrSysNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column lnk_otr_sys.SYS_NODE_ID
	 * @return  the value of lnk_otr_sys.SYS_NODE_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public Integer getSysNodeId() {
		return sysNodeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table lnk_otr_sys
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getOtrSysId() == null) ? 0 : getOtrSysId().hashCode());
		result = prime * result
				+ ((getOtrSysNm() == null) ? 0 : getOtrSysNm().hashCode());
		result = prime * result
				+ ((getSysNodeId() == null) ? 0 : getSysNodeId().hashCode());
		result = prime * result + ((getDc() == null) ? 0 : getDc().hashCode());
		return result;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column lnk_otr_sys.DC
	 * @param dc  the value for lnk_otr_sys.DC
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setDc(String dc) {
		this.dc = dc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column lnk_otr_sys.OTR_SYS_ID
	 * @param otrSysId  the value for lnk_otr_sys.OTR_SYS_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setOtrSysId(Integer otrSysId) {
		this.otrSysId = otrSysId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column lnk_otr_sys.OTR_SYS_NM
	 * @param otrSysNm  the value for lnk_otr_sys.OTR_SYS_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setOtrSysNm(String otrSysNm) {
		this.otrSysNm = otrSysNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column lnk_otr_sys.SYS_NODE_ID
	 * @param sysNodeId  the value for lnk_otr_sys.SYS_NODE_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setSysNodeId(Integer sysNodeId) {
		this.sysNodeId = sysNodeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table lnk_otr_sys
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", otrSysId=").append(otrSysId);
		sb.append(", otrSysNm=").append(otrSysNm);
		sb.append(", sysNodeId=").append(sysNodeId);
		sb.append(", dc=").append(dc);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}