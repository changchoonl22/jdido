package pe.dido.svr.uidesign.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.uidesign.dao.*;
import pe.dido.svr.uidesign.model.*;

@Service("uiDesignService")
public class UiDesignServiceImpl implements UiDesignService  {
	@Autowired
	private UiAuthorDao uiAuthorDao;
	@Autowired
	private UiAuthorMapDao uiAuthorMapDao;
	@Autowired
	private UiMDao uiMDao;
	@Autowired
	private UiMenuPkgDao uiMenuPkgDao;

	//UiAuthorDao.java	
	@Override
	@Transactional(readOnly = true)	
	public UiAuthor findUiAuthorById(HashMap searchVo) {	
		return uiAuthorDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UiAuthor> findUiAuthorList(){//HashMap searchVo) {	
		return uiAuthorDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUiAuthorList(HashMap procParam) {	
		List<UiAuthor> objList =new ArrayList<UiAuthor>();
		objList = (ArrayList<UiAuthor>)procParam.get("uiAuthorListDS");
		uiAuthorDao.insert(objList);
	}	
	//UiAuthorMapDao.java	
	@Override
	@Transactional(readOnly = true)	
	public UiAuthorMap findUiAuthorMapById(HashMap searchVo) {	
		return uiAuthorMapDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UiAuthorMap> findUiAuthorMapList(){//HashMap searchVo) {	
		return uiAuthorMapDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUiAuthorMapList(HashMap procParam) {	
		List<UiAuthorMap> objList =new ArrayList<UiAuthorMap>();
		objList = (ArrayList<UiAuthorMap>)procParam.get("uiAuthorMapListDS");
		uiAuthorMapDao.insert(objList);
	}	
	//UiMDao.java	
	@Override
	@Transactional(readOnly = true)	
	public UiM findUiMById(HashMap searchVo) {	
		return uiMDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UiM> findUiMList(){//HashMap searchVo) {	
		return uiMDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUiMList(HashMap procParam) {	
		List<UiM> objList =new ArrayList<UiM>();
		objList = (ArrayList<UiM>)procParam.get("uiMListDS");
		uiMDao.insert(objList);
	}	
	
	//UiMenuPkgDao.java	
	@Override
	@Transactional(readOnly = true)	
	public UiMenuPkg findUiMenuPkgById(HashMap searchVo) {	
		return uiMenuPkgDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UiMenuPkg> findUiMenuPkgList(){//HashMap searchVo) {	
		return uiMenuPkgDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUiMenuPkgList(HashMap procParam) {	
		List<UiMenuPkg> objList =new ArrayList<UiMenuPkg>();
		objList = (ArrayList<UiMenuPkg>)procParam.get("uiMenuPkgListDS");
		uiMenuPkgDao.insert(objList);
	}	
	

}
