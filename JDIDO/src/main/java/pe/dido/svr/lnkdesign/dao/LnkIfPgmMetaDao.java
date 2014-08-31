package pe.dido.svr.lnkdesign.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.lnkdesign.model.LnkIfPgmMeta;

public interface LnkIfPgmMetaDao {

	void deleteLnkIfPgmMetaById(LnkIfPgmMeta lnkIfPgmMeta);
	void deleteLnkIfPgmMetaList(List<LnkIfPgmMeta> deleteList);
	//LnkIfPgmMetaMapper
	LnkIfPgmMeta findLnkIfPgmMetaById(int id);
	ArrayList<LnkIfPgmMeta> findLnkIfPgmMetaList(int id);
	void insertLnkIfPgmMetaById(LnkIfPgmMeta lnkIfPgmMeta);
	void insertLnkIfPgmMetaList(List<LnkIfPgmMeta> insertList);
	void updateLnkIfPgmMetaById(LnkIfPgmMeta lnkIfPgmMeta);
	void updateLnkIfPgmMetaList(List<LnkIfPgmMeta> updateList);

}