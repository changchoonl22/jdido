package pe.dido.svr.termcodedfn.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import pe.dido.svr.termcodedfn.model.CodeD;
import pe.dido.svr.termcodedfn.model.CodeM;
import pe.dido.svr.termcodedfn.model.Term;

public interface TermCodeService {

	//codem
	public CodeM findCodeMById(HashMap searchVo);

	public List<CodeM> findCodeMList();//HashMap searchVo);

	public void saveCodeMList(HashMap procParam);

	//coded
	public CodeD findCodeDById(HashMap searchVo);

	public List<CodeD> findCodeDList();//HashMap searchVo);

	public void saveCodeDList(HashMap procParam);

	//term
	public Term findTermById(HashMap searchVo);

	public List<Term> findTermList();//HashMap searchVo);

	public void saveTermList(List<Term> objList);
	

	

}