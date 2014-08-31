package pe.dido.svr.lnkdesign.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.lnkdesign.model.LnkIfIem;

public interface LnkIfIemDao {

	void deleteLnkIfIemById(LnkIfIem lnkIfIem);
	void deleteLnkIfIemList(List<LnkIfIem> deleteList);
	//LnkIfIemMapper
	LnkIfIem findLnkIfIemById(int id);
	ArrayList<LnkIfIem> findLnkIfIemList(int id);
	void insertLnkIfIemById(LnkIfIem lnkIfIem);
	void insertLnkIfIemList(List<LnkIfIem> insertList);
	void updateLnkIfIemById(LnkIfIem lnkIfIem);
	void updateLnkIfIemList(List<LnkIfIem> updateList);

}