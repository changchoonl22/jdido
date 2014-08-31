package pe.dido.svr.compmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.compmodeling.model.CompImplClass;

public interface CompImplClassDao {

	void deleteCompImplClassById(CompImplClass compImplClass);
	void deleteCompImplClassList(List<CompImplClass> deleteList);
	//CompImplClassMapper
	CompImplClass findCompImplClassById(int id);
	ArrayList<CompImplClass> findCompImplClassList(int id);
	void insertCompImplClassById(CompImplClass compImplClass);
	void insertCompImplClassList(List<CompImplClass> insertList);
	void updateCompImplClassById(CompImplClass compImplClass);
	void updateCompImplClassList(List<CompImplClass> updateList);

}