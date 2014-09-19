package pe.dido.svr.bizmodeling.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.bizmodeling.dao.*;
import pe.dido.svr.bizmodeling.model.*;

@Service("bizModelingService")
public class BizModelingServiceImpl implements BizModelingService {
	@Autowired
	private BizActorDao bizActorDao;
	@Autowired
	private BizActorDeptMapDao bizActorDeptMapDao;
	@Autowired
	private BizCncptDao bizCncptDao;
	@Autowired
	private BizCncptProcsMapDao bizCncptProcsMapDao;
	@Autowired
	private BizPkgDao bizPkgDao;
	@Autowired
	private BizProcsDao bizProcsDao;
	@Autowired
	private BizRuleDao bizRuleDao;
	

	//BizActorDao	
	@Override
	@Transactional(readOnly = true)	
	public BizActor findBizActorById(HashMap searchVo) {	
		return bizActorDao.findById(searchVo);
	}	 
		
	@Override
	@Transactional(readOnly = true)	
	public List<BizActor> findBizActorList(){//HashMap searchVo) {	
		return bizActorDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveBizActorList(HashMap procParam) {	
		List<BizActor> objList =new ArrayList<BizActor>();
        List<BizActor> insertList = new ArrayList<BizActor>();
        List<BizActor> updateList = new ArrayList<BizActor>();
        List<BizActor> deleteList = new ArrayList<BizActor>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<BizActor>)procParam.get("bizActorListDS");  
        
        for(int i = 0; i < objList.size(); i++){
       	 BizActor tempObj = (BizActor) objList.get(i);
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
        	bizActorDao.insert(insertList);
        }else if(updateList.size()>0){
        	bizActorDao.update(updateList);
        }else if(deleteList.size()>0){
        	bizActorDao.delete(deleteList);
        }
	}	
	
	
	//BizActorDeptMapDao	
	@Override
	@Transactional(readOnly = true)	
	public BizActorDeptMap findBizActorDeptMapById(HashMap searchVo) {	
		return bizActorDeptMapDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<BizActorDeptMap> findBizActorDeptMapList(){//HashMap searchVo) {	
		return bizActorDeptMapDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveBizActorDeptMapList(HashMap procParam) {	
		List<BizActorDeptMap> objList =new ArrayList<BizActorDeptMap>();
		
        List<BizActorDeptMap> insertList = new ArrayList<BizActorDeptMap>();
        List<BizActorDeptMap> updateList = new ArrayList<BizActorDeptMap>();
        List<BizActorDeptMap> deleteList = new ArrayList<BizActorDeptMap>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<BizActorDeptMap>)procParam.get("bizActorDeptMapListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	BizActorDeptMap tempObj = (BizActorDeptMap) objList.get(i);
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
        	bizActorDeptMapDao.insert(insertList);
        }else if(updateList.size()>0){
        	bizActorDeptMapDao.update(updateList);
        }else if(deleteList.size()>0){
        	bizActorDeptMapDao.delete(deleteList);
        }

	}	
	
	//BizCncptDao	
	@Override
	@Transactional(readOnly = true)	
	public BizCncpt findBizCncptById(HashMap searchVo) {	
		return bizCncptDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<BizCncpt> findBizCncptList(){//HashMap searchVo) {	
		return bizCncptDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveBizCncptList(HashMap procParam) {	
		List<BizCncpt> objList =new ArrayList<BizCncpt>();
		
        List<BizCncpt> insertList = new ArrayList<BizCncpt>();
        List<BizCncpt> updateList = new ArrayList<BizCncpt>();
        List<BizCncpt> deleteList = new ArrayList<BizCncpt>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<BizCncpt>)procParam.get("bizCncptListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	BizCncpt tempObj = (BizCncpt) objList.get(i);
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
        	bizActorDeptMapDao.insert(insertList);
        }else if(updateList.size()>0){
        	bizActorDeptMapDao.update(updateList);
        }else if(deleteList.size()>0){
        	bizActorDeptMapDao.delete(deleteList);
        }	
	}	
	//BizCncptProcsMapDao	
	@Override
	@Transactional(readOnly = true)	
	public BizCncptProcsMap findBizCncptProcsMapById(HashMap searchVo) {	
		return bizCncptProcsMapDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<BizCncptProcsMap> findBizCncptProcsMapList(){//HashMap searchVo) {	
		return bizCncptProcsMapDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveBizCncptProcsMapList(HashMap procParam) {	
		List<BizCncptProcsMap> objList =new ArrayList<BizCncptProcsMap>();
		
        List<BizCncptProcsMap> insertList = new ArrayList<BizCncptProcsMap>();
        List<BizCncptProcsMap> updateList = new ArrayList<BizCncptProcsMap>();
        List<BizCncptProcsMap> deleteList = new ArrayList<BizCncptProcsMap>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<BizCncptProcsMap>)procParam.get("bizCncptProcsMapListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	BizCncptProcsMap tempObj = (BizCncptProcsMap) objList.get(i);
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
        	bizCncptProcsMapDao.insert(insertList);
        }else if(updateList.size()>0){
        	bizCncptProcsMapDao.update(updateList);
        }else if(deleteList.size()>0){
        	bizCncptProcsMapDao.delete(deleteList);
        }			
	}	

	//BizPkgDao	
	@Override
	@Transactional(readOnly = true)	
	public BizPkg findBizPkgById(HashMap searchVo) {	
		return bizPkgDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<BizPkg> findBizPkgList(){//HashMap searchVo) {	
		return bizPkgDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveBizPkgList(HashMap procParam) {	
		List<BizPkg> objList =new ArrayList<BizPkg>();
		
        List<BizPkg> insertList = new ArrayList<BizPkg>();
        List<BizPkg> updateList = new ArrayList<BizPkg>();
        List<BizPkg> deleteList = new ArrayList<BizPkg>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<BizPkg>)procParam.get("bizPkgListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	BizPkg tempObj = (BizPkg) objList.get(i);
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
        	bizPkgDao.insert(insertList);
        }else if(updateList.size()>0){
        	bizPkgDao.update(updateList);
        }else if(deleteList.size()>0){
        	bizPkgDao.delete(deleteList);
        }				
		
	}	
	//BizProcsDao	
	@Override
	@Transactional(readOnly = true)	
	public BizProcs findBizProcsById(HashMap searchVo) {	
		return bizProcsDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<BizProcs> findBizProcsList(){//HashMap searchVo) {	
		return bizProcsDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveBizProcsList(HashMap procParam) {	
		List<BizProcs> objList =new ArrayList<BizProcs>();
		
        List<BizProcs> insertList = new ArrayList<BizProcs>();
        List<BizProcs> updateList = new ArrayList<BizProcs>();
        List<BizProcs> deleteList = new ArrayList<BizProcs>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<BizProcs>)procParam.get("bizProcsListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	BizProcs tempObj = (BizProcs) objList.get(i);
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
        	bizProcsDao.insert(insertList);
        }else if(updateList.size()>0){
        	bizProcsDao.update(updateList);
        }else if(deleteList.size()>0){
        	bizProcsDao.delete(deleteList);
        }		
		
	}	
	
	//BizRuleDao	
	@Override
	@Transactional(readOnly = true)	
	public BizRule findBizRuleById(HashMap searchVo) {	
		return bizRuleDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<BizRule> findBizRuleList(){//HashMap searchVo) {	
		return bizRuleDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveBizRuleList(HashMap procParam) {	
		List<BizRule> objList =new ArrayList<BizRule>();
		
		
        List<BizRule> insertList = new ArrayList<BizRule>();
        List<BizRule> updateList = new ArrayList<BizRule>();
        List<BizRule> deleteList = new ArrayList<BizRule>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<BizRule>)procParam.get("bizRuleListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	BizRule tempObj = (BizRule) objList.get(i);
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
        	bizRuleDao.insert(insertList);
        }else if(updateList.size()>0){
        	bizRuleDao.update(updateList);
        }else if(deleteList.size()>0){
        	bizRuleDao.delete(deleteList);
        }	
	}

}
