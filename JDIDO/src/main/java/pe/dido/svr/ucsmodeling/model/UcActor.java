package pe.dido.svr.ucsmodeling.model;

import java.io.Serializable;

public class UcActor implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table uc_actor
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer actorId;
	private String actor_nm;
	private String actor_dc;
	public Integer getActorId() {
		return actorId;
	}
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}
	public String getActor_nm() {
		return actor_nm;
	}
	public void setActor_nm(String actor_nm) {
		this.actor_nm = actor_nm;
	}
	public String getActor_dc() {
		return actor_dc;
	}
	public void setActor_dc(String actor_dc) {
		this.actor_dc = actor_dc;
	}

}