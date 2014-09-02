package pe.dido.svr.clzmodeling.controller;

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
import pe.dido.svr.clzmodeling.service.ClzModelingService;

@RestController
public class ClzModelingController {

	private static org.apache.log4j.Logger log = Logger.getLogger(ClzModelingController.class);

	@Autowired
	private ClzModelingService clzModelingService;

	//ClassAttrb	
	@RequestMapping(value = ClzModelingRestURIConstants.CLASSATTRB_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getClassAttrb(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("classAttrbDS", clzModelingService.findClassAttrbById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ClzModelingRestURIConstants.CLASSATTRB_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getClassAttrbList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("classAttrbListDS", clzModelingService.findClassAttrbList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ClzModelingRestURIConstants.CLASSATTRB_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveClassAttrbList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		clzModelingService.saveClassAttrbList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	//ClassM	
	@RequestMapping(value = ClzModelingRestURIConstants.CLASSM_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getClassM(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("classMDS", clzModelingService.findClassMById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ClzModelingRestURIConstants.CLASSM_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getClassMList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("classMListDS", clzModelingService.findClassMList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ClzModelingRestURIConstants.CLASSM_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveClassMList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		clzModelingService.saveClassMList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	//ClassOp	
	@RequestMapping(value = ClzModelingRestURIConstants.CLASSOP_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getClassOp(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("classOpDS", clzModelingService.findClassOpById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ClzModelingRestURIConstants.CLASSOP_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getClassOpList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("classOpListDS", clzModelingService.findClassOpList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ClzModelingRestURIConstants.CLASSOP_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveClassOpList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		clzModelingService.saveClassOpList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	
}