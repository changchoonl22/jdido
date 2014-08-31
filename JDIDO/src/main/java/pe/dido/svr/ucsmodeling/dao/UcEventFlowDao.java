package pe.dido.svr.ucsmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.ucsmodeling.model.UcEventFlow;

public interface UcEventFlowDao {

	void deleteUcEventFlowById(UcEventFlow ucEventFlow);
	void deleteUcEventFlowList(List<UcEventFlow> deleteList);
	//UcEventFlowMapper
	UcEventFlow findUcEventFlowById(int id);
	ArrayList<UcEventFlow> findUcEventFlowList(int id);
	void insertUcEventFlowById(UcEventFlow ucEventFlow);
	void insertUcEventFlowList(List<UcEventFlow> insertList);
	void updateUcEventFlowById(UcEventFlow ucEventFlow);
	void updateUcEventFlowList(List<UcEventFlow> updateList);

}