package pe.dido.svr.testmngt.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.testmngt.model.TestPln;
import pe.dido.svr.testmngt.model.TestResult;


public interface TestMngtService {

	//TestPlnDao	
	public TestPln findTestPlnById(HashMap searchVo);

	public List<TestPln> findTestPlnList();

	public void saveTestPlnList(HashMap procParam);

	//TestResultDao	
	public TestResult findTestResultById(HashMap searchVo);

	public List<TestResult> findTestResultList();

	public void saveTestResultList(HashMap procParam);

}