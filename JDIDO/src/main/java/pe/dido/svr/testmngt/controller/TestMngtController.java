package pe.dido.svr.testmngt.controller;

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

@RestController
public class TestMngtController {

	private static org.apache.log4j.Logger log = Logger.getLogger(TestMngtController.class);

	@Autowired
	private TestMngtService testMngtService;

	//TestPln	
	@RequestMapping(value = TestMngtRestURIConstants.TESTPLN_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getTestPln(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("testPlnDS", testMngtService.findTestPlnById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = TestMngtRestURIConstants.TESTPLN_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getTestPlnList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("testPlnListDS", testMngtService.findTestPlnList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = TestMngtRestURIConstants.TESTPLN_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveTestPlnList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		testMngtService.saveTestPlnList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	

	
	//TestResult	
	@RequestMapping(value = TestMngtRestURIConstants.TESTRESULT_GET, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getTestResult(@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("testResultDS", testMngtService.findTestResultById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = TestMngtRestURIConstants.TESTRESULT_GETLIST, method = RequestMethod.GET)	
	public @ResponseBody HashMap<String, Object> getTestResultList(){//@RequestBody HashMap<String, Object> searchParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("testResultListDS", testMngtService.findTestResultList());//searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}	
		
	@RequestMapping(value = TestMngtRestURIConstants.TESTRESULT_SAVELIST, method = RequestMethod.POST)	
	public @ResponseBody HashMap<String, Object> saveTestResultList(@RequestBody HashMap<String, Object> procParam) {	
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		testMngtService.saveTestResultList(procParam);
		resultObj.put("message", "OK");
		return resultObj;
	}	
	
}