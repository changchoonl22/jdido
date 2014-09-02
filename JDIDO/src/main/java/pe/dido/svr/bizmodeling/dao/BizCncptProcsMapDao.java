package pe.dido.svr.bizmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizCncptProcsMap;

public interface BizCncptProcsMapDao {

	public BizCncptProcsMap findById(HashMap searchVo);

	public List<BizCncptProcsMap> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}