package pe.dido.svr.uidesign.controller;

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
import pe.dido.svr.uidesign.service.UiDesignService;

@RestController
public class UiDesignController {

	private static org.apache.log4j.Logger log = Logger.getLogger(UiDesignController.class);

	@Autowired
	private UiDesignService uiDesignService;

	//UiAuthor	
	@RequestMapping(value = UiDesignRestURIConstants.UIAUTHOR_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUiAuthor(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("uiAuthorDS", uiDesignService.findUiAuthorById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UiDesignRestURIConstants.UIAUTHOR_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUiAuthorList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("uiAuthorListDS", uiDesignService.findUiAuthorList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UiDesignRestURIConstants.UIAUTHOR_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUiAuthorList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		uiDesignService.saveUiAuthorList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	//UiAuthorMap	
	@RequestMapping(value = UiDesignRestURIConstants.UIAUTHORMAP_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUiAuthorMap(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("uiAuthorMapDS", uiDesignService.findUiAuthorMapById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UiDesignRestURIConstants.UIAUTHORMAP_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUiAuthorMapList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("uiAuthorMapListDS", uiDesignService.findUiAuthorMapList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UiDesignRestURIConstants.UIAUTHORMAP_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUiAuthorMapList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		uiDesignService.saveUiAuthorMapList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	//UiM	
	@RequestMapping(value = UiDesignRestURIConstants.UIM_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUiM(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("uiMDS", uiDesignService.findUiMById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UiDesignRestURIConstants.UIM_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUiMList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("uiMListDS", uiDesignService.findUiMList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UiDesignRestURIConstants.UIM_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUiMList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		uiDesignService.saveUiMList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	//UiMenuPkg	
	@RequestMapping(value = UiDesignRestURIConstants.UIMENUPKG_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUiMenuPkg(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("uiMenuPkgDS", uiDesignService.findUiMenuPkgById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UiDesignRestURIConstants.UIMENUPKG_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getUiMenuPkgList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("uiMenuPkgListDS", uiDesignService.findUiMenuPkgList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = UiDesignRestURIConstants.UIMENUPKG_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveUiMenuPkgList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		uiDesignService.saveUiMenuPkgList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

}