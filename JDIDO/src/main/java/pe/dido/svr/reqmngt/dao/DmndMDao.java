package pe.dido.svr.reqmngt.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.reqmngt.model.DmndM;

public interface DmndMDao {

	void deleteDmndMById(DmndM dmndM);
	void deleteDmndMList(List<DmndM> deleteList);
	//DmndMMapper
	DmndM findDmndMById(int id);
	ArrayList<DmndM> findDmndMList(int id);
	void insertDmndMById(DmndM dmndM);
	void insertDmndMList(List<DmndM> insertList);
	void updateDmndMById(DmndM dmndM);
	void updateDmndMList(List<DmndM> updateList);


}