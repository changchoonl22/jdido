package pe.dido.svr.reqmngt.model;

public class UpperDmndDmndMap {
	
	private Integer upperDmndId;
	private Integer dmndId;
	public Integer getUpperDmndId() {
		return upperDmndId;
	}
	public void setUpperDmndId(Integer upperDmndId) {
		this.upperDmndId = upperDmndId;
	}
	public Integer getDmndId() {
		return dmndId;
	}
	public void setDmndId(Integer dmndId) {
		this.dmndId = dmndId;
	}
	private String crudTy;
	public String getCrudTy() {
		return crudTy;
	}
	public void setCrudTy(String crudTy) {
		this.crudTy = crudTy;
	}

}
