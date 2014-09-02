package pe.dido.svr.ucsmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.ucsmodeling.model.UcActor;

public interface UcActorDao {

	public UcActor findById(HashMap searchVo);

	public List<UcActor> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}