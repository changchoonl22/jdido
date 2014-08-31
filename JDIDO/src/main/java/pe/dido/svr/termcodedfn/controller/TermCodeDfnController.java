package pe.dido.svr.termcodedfn.controller;

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



@RestController
public class TermCodeDfnController {

	private static org.apache.log4j.Logger log = Logger.getLogger(TermCodeDfnController.class);

	@Autowired
	private TermCodeService termCodeService;

	@RequestMapping(value = TermCodeDfnRestURIConstants.TERM_GET, method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> getTerm(@RequestBody HashMap<String, Object> searchParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("termDS", termCodeService.findCodeMById(searchParam));
		resultObj.put("message", "OK");
		return resultObj;
	}
//@RequestBody HashMap<String, Object> searchParam
	@RequestMapping(value = TermCodeDfnRestURIConstants.TERM_GETLIST, method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> getTermList(@RequestBody HashMap<String, Object> searchParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		resultObj.put("codeMListDS", termCodeService.findCodeMList(searchParam));
		resultObj.put("message", 1);
		return resultObj;
	}

	@RequestMapping(value = TermCodeDfnRestURIConstants.TERM_SAVELIST, method = RequestMethod.POST)
	public @ResponseBody HashMap<String, Object> saveCodeMList(@RequestBody HashMap<String, Object> procParam) {
		HashMap<String, Object> resultObj = new HashMap<String, Object>();
		termCodeService.saveCodeMList(procParam);
		resultObj.put("message", 1);
		return resultObj;
	}

}