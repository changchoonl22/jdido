package pe.dido.svr.clzmodeling.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.bizmodeling.model.BizRule;
import pe.dido.svr.clzmodeling.dao.*;
import pe.dido.svr.clzmodeling.model.*;

@Service("clzModelingService")
public class ClzModelingServiceImpl implements ClzModelingService  {
	@Autowired
	private ClassAttrbDao classAttrbDao;
	@Autowired
	private ClassMDao classMDao;
	@Autowired
	private ClassOpDao classOpDao;	
	
	//ClassAttrbDao	
	@Override
	@Transactional(readOnly = true)	
	public ClassAttrb findClassAttrbById(HashMap searchVo) {	
		return classAttrbDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<ClassAttrb> findClassAttrbList(){//HashMap searchVo) {	
		return classAttrbDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveClassAttrbList(HashMap procParam) {	
		List<ClassAttrb> objList =new ArrayList<ClassAttrb>();
		
		
        List<ClassAttrb> insertList = new ArrayList<ClassAttrb>();
        List<ClassAttrb> updateList = new ArrayList<ClassAttrb>();
        List<ClassAttrb> deleteList = new ArrayList<ClassAttrb>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<ClassAttrb>)procParam.get("classAttrbListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	ClassAttrb tempObj = (ClassAttrb) objList.get(i);
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
        	classAttrbDao.insert(insertList);
        }else if(updateList.size()>0){
        	classAttrbDao.update(updateList);
        }else if(deleteList.size()>0){
        	classAttrbDao.delete(deleteList);
        }
	}	

	
	//ClassMDao	
	@Override
	@Transactional(readOnly = true)	
	public ClassM findClassMById(HashMap searchVo) {	
		return classMDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<ClassM> findClassMList(){//HashMap searchVo) {	
		return classMDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveClassMList(HashMap procParam) {	
		List<ClassM> objList =new ArrayList<ClassM>();
		
        List<ClassM> insertList = new ArrayList<ClassM>();
        List<ClassM> updateList = new ArrayList<ClassM>();
        List<ClassM> deleteList = new ArrayList<ClassM>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<ClassM>)procParam.get("classMListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	ClassM tempObj = (ClassM) objList.get(i);
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
        	classMDao.insert(insertList);
        }else if(updateList.size()>0){
        	classMDao.update(updateList);
        }else if(deleteList.size()>0){
        	classMDao.delete(deleteList);
        }	
	}	

	
	//ClassOpDao	
	@Override
	@Transactional(readOnly = true)	
	public ClassOp findClassOpById(HashMap searchVo) {	
		return classOpDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<ClassOp> findClassOpList(){//HashMap searchVo) {	
		return classOpDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveClassOpList(HashMap procParam) {	
		List<ClassOp> objList =new ArrayList<ClassOp>();

        List<ClassOp> insertList = new ArrayList<ClassOp>();
        List<ClassOp> updateList = new ArrayList<ClassOp>();
        List<ClassOp> deleteList = new ArrayList<ClassOp>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<ClassOp>)procParam.get("classOpListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	ClassOp tempObj = (ClassOp) objList.get(i);
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
        	classOpDao.insert(insertList);
        }else if(updateList.size()>0){
        	classOpDao.update(updateList);
        }else if(deleteList.size()>0){
        	classOpDao.delete(deleteList);
        }		
	}		
}
