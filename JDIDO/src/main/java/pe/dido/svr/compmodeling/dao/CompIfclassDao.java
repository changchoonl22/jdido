package pe.dido.svr.compmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.compmodeling.model.CompIfclass;

public interface CompIfclassDao {

	public CompIfclass findById(HashMap searchVo);

	public List<CompIfclass> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}