package pe.dido.svr.compmodeling.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.compmodeling.dao.*;
import pe.dido.svr.compmodeling.model.*;

@Service("compModelingService")
public class CompModelingServiceImpl implements CompModelingService  {
	@Autowired
	private CompIfclassDao compIfclassDao;
	@Autowired
	private CompImplClassDao compImplClassDao;
	@Autowired
	private CompInnerClassAttrbDao compInnerClassAttrbDao;	
	@Autowired
	private CompInnerClassOpDao compInnerClassOpDao;
	@Autowired
	private CompMDao compMDao;
	@Autowired
	private UdaClusterDao udaClusterDao;
	
	//CompIfclassDao		
	@Override
	@Transactional(readOnly = true)		
	public CompIfclass findCompIfclassById(HashMap searchVo) {		
		return compIfclassDao.findById(searchVo);	
	}		
			
	@Override
	@Transactional(readOnly = true)		
	public List<CompIfclass> findCompIfclassList(){//HashMap searchVo) {		
		return compIfclassDao.findList();//searchVo);	
	}		
			
	@Override
	@Transactional		
	public void saveCompIfclassList(HashMap procParam) {		
		List<CompIfclass> objList =new ArrayList<CompIfclass>();	
		objList = (ArrayList<CompIfclass>)procParam.get("compIfclassListDS");	
		compIfclassDao.insert(objList);	
	}		

	//CompImplClassDao	
	@Override
	@Transactional(readOnly = true)	
	public CompImplClass findCompImplClassById(HashMap searchVo) {	
		return compImplClassDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<CompImplClass> findCompImplClassList(){//HashMap searchVo) {	
		return compImplClassDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveCompImplClassList(HashMap procParam) {	
		List<CompImplClass> objList =new ArrayList<CompImplClass>();
		objList = (ArrayList<CompImplClass>)procParam.get("compImplClassListDS");
		compImplClassDao.insert(objList);
	}	

	//CompInnerClassAttrbDao	
	@Override
	@Transactional(readOnly = true)	
	public CompInnerClassAttrb findCompInnerClassAttrbById(HashMap searchVo) {	
		return compInnerClassAttrbDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<CompInnerClassAttrb> findCompInnerClassAttrbList(){//HashMap searchVo) {	
		return compInnerClassAttrbDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveCompInnerClassAttrbList(HashMap procParam) {	
		List<CompInnerClassAttrb> objList =new ArrayList<CompInnerClassAttrb>();
		objList = (ArrayList<CompInnerClassAttrb>)procParam.get("compInnerClassAttrbListDS");
		compInnerClassAttrbDao.insert(objList);
	}	

	
	//CompInnerClassOpDao	
	@Override
	@Transactional(readOnly = true)	
	public CompInnerClassOp findCompInnerClassOpById(HashMap searchVo) {	
		return compInnerClassOpDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<CompInnerClassOp> findCompInnerClassOpList(){//HashMap searchVo) {	
		return compInnerClassOpDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveCompInnerClassOpList(HashMap procParam) {	
		List<CompInnerClassOp> objList =new ArrayList<CompInnerClassOp>();
		objList = (ArrayList<CompInnerClassOp>)procParam.get("compInnerClassOpListDS");
		compInnerClassOpDao.insert(objList);
	}	
	//CompMDao	
	@Override
	@Transactional(readOnly = true)	
	public CompM findCompMById(HashMap searchVo) {	
		return compMDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<CompM> findCompMList(){//HashMap searchVo) {	
		return compMDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveCompMList(HashMap procParam) {	
		List<CompM> objList =new ArrayList<CompM>();
		objList = (ArrayList<CompM>)procParam.get("compMListDS");
		compMDao.insert(objList);
	}	
	//UdaClusterDao	
	@Override
	@Transactional(readOnly = true)	
	public UdaCluster findUdaClusterById(HashMap searchVo) {	
		return udaClusterDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UdaCluster> findUdaClusterList(){//HashMap searchVo) {	
		return udaClusterDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUdaClusterList(HashMap procParam) {	
		List<UdaCluster> objList =new ArrayList<UdaCluster>();
		objList = (ArrayList<UdaCluster>)procParam.get("udaClusterListDS");
		udaClusterDao.insert(objList);
	}	
	
}
