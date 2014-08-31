package pe.dido.svr.termcodedfn.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.termcodedfn.model.Term;

public interface TermDao {

	public Term findById(HashMap searchVo);

	public List<Term> findList(HashMap searchVo);//HashMap searchVo

	public void saveList(List objList) ;

}