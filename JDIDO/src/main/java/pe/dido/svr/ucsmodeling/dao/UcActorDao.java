package pe.dido.svr.ucsmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.ucsmodeling.model.UcActorMap;

public interface UcActorDao {

	void deleteUcActorMapById(UcActorMap ucActorMap);
	void deleteUcActorMapList(List<UcActorMap> deleteList);
	//UcActorMapMapper
	UcActorMap findUcActorMapById(int id);
	ArrayList<UcActorMap> findUcActorMapList(int id);
	void insertUcActorMapById(UcActorMap ucActorMap);
	void insertUcActorMapList(List<UcActorMap> insertList);
	void updateUcActorMapById(UcActorMap ucActorMap);
	void updateUcActorMapList(List<UcActorMap> updateList);

}