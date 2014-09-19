package pe.dido.svr.bizmodeling.model;

import java.io.Serializable;

public class BizActorDeptMap implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer bizActorId;
	private Integer deptId;
	public Integer getBizActorId() {
		return bizActorId;
	}
	public void setBizActorId(Integer bizActorId) {
		this.bizActorId = bizActorId;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	
	private String statusYn;
	public String getStatusYn() {
		return statusYn;
	}
	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}
	
	
}
