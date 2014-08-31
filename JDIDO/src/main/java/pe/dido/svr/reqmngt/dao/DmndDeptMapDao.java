package pe.dido.svr.reqmngt.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.reqmngt.model.DmndDeptMap;

public interface DmndDeptMapDao {

	void deleteDmndDeptMapById(DmndDeptMap dmndDeptMap);
	void deleteDmndDeptMapList(List<DmndDeptMap> deleteList);
	//DmndDeptMapMapper
	DmndDeptMap findDmndDeptMapById(int id);
	ArrayList<DmndDeptMap> findDmndDeptMapList(int id);
	void insertDmndDeptMapById(DmndDeptMap dmndDeptMap);
	void insertDmndDeptMapList(List<DmndDeptMap> insertList);
	void updateDmndDeptMapById(DmndDeptMap dmndDeptMap);
	void updateDmndDeptMapList(List<DmndDeptMap> updateList);


}