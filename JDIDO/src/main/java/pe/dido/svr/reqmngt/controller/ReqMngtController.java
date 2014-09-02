package pe.dido.svr.reqmngt.controller;

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

import pe.dido.svr.reqmngt.service.ReqMngtService;


@RestController
public class ReqMngtController {

	private static org.apache.log4j.Logger log = Logger.getLogger(ReqMngtRestURIConstants.class);

	@Autowired
	private ReqMngtService reqMngtService;

	//Dept	
	@RequestMapping(value = ReqMngtRestURIConstants.DEPT_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getDept(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("deptDS", reqMngtService.findDeptById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.DEPT_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getDeptList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("deptListDS", reqMngtService.findDeptList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.DEPT_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveDeptList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		reqMngtService.saveDeptList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	//DmndDeptMap	
	@RequestMapping(value = ReqMngtRestURIConstants.DMNDDEPTMAP_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getDmndDeptMap(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("dmndDeptMapDS", reqMngtService.findDmndDeptMapById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.DMNDDEPTMAP_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getDmndDeptMapList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("dmndDeptMapListDS", reqMngtService.findDmndDeptMapList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.DMNDDEPTMAP_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveDmndDeptMapList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		reqMngtService.saveDmndDeptMapList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	//DmndM	
	@RequestMapping(value = ReqMngtRestURIConstants.DMNDM_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getDmndM(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("dmndMDS", reqMngtService.findDmndMById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.DMNDM_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getDmndMList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("dmndMListDS", reqMngtService.findDmndMList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.DMNDM_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveDmndMList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		reqMngtService.saveDmndMList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	//DmndRelateBasis	
	@RequestMapping(value = ReqMngtRestURIConstants.DMNDRELATEBASIS_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getDmndRelateBasis(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("dmndRelateBasisDS", reqMngtService.findDmndRelateBasisById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.DMNDRELATEBASIS_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getDmndRelateBasisList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("dmndRelateBasisListDS", reqMngtService.findDmndRelateBasisList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.DMNDRELATEBASIS_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveDmndRelateBasisList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		reqMngtService.saveDmndRelateBasisList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	//UpperDmnd	
	@RequestMapping(value = ReqMngtRestURIConstants.UPPERDMND_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUpperDmnd(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("upperDmndDS", reqMngtService.findUpperDmndById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.UPPERDMND_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUpperDmndList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("upperDmndListDS", reqMngtService.findUpperDmndList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.UPPERDMND_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUpperDmndList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		reqMngtService.saveUpperDmndList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	//UpperDmndDmndMap	
	@RequestMapping(value = ReqMngtRestURIConstants.UPPERDMNDDMNDMAP_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUpperDmndDmndMap(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("upperDmndDmndMapDS", reqMngtService.findUpperDmndDmndMapById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.UPPERDMNDDMNDMAP_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUpperDmndDmndMapList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("upperDmndDmndMapListDS", reqMngtService.findUpperDmndDmndMapList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = ReqMngtRestURIConstants.UPPERDMNDDMNDMAP_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUpperDmndDmndMapList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		reqMngtService.saveUpperDmndDmndMapList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	
}