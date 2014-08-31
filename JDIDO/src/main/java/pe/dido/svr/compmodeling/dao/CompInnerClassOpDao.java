package pe.dido.svr.compmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.compmodeling.model.CompInnerClassOp;

public interface CompInnerClassOpDao {

	void deleteCompInnerClassOpById(CompInnerClassOp compInnerClassOp);
	void deleteCompInnerClassOpList(List<CompInnerClassOp> deleteList);
	//CompInnerClassOpMapper
	CompInnerClassOp findCompInnerClassOpById(int id);
	ArrayList<CompInnerClassOp> findCompInnerClassOpList(int id);
	void insertCompInnerClassOpById(CompInnerClassOp compInnerClassOp);
	void insertCompInnerClassOpList(List<CompInnerClassOp> insertList);
	void updateCompInnerClassOpById(CompInnerClassOp compInnerClassOp);
	void updateCompInnerClassOpList(List<CompInnerClassOp> updateList);

}