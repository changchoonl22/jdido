package pe.dido.svr.lnkdesign.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.lnkdesign.model.LnkOtrSys;

public interface LnkOtrSysDao {

	void deleteLnkOtrSysById(LnkOtrSys lnkOtrSys);
	void deleteLnkOtrSysList(List<LnkOtrSys> deleteList);
	//LnkOtrSysMapper
	LnkOtrSys findLnkOtrSysById(int id);
	ArrayList<LnkOtrSys> findLnkOtrSysList(int id);
	void insertLnkOtrSysById(LnkOtrSys lnkOtrSys);
	void insertLnkOtrSysList(List<LnkOtrSys> insertList);
	void updateLnkOtrSysById(LnkOtrSys lnkOtrSys);
	void updateLnkOtrSysList(List<LnkOtrSys> updateList);

}