package pe.dido.svr.termcodedfn.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.termcodedfn.dao.*;
import pe.dido.svr.termcodedfn.model.*;

@Service("termCodeService")
public class TermCodeServiceImpl implements TermCodeService {
	@Autowired
	private CodeMDao codeMDao;
	@Autowired
	private CodeDDao codeDDao;
	@Autowired
	private TermDao termDao;	
	
	//codem
	@Override
	@Transactional(readOnly = true)
	public CodeM findCodeMById(HashMap searchVo) {
		return codeMDao.findById(searchVo);
	}


	@Override
	@Transactional(readOnly = true)
	public List<CodeM> findCodeMList(){//HashMap searchVo){
		return codeMDao.findList();//searchVo);
	}

	@Override
	@Transactional
	public void saveCodeMList(HashMap procParam) {
		List<CodeM> objList = new ArrayList<CodeM>();
		objList = (ArrayList<CodeM>) procParam.get("codeMListDS");
		codeMDao.saveList(objList);
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	//coded
	@Override
	@Transactional(readOnly = true)
	public CodeD findCodeDById(HashMap searchVo) {
		return codeDDao.findById(searchVo);
	}


	@Override
	@Transactional(readOnly = true)
	public List<CodeD> findCodeDList(){//HashMap searchVo){
		return codeDDao.findList();//searchVo);
	}

	@Override
	@Transactional
	public void saveCodeDList(HashMap procParam) {
		List<CodeD> objList = new ArrayList<CodeD>();
		objList = (ArrayList<CodeD>) procParam.get("codeDListDS");
		codeDDao.saveList(objList);
	}
	
	//term
	@Override
	@Transactional(readOnly = true)
	public Term findTermById(HashMap searchVo) {
		return termDao.findById(searchVo);
	}


	@Override
	@Transactional(readOnly = true)
	public List<Term> findTermList(){//HashMap searchVo){
		return termDao.findList();//searchVo);
	}

	@Override
	@Transactional
	public void saveTermList(HashMap procParam) {
		List<Term> objList = new ArrayList<Term>();
		objList = (ArrayList<Term>) procParam.get("termListDS");
		termDao.saveList(objList);
	}	
}
