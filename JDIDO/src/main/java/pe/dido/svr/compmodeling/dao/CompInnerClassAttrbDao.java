package pe.dido.svr.compmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.compmodeling.model.CompInnerClassAttrb;

public interface CompInnerClassAttrbDao {

	void deleteCompInnerClassAttrbById(CompInnerClassAttrb compInnerClassAttrb);
	void deleteCompInnerClassAttrbList(List<CompInnerClassAttrb> deleteList);
	//CompInnerClassAttrbMapper
	CompInnerClassAttrb findCompInnerClassAttrbById(int id);
	ArrayList<CompInnerClassAttrb> findCompInnerClassAttrbList(int id);
	void insertCompInnerClassAttrbById(CompInnerClassAttrb compInnerClassAttrb);
	void insertCompInnerClassAttrbList(List<CompInnerClassAttrb> insertList);
	void updateCompInnerClassAttrbById(CompInnerClassAttrb compInnerClassAttrb);
	void updateCompInnerClassAttrbList(List<CompInnerClassAttrb> updateList);

}