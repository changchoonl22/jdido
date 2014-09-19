package pe.dido.svr.reqmngt.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.lnkdesign.model.LnkSysNode;
import pe.dido.svr.reqmngt.dao.*;
import pe.dido.svr.reqmngt.model.*;

@Service("reqMngtService")
public class ReqMngtServiceImpl implements ReqMngtService {
	@Autowired
	private DeptDao deptDao;
	@Autowired
	private DmndDeptMapDao dmndDeptMapDao;
	@Autowired
	private DmndMDao dmndMDao;
	@Autowired
	private DmndRelateBasisDao dmndRelateBasisDao;
	@Autowired
	private UpperDmndDao upperDmndDao;
	@Autowired
	private UpperDmndDmndMapDao upperDmndDmndMapDao;
	


	
	//DeptDao	
	@Override
	@Transactional(readOnly = true)	
	public Dept findDeptById(HashMap searchVo) {	
		return deptDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<Dept> findDeptList(){//HashMap searchVo) {	
		return deptDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveDeptList(HashMap procParam) {	
		List<Dept> objList =new ArrayList<Dept>();
		
		
        List<Dept> insertList = new ArrayList<Dept>();
        List<Dept> updateList = new ArrayList<Dept>();
        List<Dept> deleteList = new ArrayList<Dept>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<Dept>)procParam.get("deptListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	Dept tempObj = (Dept) objList.get(i);
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
        	deptDao.insert(insertList);
        }else if(updateList.size()>0){
        	deptDao.update(updateList);
        }else if(deleteList.size()>0){
        	deptDao.delete(deleteList);
        }		
		
	}	
	//DmndDeptMapDao	
	@Override
	@Transactional(readOnly = true)	
	public DmndDeptMap findDmndDeptMapById(HashMap searchVo) {	
		return dmndDeptMapDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<DmndDeptMap> findDmndDeptMapList(){//HashMap searchVo) {	
		return dmndDeptMapDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveDmndDeptMapList(HashMap procParam) {	
		List<DmndDeptMap> objList =new ArrayList<DmndDeptMap>();
		
		
        List<DmndDeptMap> insertList = new ArrayList<DmndDeptMap>();
        List<DmndDeptMap> updateList = new ArrayList<DmndDeptMap>();
        List<DmndDeptMap> deleteList = new ArrayList<DmndDeptMap>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<DmndDeptMap>)procParam.get("dmndDeptMapListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	DmndDeptMap tempObj = (DmndDeptMap) objList.get(i);
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
        	dmndDeptMapDao.insert(insertList);
        }else if(updateList.size()>0){
        	dmndDeptMapDao.update(updateList);
        }else if(deleteList.size()>0){
        	dmndDeptMapDao.delete(deleteList);
        }			
		
	}	
	//DmndMDao	
	@Override
	@Transactional(readOnly = true)	
	public DmndM findDmndMById(HashMap searchVo) {	
		return dmndMDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<DmndM> findDmndMList(){//HashMap searchVo) {	
		return dmndMDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveDmndMList(HashMap procParam) {	
		List<DmndM> objList =new ArrayList<DmndM>();
		
		
        List<DmndM> insertList = new ArrayList<DmndM>();
        List<DmndM> updateList = new ArrayList<DmndM>();
        List<DmndM> deleteList = new ArrayList<DmndM>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<DmndM>)procParam.get("dmndMListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	DmndM tempObj = (DmndM) objList.get(i);
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
        	dmndMDao.insert(insertList);
        }else if(updateList.size()>0){
        	dmndMDao.update(updateList);
        }else if(deleteList.size()>0){
        	dmndMDao.delete(deleteList);
        }			
		
		
		//dmndMDao.insert(objList);
	}	
	//DmndRelateBasisDao	
	@Override
	@Transactional(readOnly = true)	
	public DmndRelateBasis findDmndRelateBasisById(HashMap searchVo) {	
		return dmndRelateBasisDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<DmndRelateBasis> findDmndRelateBasisList(){//HashMap searchVo) {	
		return dmndRelateBasisDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveDmndRelateBasisList(HashMap procParam) {	
		List<DmndRelateBasis> objList =new ArrayList<DmndRelateBasis>();
		
		
        List<DmndRelateBasis> insertList = new ArrayList<DmndRelateBasis>();
        List<DmndRelateBasis> updateList = new ArrayList<DmndRelateBasis>();
        List<DmndRelateBasis> deleteList = new ArrayList<DmndRelateBasis>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<DmndRelateBasis>)procParam.get("dmndRelateBasisListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	DmndRelateBasis tempObj = (DmndRelateBasis) objList.get(i);
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
        	dmndRelateBasisDao.insert(insertList);
        }else if(updateList.size()>0){
        	dmndRelateBasisDao.update(updateList);
        }else if(deleteList.size()>0){
        	dmndRelateBasisDao.delete(deleteList);
        }		
		
		
		//dmndRelateBasisDao.insert(objList);
	}	
	//UpperDmndDao	
	@Override
	@Transactional(readOnly = true)	
	public UpperDmnd findUpperDmndById(HashMap searchVo) {	
		return upperDmndDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UpperDmnd> findUpperDmndList(){//HashMap searchVo) {	
		return upperDmndDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUpperDmndList(HashMap procParam) {	
		List<UpperDmnd> objList =new ArrayList<UpperDmnd>();
		
		
        List<UpperDmnd> insertList = new ArrayList<UpperDmnd>();
        List<UpperDmnd> updateList = new ArrayList<UpperDmnd>();
        List<UpperDmnd> deleteList = new ArrayList<UpperDmnd>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UpperDmnd>)procParam.get("upperDmndListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UpperDmnd tempObj = (UpperDmnd) objList.get(i);
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
        	upperDmndDao.insert(insertList);
        }else if(updateList.size()>0){
        	upperDmndDao.update(updateList);
        }else if(deleteList.size()>0){
        	upperDmndDao.delete(deleteList);
        }		
		
		
	//	upperDmndDao.insert(objList);
	}	
	//UpperDmndDmndMapDao	
	@Override
	@Transactional(readOnly = true)	
	public UpperDmndDmndMap findUpperDmndDmndMapById(HashMap searchVo) {	
		return upperDmndDmndMapDao.findById(searchVo);
	}	
		
	@Override
	@Transactional(readOnly = true)	
	public List<UpperDmndDmndMap> findUpperDmndDmndMapList(){//HashMap searchVo) {	
		return upperDmndDmndMapDao.findList();//searchVo);
	}	
		
	@Override
	@Transactional	
	public void saveUpperDmndDmndMapList(HashMap procParam) {	
		List<UpperDmndDmndMap> objList =new ArrayList<UpperDmndDmndMap>();
		
		
        List<UpperDmndDmndMap> insertList = new ArrayList<UpperDmndDmndMap>();
        List<UpperDmndDmndMap> updateList = new ArrayList<UpperDmndDmndMap>();
        List<UpperDmndDmndMap> deleteList = new ArrayList<UpperDmndDmndMap>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<UpperDmndDmndMap>)procParam.get("upperDmndDmndMapListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	UpperDmndDmndMap tempObj = (UpperDmndDmndMap) objList.get(i);
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
        	upperDmndDmndMapDao.insert(insertList);
        }else if(updateList.size()>0){
        	upperDmndDmndMapDao.update(updateList);
        }else if(deleteList.size()>0){
        	upperDmndDmndMapDao.delete(deleteList);
        }			
		
		
		//upperDmndDmndMapDao.insert(objList);
	}	

}
