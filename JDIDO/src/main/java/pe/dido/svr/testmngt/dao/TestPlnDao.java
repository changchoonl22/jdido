package pe.dido.svr.testmngt.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.testmngt.model.TestPln;

public interface TestPlnDao {

	void deleteTestPlnById(TestPln testPln);
	void deleteTestPlnList(List<TestPln> deleteList);
	//TestPlnMapper
	TestPln findTestPlnById(int id);
	ArrayList<TestPln> findTestPlnList(int id);
	void insertTestPlnById(TestPln testPln);
	void insertTestPlnList(List<TestPln> insertList);
	void updateTestPlnById(TestPln testPln);
	void updateTestPlnList(List<TestPln> updateList);

}