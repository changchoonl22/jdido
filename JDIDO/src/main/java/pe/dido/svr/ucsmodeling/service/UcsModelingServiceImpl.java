package pe.dido.svr.ucsmodeling.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.testmngt.model.TestResult;
import pe.dido.svr.ucsmodeling.dao.*;
import pe.dido.svr.ucsmodeling.model.*;

@Service("ucsModelingService")
public class UcsModelingServiceImpl implements UcsModelingService  {
	@Autowired
	private UcActorDao ucActorDao;
	@Autowired
	private UcActorMapDao ucActorMapDao;
	@Autowired
	private UcEventFlowDao ucEventFlowDao;
	@Autowired
	private UcMDao ucMDao;

	

	//UcActorDao.java	
	@Override
	@Transactional(readOnly = true)	
	public UcActor findUcActorById(HashMap searchVo) {	
		return ucActorDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UcActor> findUcActorList(){//HashMap searchVo) {	
		return ucActorDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUcActorList(HashMap procParam) {	
		List<UcActor> objList =new ArrayList<UcActor>();
		
		
        List<UcActor> insertList = new ArrayList<UcActor>();
        List<UcActor> updateList = new ArrayList<UcActor>();
        List<UcActor> deleteList = new ArrayList<UcActor>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UcActor>)procParam.get("ucActorListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UcActor tempObj = (UcActor) objList.get(i);
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
        	ucActorDao.insert(insertList);
        }else if(updateList.size()>0){
        	ucActorDao.update(updateList);
        }else if(deleteList.size()>0){
        	ucActorDao.delete(deleteList);
        }			
		
		
		
		//ucActorDao.insert(objList);
	}	

	//UcEventFlowDao.java	
	@Override
	@Transactional(readOnly = true)	
	public UcEventFlow findUcEventFlowById(HashMap searchVo) {	
		return ucEventFlowDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UcEventFlow> findUcEventFlowList(){//HashMap searchVo) {	
		return ucEventFlowDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUcEventFlowList(HashMap procParam) {	
		List<UcEventFlow> objList =new ArrayList<UcEventFlow>();
		
        List<UcEventFlow> insertList = new ArrayList<UcEventFlow>();
        List<UcEventFlow> updateList = new ArrayList<UcEventFlow>();
        List<UcEventFlow> deleteList = new ArrayList<UcEventFlow>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UcEventFlow>)procParam.get("ucEventFlowListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UcEventFlow tempObj = (UcEventFlow) objList.get(i);
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
        	ucEventFlowDao.insert(insertList);
        }else if(updateList.size()>0){
        	ucEventFlowDao.update(updateList);
        }else if(deleteList.size()>0){
        	ucEventFlowDao.delete(deleteList);
        }			
				
		
	}	
	
	
	//UcMDao.java	
	@Override
	@Transactional(readOnly = true)	
	public UcM findUcMById(HashMap searchVo) {	
		return ucMDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UcM> findUcMList(){//HashMap searchVo) {	
		return ucMDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUcMList(HashMap procParam) {	
		List<UcM> objList =new ArrayList<UcM>();
		
		
        List<UcM> insertList = new ArrayList<UcM>();
        List<UcM> updateList = new ArrayList<UcM>();
        List<UcM> deleteList = new ArrayList<UcM>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UcM>)procParam.get("ucMListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UcM tempObj = (UcM) objList.get(i);
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
        	ucMDao.insert(insertList);
        }else if(updateList.size()>0){
        	ucMDao.update(updateList);
        }else if(deleteList.size()>0){
        	ucMDao.delete(deleteList);
        }	
	}	
	
	//UcActorMapDao	
	@Override
	@Transactional(readOnly = true)	
	public UcActorMap findUcActorMapById(HashMap searchVo) {	
		return ucActorMapDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UcActorMap> findUcActorMapList(){//HashMap searchVo) {	
		return ucActorMapDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUcActorMapList(HashMap procParam) {	
		List<UcActorMap> objList =new ArrayList<UcActorMap>();
		
		
        List<UcActorMap> insertList = new ArrayList<UcActorMap>();
        List<UcActorMap> updateList = new ArrayList<UcActorMap>();
        List<UcActorMap> deleteList = new ArrayList<UcActorMap>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UcActorMap>)procParam.get("ucActorMapListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UcActorMap tempObj = (UcActorMap) objList.get(i);
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
        	ucActorMapDao.insert(insertList);
        }else if(updateList.size()>0){
        	ucActorMapDao.update(updateList);
        }else if(deleteList.size()>0){
        	ucActorMapDao.delete(deleteList);
        }		
		
	}	

}
