package pe.dido.svr.compmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.compmodeling.model.CompIfclass;

public interface CompIfclassDao {

	void deleteCompIfclassById(CompIfclass compIfclass);
	void deleteCompIfclassList(List<CompIfclass> deleteList);
	//CompIfclassMapper
	CompIfclass findCompIfclassById(int id);
	ArrayList<CompIfclass> findCompIfclassList(int id);
	void insertCompIfclassById(CompIfclass compIfclass);
	void insertCompIfclassList(List<CompIfclass> insertList);
	void updateCompIfclassById(CompIfclass compIfclass);
	void updateCompIfclassList(List<CompIfclass> updateList);

}