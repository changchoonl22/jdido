package pe.dido.svr.uidesign.model;

import java.io.Serializable;

public class UiAuthorMap implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ui_author_map
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer authorId;
	private Integer scrinId;
	private String authorApplcYn;
	public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	public Integer getScrinId() {
		return scrinId;
	}
	public void setScrinId(Integer scrinId) {
		this.scrinId = scrinId;
	}
	public String getAuthorApplcYn() {
		return authorApplcYn;
	}
	public void setAuthorApplcYn(String authorApplcYn) {
		this.authorApplcYn = authorApplcYn;
	}
	private String crudTy;
	public String getCrudTy() {
		return crudTy;
	}
	public void setCrudTy(String crudTy) {
		this.crudTy = crudTy;
	}

}