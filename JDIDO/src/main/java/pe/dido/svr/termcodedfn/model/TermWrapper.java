package pe.dido.svr.termcodedfn.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TermWrapper {
	@JsonProperty("termListDS")
    private List<Term> terms;

    public List<Term> getTerms() {
        return terms;
    }

    public void setTerms(List<Term> terms) {
        this.terms = terms;
    }
}
