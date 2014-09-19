package pe.dido.svr.lnkdesign.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.compmodeling.model.UdaCluster;
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
		

        List<LnkIfIem> insertList = new ArrayList<LnkIfIem>();
        List<LnkIfIem> updateList = new ArrayList<LnkIfIem>();
        List<LnkIfIem> deleteList = new ArrayList<LnkIfIem>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<LnkIfIem>)procParam.get("lnkIfIemListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	LnkIfIem tempObj = (LnkIfIem) objList.get(i);
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
        	lnkIfIemDao.insert(insertList);
        }else if(updateList.size()>0){
        	lnkIfIemDao.update(updateList);
        }else if(deleteList.size()>0){
        	lnkIfIemDao.delete(deleteList);
        }	
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
	
        List<LnkIfPgm> insertList = new ArrayList<LnkIfPgm>();
        List<LnkIfPgm> updateList = new ArrayList<LnkIfPgm>();
        List<LnkIfPgm> deleteList = new ArrayList<LnkIfPgm>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<LnkIfPgm>)procParam.get("lnkIfPgmListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	LnkIfPgm tempObj = (LnkIfPgm) objList.get(i);
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
        	lnkIfPgmDao.insert(insertList);
        }else if(updateList.size()>0){
        	lnkIfPgmDao.update(updateList);
        }else if(deleteList.size()>0){
        	lnkIfPgmDao.delete(deleteList);
        }
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
		
		
        List<LnkIfPgmMeta> insertList = new ArrayList<LnkIfPgmMeta>();
        List<LnkIfPgmMeta> updateList = new ArrayList<LnkIfPgmMeta>();
        List<LnkIfPgmMeta> deleteList = new ArrayList<LnkIfPgmMeta>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<LnkIfPgmMeta>)procParam.get("lnkIfPgmMetaListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	LnkIfPgmMeta tempObj = (LnkIfPgmMeta) objList.get(i);
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
        	lnkIfPgmMetaDao.insert(insertList);
        }else if(updateList.size()>0){
        	lnkIfPgmMetaDao.update(updateList);
        }else if(deleteList.size()>0){
        	lnkIfPgmMetaDao.delete(deleteList);
        }
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
		
        List<LnkOtrSys> insertList = new ArrayList<LnkOtrSys>();
        List<LnkOtrSys> updateList = new ArrayList<LnkOtrSys>();
        List<LnkOtrSys> deleteList = new ArrayList<LnkOtrSys>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<LnkOtrSys>)procParam.get("lnkOtrSysListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	LnkOtrSys tempObj = (LnkOtrSys) objList.get(i);
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
        	lnkOtrSysDao.insert(insertList);
        }else if(updateList.size()>0){
        	lnkOtrSysDao.update(updateList);
        }else if(deleteList.size()>0){
        	lnkOtrSysDao.delete(deleteList);
        }		
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
		
        List<LnkSysNode> insertList = new ArrayList<LnkSysNode>();
        List<LnkSysNode> updateList = new ArrayList<LnkSysNode>();
        List<LnkSysNode> deleteList = new ArrayList<LnkSysNode>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<LnkSysNode>)procParam.get("lnkSysNodeListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	LnkSysNode tempObj = (LnkSysNode) objList.get(i);
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
        	lnkSysNodeDao.insert(insertList);
        }else if(updateList.size()>0){
        	lnkSysNodeDao.update(updateList);
        }else if(deleteList.size()>0){
        	lnkSysNodeDao.delete(deleteList);
        }	
	}	
	
}
