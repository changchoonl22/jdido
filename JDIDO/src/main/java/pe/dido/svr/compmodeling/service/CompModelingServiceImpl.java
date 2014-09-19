package pe.dido.svr.compmodeling.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.clzmodeling.model.ClassOp;
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
		
        List<CompIfclass> insertList = new ArrayList<CompIfclass>();
        List<CompIfclass> updateList = new ArrayList<CompIfclass>();
        List<CompIfclass> deleteList = new ArrayList<CompIfclass>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<CompIfclass>)procParam.get("compIfclassListDS");	
        
        for(int i = 0; i < objList.size(); i++){
        	CompIfclass tempObj = (CompIfclass) objList.get(i);
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
        	compIfclassDao.insert(insertList);
        }else if(updateList.size()>0){
        	compIfclassDao.update(updateList);
        }else if(deleteList.size()>0){
        	compIfclassDao.delete(deleteList);
        }
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
		

        List<CompImplClass> insertList = new ArrayList<CompImplClass>();
        List<CompImplClass> updateList = new ArrayList<CompImplClass>();
        List<CompImplClass> deleteList = new ArrayList<CompImplClass>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<CompImplClass>)procParam.get("compImplClassListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	CompImplClass tempObj = (CompImplClass) objList.get(i);
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
        	compImplClassDao.insert(insertList);
        }else if(updateList.size()>0){
        	compImplClassDao.update(updateList);
        }else if(deleteList.size()>0){
        	compImplClassDao.delete(deleteList);
        }		
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
		
		
        List<CompInnerClassAttrb> insertList = new ArrayList<CompInnerClassAttrb>();
        List<CompInnerClassAttrb> updateList = new ArrayList<CompInnerClassAttrb>();
        List<CompInnerClassAttrb> deleteList = new ArrayList<CompInnerClassAttrb>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<CompInnerClassAttrb>)procParam.get("compInnerClassAttrbListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	CompInnerClassAttrb tempObj = (CompInnerClassAttrb) objList.get(i);
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
        	compInnerClassAttrbDao.insert(insertList);
        }else if(updateList.size()>0){
        	compInnerClassAttrbDao.update(updateList);
        }else if(deleteList.size()>0){
        	compInnerClassAttrbDao.delete(deleteList);
        }	
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
		
		
        List<CompInnerClassOp> insertList = new ArrayList<CompInnerClassOp>();
        List<CompInnerClassOp> updateList = new ArrayList<CompInnerClassOp>();
        List<CompInnerClassOp> deleteList = new ArrayList<CompInnerClassOp>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<CompInnerClassOp>)procParam.get("compInnerClassOpListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	CompInnerClassOp tempObj = (CompInnerClassOp) objList.get(i);
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
        	compInnerClassOpDao.insert(insertList);
        }else if(updateList.size()>0){
        	compInnerClassOpDao.update(updateList);
        }else if(deleteList.size()>0){
        	compInnerClassOpDao.delete(deleteList);
        }		
		
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
		
        List<CompM> insertList = new ArrayList<CompM>();
        List<CompM> updateList = new ArrayList<CompM>();
        List<CompM> deleteList = new ArrayList<CompM>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<CompM>)procParam.get("compMListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	CompM tempObj = (CompM) objList.get(i);
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
        	compMDao.insert(insertList);
        }else if(updateList.size()>0){
        	compMDao.update(updateList);
        }else if(deleteList.size()>0){
        	compMDao.delete(deleteList);
        }	
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
		
        List<UdaCluster> insertList = new ArrayList<UdaCluster>();
        List<UdaCluster> updateList = new ArrayList<UdaCluster>();
        List<UdaCluster> deleteList = new ArrayList<UdaCluster>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UdaCluster>)procParam.get("udaClusterListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UdaCluster tempObj = (UdaCluster) objList.get(i);
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
        	udaClusterDao.insert(insertList);
        }else if(updateList.size()>0){
        	udaClusterDao.update(updateList);
        }else if(deleteList.size()>0){
        	udaClusterDao.delete(deleteList);
        }	
	}	
	
}
