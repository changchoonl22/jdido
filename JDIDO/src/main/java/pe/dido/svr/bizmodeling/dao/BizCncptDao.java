package pe.dido.svr.bizmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizCncpt;

public interface BizCncptDao {

	void deleteBizCncptById(BizCncpt bizCncpt);
	void deleteBizCncptList(List<BizCncpt> deleteList);
	//BizCncptMapper
	BizCncpt findBizCncptById(int id);
	ArrayList<BizCncpt> findBizCncptList(int id);
	void insertBizCncptById(BizCncpt bizCncpt);
	void insertBizCncptList(List<BizCncpt> insertList);
	void updateBizCncptById(BizCncpt bizCncpt);
	void updateBizCncptList(List<BizCncpt> updateList);

}