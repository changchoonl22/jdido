package pe.dido.svr.lnkdesign.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.lnkdesign.model.LnkSysNode;

public interface LnkSysNodeDao {

	void deleteLnkSysNodeById(LnkSysNode lnkSysNode);
	void deleteLnkSysNodeList(List<LnkSysNode> deleteList);
	//LnkSysNodeMapper
	LnkSysNode findLnkSysNodeById(int id);
	ArrayList<LnkSysNode> findLnkSysNodeList(int id);
	void insertLnkSysNodeById(LnkSysNode lnkSysNode);
	void insertLnkSysNodeList(List<LnkSysNode> insertList);
	void updateLnkSysNodeById(LnkSysNode lnkSysNode);
	void updateLnkSysNodeList(List<LnkSysNode> updateList);

}