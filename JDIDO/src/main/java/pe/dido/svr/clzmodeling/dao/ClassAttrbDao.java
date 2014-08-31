package pe.dido.svr.clzmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.clzmodeling.model.ClassAttrb;

public interface ClassAttrbDao {

	void deleteClassAttrbById(ClassAttrb classAttrb);
	void deleteClassAttrbList(List<ClassAttrb> deleteList);
	//ClassAttrbMapper
	ClassAttrb findClassAttrbById(int id);
	ArrayList<ClassAttrb> findClassAttrbList(int id);
	void insertClassAttrbById(ClassAttrb classAttrb);
	void insertClassAttrbList(List<ClassAttrb> insertList);
	void updateClassAttrbById(ClassAttrb classAttrb);
	void updateClassAttrbList(List<ClassAttrb> updateList);

}