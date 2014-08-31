package pe.dido.svr.reqmngt.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.reqmngt.model.UpperDmnd;

public interface UpperDmndDmndMapDao {

	void deleteUpperDmndById(UpperDmnd upperDmnd);
	void deleteUpperDmndList(List<UpperDmnd> deleteList);
	//UpperDmndMapper
	UpperDmnd findUpperDmndById(int id);
	ArrayList<UpperDmnd> findUpperDmndList(int id);
	void insertUpperDmndById(UpperDmnd upperDmnd);
	void insertUpperDmndList(List<UpperDmnd> insertList);
	void updateUpperDmndById(UpperDmnd upperDmnd);
	void updateUpperDmndList(List<UpperDmnd> updateList);


}