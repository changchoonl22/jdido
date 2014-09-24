package pe.dido.svr.termcodedfn.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CodeDWrapper {
	@JsonProperty("codeDListDS")
    private List<CodeD> codeDs;

	public List<CodeD> getCodeDs() {
		return codeDs;
	}

	public void setCodeDs(List<CodeD> codeDs) {
		this.codeDs = codeDs;
	}	

}
