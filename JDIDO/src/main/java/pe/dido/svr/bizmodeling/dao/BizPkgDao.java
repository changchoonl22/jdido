package pe.dido.svr.bizmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizPkg;

public interface BizPkgDao {

	void deleteBizPkgById(BizPkg bizPkg);
	void deleteBizPkgList(List<BizPkg> deleteList);
	//BizPkgMapper
	BizPkg findBizPkgById(int id);
	ArrayList<BizPkg> findBizPkgList(int id);
	void insertBizPkgById(BizPkg bizPkg);
	void insertBizPkgList(List<BizPkg> insertList);
	void updateBizPkgById(BizPkg bizPkg);
	void updateBizPkgList(List<BizPkg> updateList);

}