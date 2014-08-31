package pe.dido.svr.uidesign.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.uidesign.model.UiMenuPkg;

public interface UiMenuPkgDao {

	void deleteUiMenuPkgById(UiMenuPkg uiMenuPkg);
	void deleteUiMenuPkgList(List<UiMenuPkg> deleteList);
	//UiMenuPkgMapper
	UiMenuPkg findUiMenuPkgById(int id);
	ArrayList<UiMenuPkg> findUiMenuPkgList(int id);
	void insertUiMenuPkgById(UiMenuPkg uiMenuPkg);
	void insertUiMenuPkgList(List<UiMenuPkg> insertList);
	void updateUiMenuPkgById(UiMenuPkg uiMenuPkg);
	void updateUiMenuPkgList(List<UiMenuPkg> updateList);

}