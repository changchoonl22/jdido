package pe.dido.svr.compmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.compmodeling.model.CompM;

public interface CompMDao {

	public CompM findById(HashMap searchVo);

	public List<CompM> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}