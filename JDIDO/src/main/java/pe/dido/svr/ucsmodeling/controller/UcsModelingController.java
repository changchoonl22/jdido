package pe.dido.svr.ucsmodeling.controller;

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

import pe.dido.svr.termcodedfn.service.TermCodeService;
import pe.dido.svr.testmngt.service.TestMngtService;
import pe.dido.svr.ucsmodeling.service.UcsModelingService;

@RestController
public class UcsModelingController {

	private static org.apache.log4j.Logger log = Logger.getLogger(UcsModelingController.class);

	@Autowired
	private UcsModelingService ucsModelingService;

	//UcActor	
	@RequestMapping(value = UcsModelingRestURIConstants.UCACTOR_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUcActor(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("ucActorDS", ucsModelingService.findUcActorById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UcsModelingRestURIConstants.UCACTOR_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUcActorList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("ucActorListDS", ucsModelingService.findUcActorList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UcsModelingRestURIConstants.UCACTOR_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUcActorList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		ucsModelingService.saveUcActorList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	
	//UcEventFlow	
	@RequestMapping(value = UcsModelingRestURIConstants.UCEVENTFLOW_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUcEventFlow(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("ucEventFlowDS", ucsModelingService.findUcEventFlowById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UcsModelingRestURIConstants.UCEVENTFLOW_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUcEventFlowList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("ucEventFlowListDS", ucsModelingService.findUcEventFlowList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UcsModelingRestURIConstants.UCEVENTFLOW_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUcEventFlowList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		ucsModelingService.saveUcEventFlowList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	
	
	//UcM	
	@RequestMapping(value = UcsModelingRestURIConstants.UCM_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUcM(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("ucMDS", ucsModelingService.findUcMById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UcsModelingRestURIConstants.UCM_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUcMList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("ucMListDS", ucsModelingService.findUcMList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UcsModelingRestURIConstants.UCM_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUcMList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		ucsModelingService.saveUcMList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	
	//UcActorMap	
	@RequestMapping(value = UcsModelingRestURIConstants.UCACTORMAP_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUcActorMap(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("ucActorMapDS", ucsModelingService.findUcActorMapById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UcsModelingRestURIConstants.UCACTORMAP_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUcActorMapList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("ucActorMapListDS", ucsModelingService.findUcActorMapList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UcsModelingRestURIConstants.UCACTORMAP_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUcActorMapList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		ucsModelingService.saveUcActorMapList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	
}