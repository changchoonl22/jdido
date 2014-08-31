package pe.dido.svr.ucsmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.ucsmodeling.model.UcM;

public interface UcMDao {

	void deleteUcMById(UcM ucM);
	void deleteUcMList(List<UcM> deleteList);
	//UcMMapper
	UcM findUcMById(int id);
	ArrayList<UcM> findUcMList(int id);
	void insertUcMById(UcM ucM);
	void insertUcMList(List<UcM> insertList);
	void updateUcMById(UcM ucM);
	void updateUcMList(List<UcM> updateList);

}