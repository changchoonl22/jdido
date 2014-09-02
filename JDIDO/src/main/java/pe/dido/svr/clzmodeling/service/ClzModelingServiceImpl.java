package pe.dido.svr.clzmodeling.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		objList = (ArrayList<ClassAttrb>)procParam.get("classAttrbListDS");
		classAttrbDao.insert(objList);
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
		objList = (ArrayList<ClassM>)procParam.get("classMListDS");
		classMDao.insert(objList);
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
		objList = (ArrayList<ClassOp>)procParam.get("classOpListDS");
		classOpDao.insert(objList);
	}	
	
}
