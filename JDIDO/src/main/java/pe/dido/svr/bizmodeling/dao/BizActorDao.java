package pe.dido.svr.bizmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizActor;

public interface BizActorDao {

	void deleteBizActorById(BizActor bizActor);
	void deleteBizActorList(List<BizActor> deleteList);
	//BizActorMapper
	BizActor findBizActorById(int id);
	ArrayList<BizActor> findBizActorList(int id);
	void insertBizActorById(BizActor bizActor);
	void insertBizActorList(List<BizActor> insertList);
	void updateBizActorById(BizActor bizActor);
	void updateBizActorList(List<BizActor> updateList);

}