package pe.dido.svr.compmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.compmodeling.model.CompM;

public interface CompMDao {

	void deleteCompMById(CompM compM);
	void deleteCompMList(List<CompM> deleteList);
	//CompMMapper
	CompM findCompMById(int id);
	ArrayList<CompM> findCompMList(int id);
	void insertCompMById(CompM compM);
	void insertCompMList(List<CompM> insertList);
	void updateCompMById(CompM compM);
	void updateCompMList(List<CompM> updateList);

}