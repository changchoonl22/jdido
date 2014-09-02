package pe.dido.svr.testmngt.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.testmngt.model.TestResult;

public interface TestResultDao {

	public TestResult findById(HashMap searchVo);

	public List<TestResult> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}