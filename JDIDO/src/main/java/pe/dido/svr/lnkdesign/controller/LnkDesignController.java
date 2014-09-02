package pe.dido.svr.lnkdesign.controller;

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

import pe.dido.svr.lnkdesign.service.LnkDesignService;

@RestController
public class LnkDesignController {

	private static org.apache.log4j.Logger log = Logger.getLogger(LnkDesignController.class);

	@Autowired
	private LnkDesignService lnkDesignService;

	//LnkIfIem	
	@RequestMapping(value = LnkDesignRestURIConstants.LNKIFIEM_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getLnkIfIem(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("lnkIfIemDS", lnkDesignService.findLnkIfIemById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = LnkDesignRestURIConstants.LNKIFIEM_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getLnkIfIemList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("lnkIfIemListDS", lnkDesignService.findLnkIfIemList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = LnkDesignRestURIConstants.LNKIFIEM_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveLnkIfIemList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		lnkDesignService.saveLnkIfIemList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	
	//LnkIfPgm	
	@RequestMapping(value = LnkDesignRestURIConstants.LNKIFPGM_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getLnkIfPgm(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("lnkIfPgmDS", lnkDesignService.findLnkIfPgmById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = LnkDesignRestURIConstants.LNKIFPGM_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getLnkIfPgmList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("lnkIfPgmListDS", lnkDesignService.findLnkIfPgmList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = LnkDesignRestURIConstants.LNKIFPGM_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveLnkIfPgmList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		lnkDesignService.saveLnkIfPgmList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	
	//LnkIfPgmMeta	
	@RequestMapping(value = LnkDesignRestURIConstants.LNKIFPGMMETA_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getLnkIfPgmMeta(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("lnkIfPgmMetaDS", lnkDesignService.findLnkIfPgmMetaById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = LnkDesignRestURIConstants.LNKIFPGMMETA_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getLnkIfPgmMetaList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("lnkIfPgmMetaListDS", lnkDesignService.findLnkIfPgmMetaList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = LnkDesignRestURIConstants.LNKIFPGMMETA_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveLnkIfPgmMetaList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		lnkDesignService.saveLnkIfPgmMetaList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	
	//LnkOtrSys	
	@RequestMapping(value = LnkDesignRestURIConstants.LNKOTRSYS_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getLnkOtrSys(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("lnkOtrSysDS", lnkDesignService.findLnkOtrSysById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = LnkDesignRestURIConstants.LNKOTRSYS_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getLnkOtrSysList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("lnkOtrSysListDS", lnkDesignService.findLnkOtrSysList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = LnkDesignRestURIConstants.LNKOTRSYS_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveLnkOtrSysList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		lnkDesignService.saveLnkOtrSysList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	

	//LnkSysNode	
	@RequestMapping(value = LnkDesignRestURIConstants.LNKSYSNODE_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getLnkSysNode(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("lnkSysNodeDS", lnkDesignService.findLnkSysNodeById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = LnkDesignRestURIConstants.LNKSYSNODE_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getLnkSysNodeList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("lnkSysNodeListDS", lnkDesignService.findLnkSysNodeList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = LnkDesignRestURIConstants.LNKSYSNODE_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveLnkSysNodeList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		lnkDesignService.saveLnkSysNodeList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	
	
}