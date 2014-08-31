package pe.dido.svr.uidesign.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.uidesign.model.UiAuthorMap;

public interface UiAuthorDao {

	void deleteUiAuthorMapById(UiAuthorMap uiAuthorMap);
	void deleteUiAuthorMapList(List<UiAuthorMap> deleteList);
	//UiAuthorMapMapper
	UiAuthorMap findUiAuthorMapById(int id);
	ArrayList<UiAuthorMap> findUiAuthorMapList(int id);
	void insertUiAuthorMapById(UiAuthorMap uiAuthorMap);
	void insertUiAuthorMapList(List<UiAuthorMap> insertList);
	void updateUiAuthorMapById(UiAuthorMap uiAuthorMap);
	void updateUiAuthorMapList(List<UiAuthorMap> updateList);

}