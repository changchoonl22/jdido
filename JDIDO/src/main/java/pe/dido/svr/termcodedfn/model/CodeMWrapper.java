package pe.dido.svr.termcodedfn.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CodeMWrapper {
	@JsonProperty("codeMListDS")
    private List<CodeM> codeMs;

	public List<CodeM> getCodeMs() {
		return codeMs;
	}

	public void setCodeMs(List<CodeM> codeMs) {
		this.codeMs = codeMs;
	}
}
