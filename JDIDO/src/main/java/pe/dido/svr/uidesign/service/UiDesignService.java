package pe.dido.svr.uidesign.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.uidesign.model.UiAuthor;
import pe.dido.svr.uidesign.model.UiAuthorMap;
import pe.dido.svr.uidesign.model.UiM;
import pe.dido.svr.uidesign.model.UiMenuPkg;

public interface UiDesignService {

	//UiAuthorDao.java	
	public UiAuthor findUiAuthorById(HashMap searchVo);

	public List<UiAuthor> findUiAuthorList();

	public void saveUiAuthorList(HashMap procParam);

	//UiAuthorMapDao.java	
	public UiAuthorMap findUiAuthorMapById(HashMap searchVo);

	public List<UiAuthorMap> findUiAuthorMapList();

	public void saveUiAuthorMapList(HashMap procParam);

	//UiMDao.java	
	public UiM findUiMById(HashMap searchVo);

	public List<UiM> findUiMList();

	public void saveUiMList(HashMap procParam);

	//UiMenuPkgDao.java	
	public UiMenuPkg findUiMenuPkgById(HashMap searchVo);

	public List<UiMenuPkg> findUiMenuPkgList();

	public void saveUiMenuPkgList(HashMap procParam);

}