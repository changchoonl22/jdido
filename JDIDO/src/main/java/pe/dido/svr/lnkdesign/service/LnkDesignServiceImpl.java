package pe.dido.svr.lnkdesign.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.lnkdesign.dao.*;
import pe.dido.svr.lnkdesign.model.*;

@Service("lnkdesignService")
public class LnkDesignServiceImpl implements LnkDesignService  {

	@Autowired
	private LnkIfIemDao lnkIfIemDao;
	@Autowired
	private LnkIfPgmDao lnkIfPgmDao;
	@Autowired
	private LnkIfPgmMetaDao lnkIfPgmMetaDao;
	@Autowired
	private LnkOtrSysDao lnkOtrSysDao;
	@Autowired
	private LnkSysNodeDao lnkSysNodeDao;
	
	//LnkIfIemDao	
	@Override
	@Transactional(readOnly = true)	
	public LnkIfIem findLnkIfIemById(HashMap searchVo) {	
		return lnkIfIemDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<LnkIfIem> findLnkIfIemList(){//HashMap searchVo) {	
		return lnkIfIemDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveLnkIfIemList(HashMap procParam) {	
		List<LnkIfIem> objList =new ArrayList<LnkIfIem>();
		objList = (ArrayList<LnkIfIem>)procParam.get("lnkIfIemListDS");
		lnkIfIemDao.insert(objList);
	}	

	
	//LnkIfPgmDao	
	@Override
	@Transactional(readOnly = true)	
	public LnkIfPgm findLnkIfPgmById(HashMap searchVo) {	
		return lnkIfPgmDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<LnkIfPgm> findLnkIfPgmList(){//HashMap searchVo) {	
		return lnkIfPgmDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveLnkIfPgmList(HashMap procParam) {	
		List<LnkIfPgm> objList =new ArrayList<LnkIfPgm>();
		objList = (ArrayList<LnkIfPgm>)procParam.get("lnkIfPgmListDS");
		lnkIfPgmDao.insert(objList);
	}	

	
	//LnkIfPgmMetaDao	
	@Override
	@Transactional(readOnly = true)	
	public LnkIfPgmMeta findLnkIfPgmMetaById(HashMap searchVo) {	
		return lnkIfPgmMetaDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<LnkIfPgmMeta> findLnkIfPgmMetaList(){//HashMap searchVo) {	
		return lnkIfPgmMetaDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveLnkIfPgmMetaList(HashMap procParam) {	
		List<LnkIfPgmMeta> objList =new ArrayList<LnkIfPgmMeta>();
		objList = (ArrayList<LnkIfPgmMeta>)procParam.get("lnkIfPgmMetaListDS");
		lnkIfPgmMetaDao.insert(objList);
	}	

	
	//LnkOtrSysDao	
	@Override
	@Transactional(readOnly = true)	
	public LnkOtrSys findLnkOtrSysById(HashMap searchVo) {	
		return lnkOtrSysDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<LnkOtrSys> findLnkOtrSysList(){//HashMap searchVo) {	
		return lnkOtrSysDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveLnkOtrSysList(HashMap procParam) {	
		List<LnkOtrSys> objList =new ArrayList<LnkOtrSys>();
		objList = (ArrayList<LnkOtrSys>)procParam.get("lnkOtrSysListDS");
		lnkOtrSysDao.insert(objList);
	}	
	
	//LnkSysNodeDao	
	@Override
	@Transactional(readOnly = true)	
	public LnkSysNode findLnkSysNodeById(HashMap searchVo) {	
		return lnkSysNodeDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<LnkSysNode> findLnkSysNodeList(){//HashMap searchVo) {	
		return lnkSysNodeDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveLnkSysNodeList(HashMap procParam) {	
		List<LnkSysNode> objList =new ArrayList<LnkSysNode>();
		objList = (ArrayList<LnkSysNode>)procParam.get("lnkSysNodeListDS");
		lnkSysNodeDao.insert(objList);
	}	
	
}
