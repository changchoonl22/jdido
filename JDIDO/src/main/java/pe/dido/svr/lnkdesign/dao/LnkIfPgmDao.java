package pe.dido.svr.lnkdesign.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.lnkdesign.model.LnkIfPgm;

public interface LnkIfPgmDao {

	void deleteLnkIfPgmById(LnkIfPgm lnkIfPgm);
	void deleteLnkIfPgmList(List<LnkIfPgm> deleteList);
	//LnkIfPgmMapper
	LnkIfPgm findLnkIfPgmById(int id);
	ArrayList<LnkIfPgm> findLnkIfPgmList(int id);
	void insertLnkIfPgmById(LnkIfPgm lnkIfPgm);
	void insertLnkIfPgmList(List<LnkIfPgm> insertList);
	void updateLnkIfPgmById(LnkIfPgm lnkIfPgm);
	void updateLnkIfPgmList(List<LnkIfPgm> updateList);

}