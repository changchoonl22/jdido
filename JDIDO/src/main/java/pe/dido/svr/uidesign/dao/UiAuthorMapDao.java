package pe.dido.svr.uidesign.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.uidesign.model.UiAuthorMap;

public interface UiAuthorMapDao {

	public UiAuthorMap findById(HashMap searchVo);

	public List<UiAuthorMap> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}