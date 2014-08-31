package pe.dido.svr.bizmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizActorDeptMap;

public interface BizActorDeptMapDao {

	void deleteBizActorDeptMapById(BizActorDeptMap bizActorDeptMap);
	void deleteBizActorDeptMapList(List<BizActorDeptMap> deleteList);
	//BizActorDeptMapMapper
	BizActorDeptMap findBizActorDeptMapById(int id);
	ArrayList<BizActorDeptMap> findBizActorDeptMapList(int id);
	void insertBizActorDeptMapById(BizActorDeptMap bizActorDeptMap);
	void insertBizActorDeptMapList(List<BizActorDeptMap> insertList);
	void updateBizActorDeptMapById(BizActorDeptMap bizActorDeptMap);
	void updateBizActorDeptMapList(List<BizActorDeptMap> updateList);

}