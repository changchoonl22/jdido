package pe.dido.svr.testmngt.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.reqmngt.model.UpperDmndDmndMap;
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
		
		
        List<TestPln> insertList = new ArrayList<TestPln>();
        List<TestPln> updateList = new ArrayList<TestPln>();
        List<TestPln> deleteList = new ArrayList<TestPln>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<TestPln>)procParam.get("testPlnListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	TestPln tempObj = (TestPln) objList.get(i);
            if((tempObj.getStatusYn()).equals("I")){
                   insertList.add(iidx, tempObj);
                   iidx++;
            }else if((tempObj.getStatusYn()).equals("U")){
                   updateList.add(uidx, tempObj);
                   uidx++;
            }else if((tempObj.getStatusYn()).equals("D")){
                   deleteList.add(didx, tempObj);
                   didx++;
            }
        }
        if(insertList.size()>0){
        	testPlnDao.insert(insertList);
        }else if(updateList.size()>0){
        	testPlnDao.update(updateList);
        }else if(deleteList.size()>0){
        	testPlnDao.delete(deleteList);
        }		
		
		//testPlnDao.insert(objList);
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
		
		
        List<TestResult> insertList = new ArrayList<TestResult>();
        List<TestResult> updateList = new ArrayList<TestResult>();
        List<TestResult> deleteList = new ArrayList<TestResult>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<TestResult>)procParam.get("testResultListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	TestResult tempObj = (TestResult) objList.get(i);
            if((tempObj.getStatusYn()).equals("I")){
                   insertList.add(iidx, tempObj);
                   iidx++;
            }else if((tempObj.getStatusYn()).equals("U")){
                   updateList.add(uidx, tempObj);
                   uidx++;
            }else if((tempObj.getStatusYn()).equals("D")){
                   deleteList.add(didx, tempObj);
                   didx++;
            }
        }
        if(insertList.size()>0){
        	testResultDao.insert(insertList);
        }else if(updateList.size()>0){
        	testResultDao.update(updateList);
        }else if(deleteList.size()>0){
        	testResultDao.delete(deleteList);
        }			
		
		
		//testResultDao.insert(objList);
	}	
	

}
