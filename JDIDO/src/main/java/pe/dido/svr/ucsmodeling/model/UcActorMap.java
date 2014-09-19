package pe.dido.svr.ucsmodeling.model;

import java.io.Serializable;

public class UcActorMap implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer ucId;
	private Integer actorId;
	public Integer getUcId() {
		return ucId;
	}
	public void setUcId(Integer ucId) {
		this.ucId = ucId;
	}
	public Integer getActorId() {
		return actorId;
	}
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}
	
	
	private String statusYn;
	public String getStatusYn() {
		return statusYn;
	}
	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}
}
