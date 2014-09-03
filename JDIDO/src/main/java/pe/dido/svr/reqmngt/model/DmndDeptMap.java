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

	private String crudTy;
	public String getCrudTy() {
		return crudTy;
	}
	public void setCrudTy(String crudTy) {
		this.crudTy = crudTy;
	}
}
