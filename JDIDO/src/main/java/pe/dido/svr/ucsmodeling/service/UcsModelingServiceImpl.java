package pe.dido.svr.ucsmodeling.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		objList = (ArrayList<UcActor>)procParam.get("ucActorListDS");
		ucActorDao.insert(objList);
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
		objList = (ArrayList<UcEventFlow>)procParam.get("ucEventFlowListDS");
		ucEventFlowDao.insert(objList);
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
		objList = (ArrayList<UcM>)procParam.get("ucMListDS");
		ucMDao.insert(objList);
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
		objList = (ArrayList<UcActorMap>)procParam.get("ucActorMapListDS");
		ucActorMapDao.insert(objList);
	}	

}
