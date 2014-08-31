package pe.dido.svr.clzmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.clzmodeling.model.ClassM;

public interface ClassMDao {

	void deleteClassMById(ClassM classM);
	void deleteClassMList(List<ClassM> deleteList);
	//ClassMMapper
	ClassM findClassMById(int id);
	ArrayList<ClassM> findClassMList(int id);
	void insertClassMById(ClassM classM);
	void insertClassMList(List<ClassM> insertList);
	void updateClassMById(ClassM classM);
	void updateClassMList(List<ClassM> updateList);

}