package pe.dido.svr.ucsmodeling.model;

import java.io.Serializable;

public class UcActor implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table uc_actor
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer actorId;
	private String actorNm;
	private String actorDc;
	public Integer getActorId() {
		return actorId;
	}
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}
	public String getActorNm() {
		return actorNm;
	}
	public void setActorNm(String actorNm) {
		this.actorNm = actorNm;
	}
	public String getActorDc() {
		return actorDc;
	}
	public void setActorDc(String actorDc) {
		this.actorDc = actorDc;
	}
	
	private String statusYn;
	public String getStatusYn() {
		return statusYn;
	}
	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}

}