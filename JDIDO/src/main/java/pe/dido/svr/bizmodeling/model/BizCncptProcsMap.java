package pe.dido.svr.bizmodeling.model;

import java.io.Serializable;

public class BizCncptProcsMap implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Integer getCncptId() {
		return cncptId;
	}
	public void setCncptId(Integer cncptId) {
		this.cncptId = cncptId;
	}
	public Integer getProcsId() {
		return procsId;
	}
	public void setProcsId(Integer procsId) {
		this.procsId = procsId;
	}
	public String getRelateSe() {
		return relateSe;
	}
	public void setRelateSe(String relateSe) {
		this.relateSe = relateSe;
	}
	private Integer cncptId;
	private Integer procsId;
	private String relateSe;

	
	private String statusYn;
	public String getStatusYn() {
		return statusYn;
	}
	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}
	
	
}
