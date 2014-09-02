package pe.dido.svr.uidesign.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.uidesign.model.UiAuthor;

public interface UiAuthorDao {

	public UiAuthor findById(HashMap searchVo);

	public List<UiAuthor> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}