package pe.dido.svr.reqmngt.model;

public class DmndDeptMap {
	
	private Integer dmndId;
	private Integer deptId;
	public Integer getDmndId() {
		return dmndId;
	}
	public void setDmndId(Integer dmndId) {
		this.dmndId = dmndId;
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
