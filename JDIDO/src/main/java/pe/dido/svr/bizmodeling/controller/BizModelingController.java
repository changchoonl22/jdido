package pe.dido.svr.bizmodeling.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.apache.log4j.Logger;

import pe.dido.svr.bizmodeling.service.BizModelingService;

@RestController
public class BizModelingController {

	private static org.apache.log4j.Logger log = Logger.getLogger(BizModelingController.class);

	@Autowired
	private BizModelingService bizModelingService;

	//BizActor	
	@RequestMapping(value = BizModelingRestURIConstants.BIZACTOR_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizActor(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizActorDS", bizModelingService.findBizActorById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZACTOR_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizActorList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizActorListDS", bizModelingService.findBizActorList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZACTOR_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveBizActorList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		bizModelingService.saveBizCncptList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	//BizActorDeptMap	
	@RequestMapping(value = BizModelingRestURIConstants.BIZACTORDEPTMAP_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizActorDeptMap(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizActorDeptMapDS", bizModelingService.findBizActorDeptMapById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZACTORDEPTMAP_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizActorDeptMapList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizActorDeptMapListDS", bizModelingService.findBizActorDeptMapList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZACTORDEPTMAP_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveBizActorDeptMapList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		bizModelingService.saveBizActorDeptMapList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	//BizCncpt	
	@RequestMapping(value = BizModelingRestURIConstants.BIZCNCPT_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizCncpt(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizCncptDS", bizModelingService.findBizCncptById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZCNCPT_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizCncptList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizCncptListDS", bizModelingService.findBizCncptList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZCNCPT_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveBizCncptList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		bizModelingService.saveBizCncptList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	
	//BizCncptProcsMap	
	@RequestMapping(value = BizModelingRestURIConstants.BIZCNCPTPROCSMAP_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizCncptProcsMap(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizCncptProcsMapDS", bizModelingService.findBizCncptProcsMapById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZCNCPTPROCSMAP_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizCncptProcsMapList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizCncptProcsMapListDS", bizModelingService.findBizCncptProcsMapList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZCNCPTPROCSMAP_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveBizCncptProcsMapList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		bizModelingService.saveBizCncptProcsMapList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	
	//BizPkg	
	@RequestMapping(value = BizModelingRestURIConstants.BIZPKG_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizPkg(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizPkgDS", bizModelingService.findBizPkgById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZPKG_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizPkgList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizPkgListDS", bizModelingService.findBizPkgList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZPKG_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveBizPkgList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		bizModelingService.saveBizPkgList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	//BizProcs	
	@RequestMapping(value = BizModelingRestURIConstants.BIZPROCS_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizProcs(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizProcsDS", bizModelingService.findBizProcsById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZPROCS_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizProcsList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizProcsListDS", bizModelingService.findBizProcsList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZPROCS_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveBizProcsList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		bizModelingService.saveBizProcsList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	//BizRule	
	@RequestMapping(value = BizModelingRestURIConstants.BIZRULE_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizRule(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizRuleDS", bizModelingService.findBizRuleById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZRULE_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getBizRuleList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("bizRuleListDS", bizModelingService.findBizRuleList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = BizModelingRestURIConstants.BIZRULE_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveBizRuleList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		bizModelingService.saveBizRuleList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

}