package pe.dido.svr.termcodedfn.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.termcodedfn.model.CodeD;

public interface CodeDDao {

	public CodeD findById(HashMap searchVo);

	public List<CodeD> findList();//HashMap searchVo);

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);
}