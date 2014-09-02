package pe.dido.svr.bizmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizActorDeptMap;

public interface BizActorDeptMapDao {

	public BizActorDeptMap findById(HashMap searchVo);

	public List<BizActorDeptMap> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}