package pe.dido.svr.bizmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizActor;

public interface BizActorDao {

	public BizActor findById(HashMap searchVo);

	public List<BizActor> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}