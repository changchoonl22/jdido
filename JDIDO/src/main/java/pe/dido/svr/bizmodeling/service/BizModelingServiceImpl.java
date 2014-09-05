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
	
	
	 @Transactional
    	public void saveBizActor(BizActor bizActor) {
        	if((bizActor.getCrudTy()).equals("I")){
                	bizActorMapper.insertBizActorById(bizActor) ;
         	}else if((bizActor.getCrudTy()).equals("U")){
                	bizActorMapper.updateBizActorById(bizActor) ;
         	}else if((bizActor.getCrudTy()).equals("D")){
                	bizActorMapper.deleteBizActorById(bizActor) ;
         	}
    	}
		
	@Override
	@Transactional	
	public void saveBizActorList(HashMap procParam) {
	        List<BizActor> insertList = new ArrayList<BizActor>();
         	List<BizActor> updateList = new ArrayList<BizActor>();
         	List<BizActor> deleteList = new ArrayList<BizActor>();	
		
		List<BizActor> objList =new ArrayList<BizActor>();
		objList = (ArrayList<BizActor>)procParam.get("bizActorListDS");
		
		int iidx = 0, uidx=0; didx=0;
		for(int=0; i<objList.size(); i++){
        		BizActor tempObj = (BizActor) bizActorList.get(i);
             		if((tempObj.getCrudTy()).equals("I")){
                    		insertList.add(iidx, tempObj);
                    		iidx++;
             		}else if((tempObj.getCrudTy()).equals("U")){
                    		updateList.add(uidx, tempObj);
                    		uidx++;
             		}else if((tempObj.getCrudTy()).equals("D")){
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
		objList = (ArrayList<BizActorDeptMap>)procParam.get("bizActorDeptMapListDS");
		bizActorDeptMapDao.insert(objList);
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
		objList = (ArrayList<BizCncpt>)procParam.get("bizCncptListDS");
		bizCncptDao.insert(objList);
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
		objList = (ArrayList<BizCncptProcsMap>)procParam.get("bizCncptProcsMapListDS");
		bizCncptProcsMapDao.insert(objList);
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
		objList = (ArrayList<BizPkg>)procParam.get("bizPkgListDS");
		bizPkgDao.insert(objList);
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
		objList = (ArrayList<BizProcs>)procParam.get("bizProcsListDS");
		bizProcsDao.insert(objList);
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
		objList = (ArrayList<BizRule>)procParam.get("bizRuleListDS");
		bizRuleDao.insert(objList);
	}

}
