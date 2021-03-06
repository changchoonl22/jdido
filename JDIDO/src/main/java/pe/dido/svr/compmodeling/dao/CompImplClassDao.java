package pe.dido.svr.compmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.compmodeling.model.CompImplClass;

public interface CompImplClassDao {

	public CompImplClass findById(HashMap searchVo);

	public List<CompImplClass> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}