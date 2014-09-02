package pe.dido.svr.compmodeling.controller;

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
import pe.dido.svr.compmodeling.service.CompModelingService;

@RestController
public class CompModelingController {

	private static org.apache.log4j.Logger log = Logger.getLogger(CompModelingController.class);

	@Autowired
	private CompModelingService compModelingService;

	//CompIfclass	
	@RequestMapping(value = CompModelingRestURIConstants.COMPIFCLASS_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getCompIfclass(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("compIfclassDS", compModelingService.findCompIfclassById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.COMPIFCLASS_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getCompIfclassList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("compIfclassListDS", compModelingService.findCompIfclassList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.COMPIFCLASS_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveCompIfclassList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		compModelingService.saveCompIfclassList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	//CompImplClass	
	@RequestMapping(value = CompModelingRestURIConstants.COMPIMPLCLASS_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getCompImplClass(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("compImplClassDS", compModelingService.findCompImplClassById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.COMPIMPLCLASS_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getCompImplClassList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("compImplClassListDS", compModelingService.findCompImplClassList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.COMPIMPLCLASS_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveCompImplClassList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		compModelingService.saveCompImplClassList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	
	//CompInnerClassAttrb	
	@RequestMapping(value = CompModelingRestURIConstants.COMPINNERCLASSATTRB_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getCompInnerClassAttrb(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("compInnerClassAttrbDS", compModelingService.findCompInnerClassAttrbById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.COMPINNERCLASSATTRB_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getCompInnerClassAttrbList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("compInnerClassAttrbListDS", compModelingService.findCompInnerClassAttrbList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.COMPINNERCLASSATTRB_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveCompInnerClassAttrbList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		compModelingService.saveCompInnerClassAttrbList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	//CompInnerClassOp	
	@RequestMapping(value = CompModelingRestURIConstants.COMPINNERCLASSOP_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getCompInnerClassOp(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("compInnerClassOpDS", compModelingService.findCompInnerClassOpById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.COMPINNERCLASSOP_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getCompInnerClassOpList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("compInnerClassOpListDS", compModelingService.findCompInnerClassOpList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.COMPINNERCLASSOP_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveCompInnerClassOpList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		compModelingService.saveCompInnerClassOpList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	


	//CompM	
	@RequestMapping(value = CompModelingRestURIConstants.COMPM_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getCompM(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("compMDS", compModelingService.findCompMById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.COMPM_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getCompMList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("compMListDS", compModelingService.findCompMList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.COMPM_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveCompMList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		compModelingService.saveCompMList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	
	//UdaCluster	
	@RequestMapping(value = CompModelingRestURIConstants.UDACLUSTER_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUdaCluster(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("udaClusterDS", compModelingService.findUdaClusterById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.UDACLUSTER_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUdaClusterList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("udaClusterListDS", compModelingService.findUdaClusterList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = CompModelingRestURIConstants.UDACLUSTER_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUdaClusterList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		compModelingService.saveUdaClusterList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	
	
}