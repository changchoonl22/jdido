package pe.dido.svr.clzmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.clzmodeling.model.ClassOp;

public interface ClassOpDao {

	void deleteClassOpById(ClassOp classOp);
	void deleteClassOpList(List<ClassOp> deleteList);
	//ClassOpMapper
	ClassOp findClassOpById(int id);
	ArrayList<ClassOp> findClassOpList(int id);
	void insertClassOpById(ClassOp classOp);
	void insertClassOpList(List<ClassOp> insertList);
	void updateClassOpById(ClassOp classOp);
	void updateClassOpList(List<ClassOp> updateList);

}