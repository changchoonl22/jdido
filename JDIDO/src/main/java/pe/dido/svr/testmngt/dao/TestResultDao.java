package pe.dido.svr.testmngt.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.testmngt.model.TestResult;

public interface TestResultDao {

	void deleteTestResultById(TestResult testResult);
	void deleteTestResultList(List<TestResult> deleteList);
	//TestResultMapper
	TestResult findTestResultById(int id);
	ArrayList<TestResult> findTestResultList(int id);
	void insertTestResultById(TestResult testResult);
	void insertTestResultList(List<TestResult> insertList);
	void updateTestResultById(TestResult testResult);
	void updateTestResultList(List<TestResult> updateList);

}