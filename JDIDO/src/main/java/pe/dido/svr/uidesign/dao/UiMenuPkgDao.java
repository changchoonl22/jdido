package pe.dido.svr.uidesign.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.uidesign.model.UiMenuPkg;

public interface UiMenuPkgDao {

	public UiMenuPkg findById(HashMap searchVo);

	public List<UiMenuPkg> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}