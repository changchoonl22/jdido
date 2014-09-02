package pe.dido.svr.termcodedfn.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.termcodedfn.model.CodeM;

public interface CodeMDao {

	public CodeM findById(HashMap searchVo);

	public List<CodeM> findList();//HashMap searchVo);

	public void saveList(List objList);

}