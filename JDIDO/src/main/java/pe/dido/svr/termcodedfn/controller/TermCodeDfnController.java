package pe.dido.svr.termcodedfn.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import pe.dido.svr.termcodedfn.model.Term;
import pe.dido.svr.termcodedfn.model.TermWrapper;
import pe.dido.svr.termcodedfn.service.TermCodeService;

@RestController
public class TermCodeDfnController {

	private static org.apache.log4j.Logger log = Logger.getLogger(TermCodeDfnController.class);

	@Autowired
	private TermCodeService termCodeService;

	//term
	@RequestMapping(value = TermCodeDfnRestURIConstants.TERM_GET, method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> getTerm(@RequestBody HashMap<String, Object> searchParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("termDS", termCodeService.findTermById(searchParam));
//		resultObj.put("message", "OK");
		return resultObj;
	}
	
	@RequestMapping(value = TermCodeDfnRestURIConstants.TERM_GETLIST, method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> getTermList(){//@RequestBody HashMap<String, Object> searchParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("termListDS", termCodeService.findTermList());//searchParam));
//		resultObj.put("message", 1);
		return resultObj;
	}

	@RequestMapping(value = TermCodeDfnRestURIConstants.TERM_SAVELIST, method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public @ResponseBody HashMap<String, Object> saveTermList(@RequestBody HashMap<String, Object> procParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();

		
		System.out.print("controller procParam ==> "+procParam.toString()+"\n\n");

		try {
			termCodeService.saveTermList(procParam);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resultObj.put("message", 1);
		return resultObj;

	}
	
	//codeM
	@RequestMapping(value = TermCodeDfnRestURIConstants.CODEM_GET, method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> getCodeM(@RequestBody HashMap<String, Object> searchParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("codeMDS", termCodeService.findCodeMById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}
	
	@RequestMapping(value = TermCodeDfnRestURIConstants.CODEM_GETLIST, method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> getCodeMList(){//@RequestBody HashMap<String, Object> searchParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("codeMListDS", termCodeService.findCodeMList());//searchParam));
		resultObj.put("message", 1);
		return resultObj;
	}

	@RequestMapping(value = TermCodeDfnRestURIConstants.CODEM_SAVELIST, method = RequestMethod.POST)
	public @ResponseBody HashMap<String, Object> saveCodeMList(@RequestBody HashMap<String, Object> procParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		termCodeService.saveCodeMList(procParam);
		resultObj.put("message", 1);
		return resultObj;
	}	
	
	
	//codeD
	@RequestMapping(value = TermCodeDfnRestURIConstants.CODED_GET, method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> getCodeD(@RequestBody HashMap<String, Object> searchParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("codeDDS", termCodeService.findCodeDById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}
	
	@RequestMapping(value = TermCodeDfnRestURIConstants.CODED_GETLIST, method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> getCodeDList(){//@RequestBody HashMap<String, Object> searchParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("codeDListDS", termCodeService.findCodeDList());//searchParam));
		resultObj.put("message", 1);
		return resultObj;
	}

	@RequestMapping(value = TermCodeDfnRestURIConstants.CODED_SAVELIST, method = RequestMethod.POST)
	public @ResponseBody HashMap<String, Object> saveCodeDList(@RequestBody HashMap<String, Object> procParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		termCodeService.saveCodeDList(procParam);
		resultObj.put("message", 1);
		return resultObj;
	}	
}