package pe.dido.svr.uidesign.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.ucsmodeling.model.UcActorMap;
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
		
		
        List<UiAuthor> insertList = new ArrayList<UiAuthor>();
        List<UiAuthor> updateList = new ArrayList<UiAuthor>();
        List<UiAuthor> deleteList = new ArrayList<UiAuthor>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UiAuthor>)procParam.get("uiAuthorListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UiAuthor tempObj = (UiAuthor) objList.get(i);
            if((tempObj.getStatusYn()).equals("I")){
                   insertList.add(iidx, tempObj);
                   iidx++;
            }else if((tempObj.getStatusYn()).equals("U")){
                   updateList.add(uidx, tempObj);
                   uidx++;
            }else if((tempObj.getStatusYn()).equals("D")){
                   deleteList.add(didx, tempObj);
                   didx++;
            }
        }
        if(insertList.size()>0){
        	uiAuthorDao.insert(insertList);
        }else if(updateList.size()>0){
        	uiAuthorDao.update(updateList);
        }else if(deleteList.size()>0){
        	uiAuthorDao.delete(deleteList);
        }		
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
		
		
        List<UiAuthorMap> insertList = new ArrayList<UiAuthorMap>();
        List<UiAuthorMap> updateList = new ArrayList<UiAuthorMap>();
        List<UiAuthorMap> deleteList = new ArrayList<UiAuthorMap>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UiAuthorMap>)procParam.get("uiAuthorMapListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UiAuthorMap tempObj = (UiAuthorMap) objList.get(i);
            if((tempObj.getStatusYn()).equals("I")){
                   insertList.add(iidx, tempObj);
                   iidx++;
            }else if((tempObj.getStatusYn()).equals("U")){
                   updateList.add(uidx, tempObj);
                   uidx++;
            }else if((tempObj.getStatusYn()).equals("D")){
                   deleteList.add(didx, tempObj);
                   didx++;
            }
        }
        if(insertList.size()>0){
        	uiAuthorMapDao.insert(insertList);
        }else if(updateList.size()>0){
        	uiAuthorMapDao.update(updateList);
        }else if(deleteList.size()>0){
        	uiAuthorMapDao.delete(deleteList);
        }		
		
		
		//uiAuthorMapDao.insert(objList);
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
		
		
        List<UiM> insertList = new ArrayList<UiM>();
        List<UiM> updateList = new ArrayList<UiM>();
        List<UiM> deleteList = new ArrayList<UiM>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UiM>)procParam.get("uiMListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UiM tempObj = (UiM) objList.get(i);
            if((tempObj.getStatusYn()).equals("I")){
                   insertList.add(iidx, tempObj);
                   iidx++;
            }else if((tempObj.getStatusYn()).equals("U")){
                   updateList.add(uidx, tempObj);
                   uidx++;
            }else if((tempObj.getStatusYn()).equals("D")){
                   deleteList.add(didx, tempObj);
                   didx++;
            }
        }
        if(insertList.size()>0){
        	uiMDao.insert(insertList);
        }else if(updateList.size()>0){
        	uiMDao.update(updateList);
        }else if(deleteList.size()>0){
        	uiMDao.delete(deleteList);
        }	
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
		
		
        List<UiMenuPkg> insertList = new ArrayList<UiMenuPkg>();
        List<UiMenuPkg> updateList = new ArrayList<UiMenuPkg>();
        List<UiMenuPkg> deleteList = new ArrayList<UiMenuPkg>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UiMenuPkg>)procParam.get("uiMenuPkgListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UiMenuPkg tempObj = (UiMenuPkg) objList.get(i);
            if((tempObj.getStatusYn()).equals("I")){
                   insertList.add(iidx, tempObj);
                   iidx++;
            }else if((tempObj.getStatusYn()).equals("U")){
                   updateList.add(uidx, tempObj);
                   uidx++;
            }else if((tempObj.getStatusYn()).equals("D")){
                   deleteList.add(didx, tempObj);
                   didx++;
            }
        }
        if(insertList.size()>0){
        	uiMenuPkgDao.insert(insertList);
        }else if(updateList.size()>0){
        	uiMenuPkgDao.update(updateList);
        }else if(deleteList.size()>0){
        	uiMenuPkgDao.delete(deleteList);
        }	
	}	
	

}
