package pe.dido.svr.clzmodeling.model;

import java.io.Serializable;

public class ClassOp implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table class_op
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_op.CLASS_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer classId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_op.OP_EN_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String opEnNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_op.OP_KR_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String opKrNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_op.OPRTIN_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer oprtinId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_op.PARM_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String parmNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_op.RETURN_TY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String returnTy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_op.VISIBLTY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String visiblty;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_op
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
		ClassOp other = (ClassOp) that;
		return (this.getOprtinId() == null ? other.getOprtinId() == null : this
				.getOprtinId().equals(other.getOprtinId()))
				&& (this.getClassId() == null ? other.getClassId() == null
						: this.getClassId().equals(other.getClassId()))
				&& (this.getOpEnNm() == null ? other.getOpEnNm() == null : this
						.getOpEnNm().equals(other.getOpEnNm()))
				&& (this.getOpKrNm() == null ? other.getOpKrNm() == null : this
						.getOpKrNm().equals(other.getOpKrNm()))
				&& (this.getVisiblty() == null ? other.getVisiblty() == null
						: this.getVisiblty().equals(other.getVisiblty()))
				&& (this.getReturnTy() == null ? other.getReturnTy() == null
						: this.getReturnTy().equals(other.getReturnTy()))
				&& (this.getParmNm() == null ? other.getParmNm() == null : this
						.getParmNm().equals(other.getParmNm()));
	}

	/**
	 * @return the classId
	 */
	public Integer getClassId() {
		return classId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_op.OP_EN_NM
	 * @return  the value of class_op.OP_EN_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getOpEnNm() {
		return opEnNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_op.OP_KR_NM
	 * @return  the value of class_op.OP_KR_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getOpKrNm() {
		return opKrNm;
	}

	/**
	 * @return the oprtinId
	 */
	public Integer getOprtinId() {
		return oprtinId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_op.PARM_NM
	 * @return  the value of class_op.PARM_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getParmNm() {
		return parmNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_op.RETURN_TY
	 * @return  the value of class_op.RETURN_TY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getReturnTy() {
		return returnTy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_op.VISIBLTY
	 * @return  the value of class_op.VISIBLTY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getVisiblty() {
		return visiblty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_op
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getOprtinId() == null) ? 0 : getOprtinId().hashCode());
		result = prime * result
				+ ((getClassId() == null) ? 0 : getClassId().hashCode());
		result = prime * result
				+ ((getOpEnNm() == null) ? 0 : getOpEnNm().hashCode());
		result = prime * result
				+ ((getOpKrNm() == null) ? 0 : getOpKrNm().hashCode());
		result = prime * result
				+ ((getVisiblty() == null) ? 0 : getVisiblty().hashCode());
		result = prime * result
				+ ((getReturnTy() == null) ? 0 : getReturnTy().hashCode());
		result = prime * result
				+ ((getParmNm() == null) ? 0 : getParmNm().hashCode());
		return result;
	}

	/**
	 * @param classId the classId to set
	 */
	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_op.OP_EN_NM
	 * @param opEnNm  the value for class_op.OP_EN_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setOpEnNm(String opEnNm) {
		this.opEnNm = opEnNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_op.OP_KR_NM
	 * @param opKrNm  the value for class_op.OP_KR_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setOpKrNm(String opKrNm) {
		this.opKrNm = opKrNm;
	}

	/**
	 * @param oprtinId the oprtinId to set
	 */
	public void setOprtinId(Integer oprtinId) {
		this.oprtinId = oprtinId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_op.PARM_NM
	 * @param parmNm  the value for class_op.PARM_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setParmNm(String parmNm) {
		this.parmNm = parmNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_op.RETURN_TY
	 * @param returnTy  the value for class_op.RETURN_TY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setReturnTy(String returnTy) {
		this.returnTy = returnTy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_op.VISIBLTY
	 * @param visiblty  the value for class_op.VISIBLTY
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setVisiblty(String visiblty) {
		this.visiblty = visiblty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_op
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", opEnNm=").append(opEnNm);
		sb.append(", opKrNm=").append(opKrNm);
		sb.append(", visiblty=").append(visiblty);
		sb.append(", returnTy=").append(returnTy);
		sb.append(", parmNm=").append(parmNm);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}