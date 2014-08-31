package pe.dido.svr.bizmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizProcs;

public interface BizProcsDao {

	void deleteBizProcsById(BizProcs bizProcs);
	void deleteBizProcsList(List<BizProcs> deleteList);
	//BizProcsMapper
	BizProcs findBizProcsById(int id);
	ArrayList<BizProcs> findBizProcsList(int id);
	void insertBizProcsById(BizProcs bizProcs);
	void insertBizProcsList(List<BizProcs> insertList);
	void updateBizProcsById(BizProcs bizProcs);
	void updateBizProcsList(List<BizProcs> updateList);

}