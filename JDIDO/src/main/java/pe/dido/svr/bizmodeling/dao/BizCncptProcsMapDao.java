package pe.dido.svr.bizmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizCncptProcsMap;

public interface BizCncptProcsMapDao {

	void deleteBizCncptProcsMapById(BizCncptProcsMap bizCncptProcsMap);
	void deleteBizCncptProcsMapList(List<BizCncptProcsMap> deleteList);
	//BizCncptProcsMapMapper
	BizCncptProcsMap findBizCncptProcsMapById(int id);
	ArrayList<BizCncptProcsMap> findBizCncptProcsMapList(int id);
	void insertBizCncptProcsMapById(BizCncptProcsMap bizCncptProcsMap);
	void insertBizCncptProcsMapList(List<BizCncptProcsMap> insertList);
	void updateBizCncptProcsMapById(BizCncptProcsMap bizCncptProcsMap);
	void updateBizCncptProcsMapList(List<BizCncptProcsMap> updateList);

}