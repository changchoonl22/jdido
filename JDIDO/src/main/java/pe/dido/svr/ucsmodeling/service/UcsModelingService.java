package pe.dido.svr.ucsmodeling.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.ucsmodeling.model.UcActor;
import pe.dido.svr.ucsmodeling.model.UcActorMap;
import pe.dido.svr.ucsmodeling.model.UcEventFlow;
import pe.dido.svr.ucsmodeling.model.UcM;

public interface UcsModelingService {

	//UcActorDao.java	
	public UcActor findUcActorById(HashMap searchVo);

	public List<UcActor> findUcActorList();

	public void saveUcActorList(HashMap procParam);

	//UcEventFlowDao.java	
	public UcEventFlow findUcEventFlowById(HashMap searchVo);

	public List<UcEventFlow> findUcEventFlowList();

	public void saveUcEventFlowList(HashMap procParam);

	//UcMDao.java	
	public UcM findUcMById(HashMap searchVo);

	public List<UcM> findUcMList();

	public void saveUcMList(HashMap procParam);

	//UcActorMapDao	
	public UcActorMap findUcActorMapById(HashMap searchVo);

	public List<UcActorMap> findUcActorMapList();

	public void saveUcActorMapList(HashMap procParam);

}