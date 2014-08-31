package pe.dido.svr.reqmngt.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.reqmngt.model.Dept;

public interface DeptDao {

	void deleteDeptById(Dept dept);
	void deleteDeptList(List<Dept> deleteList);
	//DeptMapper
	Dept findDeptById(int id);
	ArrayList<Dept> findDeptList(int id);
	void insertDeptById(Dept dept);
	void insertDeptList(List<Dept> insertList);
	void updateDeptById(Dept dept);
	void updateDeptList(List<Dept> updateList);

}