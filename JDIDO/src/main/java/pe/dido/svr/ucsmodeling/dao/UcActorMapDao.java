package pe.dido.svr.ucsmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.ucsmodeling.model.UcActorMap;

public interface UcActorMapDao {

	public UcActorMap findById(HashMap searchVo);

	public List<UcActorMap> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}