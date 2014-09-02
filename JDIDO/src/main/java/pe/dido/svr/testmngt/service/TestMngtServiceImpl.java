package pe.dido.svr.testmngt.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.testmngt.dao.*;
import pe.dido.svr.testmngt.model.TestPln;
import pe.dido.svr.testmngt.model.TestResult;

@Service("testMngtService")
public class TestMngtServiceImpl implements TestMngtService  {
	@Autowired
	private TestPlnDao testPlnDao;
	@Autowired
	private TestResultDao testResultDao;
	
	//TestPlnDao	
	@Override
	@Transactional(readOnly = true)	
	public TestPln findTestPlnById(HashMap searchVo) {	
		return testPlnDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<TestPln> findTestPlnList(){//HashMap searchVo) {	
		return testPlnDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveTestPlnList(HashMap procParam) {	
		List<TestPln> objList =new ArrayList<TestPln>();
		objList = (ArrayList<TestPln>)procParam.get("testPlnListDS");
		testPlnDao.insert(objList);
	}	

	
	//TestResultDao	
	@Override
	@Transactional(readOnly = true)	
	public TestResult findTestResultById(HashMap searchVo) {	
		return testResultDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<TestResult> findTestResultList(){//HashMap searchVo) {	
		return testResultDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveTestResultList(HashMap procParam) {	
		List<TestResult> objList =new ArrayList<TestResult>();
		objList = (ArrayList<TestResult>)procParam.get("testResultListDS");
		testResultDao.insert(objList);
	}	
	

}
