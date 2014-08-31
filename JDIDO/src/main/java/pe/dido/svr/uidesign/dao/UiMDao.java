package pe.dido.svr.uidesign.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.uidesign.model.UiM;

public interface UiMDao {

	void deleteUiMById(UiM uiM);
	void deleteUiMList(List<UiM> deleteList);
	//UiMMapper
	UiM findUiMById(int id);
	ArrayList<UiM> findUiMList(int id);
	void insertUiMById(UiM uiM);
	void insertUiMList(List<UiM> insertList);
	void updateUiMById(UiM uiM);
	void updateUiMList(List<UiM> updateList);

}