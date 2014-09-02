package pe.dido.svr.bizmodeling.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.bizmodeling.model.BizActor;
import pe.dido.svr.bizmodeling.model.BizActorDeptMap;
import pe.dido.svr.bizmodeling.model.BizCncpt;
import pe.dido.svr.bizmodeling.model.BizCncptProcsMap;
import pe.dido.svr.bizmodeling.model.BizPkg;
import pe.dido.svr.bizmodeling.model.BizProcs;
import pe.dido.svr.bizmodeling.model.BizRule;

public interface BizModelingService {

	//BizActorDao	
	public BizActor findBizActorById(HashMap searchVo);

	public List<BizActor> findBizActorList();

	public void saveBizActorList(HashMap procParam);

	//BizActorDeptMapDao	
	public BizActorDeptMap findBizActorDeptMapById(HashMap searchVo);

	public List<BizActorDeptMap> findBizActorDeptMapList();

	public void saveBizActorDeptMapList(HashMap procParam);

	//BizCncptDao	
	public BizCncpt findBizCncptById(HashMap searchVo);

	public List<BizCncpt> findBizCncptList();

	public void saveBizCncptList(HashMap procParam);

	//BizCncptProcsMapDao	
	public BizCncptProcsMap findBizCncptProcsMapById(HashMap searchVo);

	public List<BizCncptProcsMap> findBizCncptProcsMapList();

	public void saveBizCncptProcsMapList(HashMap procParam);

	//BizPkgDao	
	public BizPkg findBizPkgById(HashMap searchVo);

	public List<BizPkg> findBizPkgList();

	public void saveBizPkgList(HashMap procParam);

	//BizProcsDao	
	public BizProcs findBizProcsById(HashMap searchVo);

	public List<BizProcs> findBizProcsList();

	public void saveBizProcsList(HashMap procParam);

	//BizRuleDao	
	public BizRule findBizRuleById(HashMap searchVo);

	public List<BizRule> findBizRuleList();

	public void saveBizRuleList(HashMap procParam);

}