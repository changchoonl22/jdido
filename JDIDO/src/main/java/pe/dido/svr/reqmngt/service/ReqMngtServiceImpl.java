package pe.dido.svr.reqmngt.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		objList = (ArrayList<Dept>)procParam.get("deptListDS");
		deptDao.insert(objList);
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
		objList = (ArrayList<DmndDeptMap>)procParam.get("dmndDeptMapListDS");
		dmndDeptMapDao.insert(objList);
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
		objList = (ArrayList<DmndM>)procParam.get("dmndMListDS");
		dmndMDao.insert(objList);
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
		objList = (ArrayList<DmndRelateBasis>)procParam.get("dmndRelateBasisListDS");
		dmndRelateBasisDao.insert(objList);
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
		objList = (ArrayList<UpperDmnd>)procParam.get("upperDmndListDS");
		upperDmndDao.insert(objList);
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
		objList = (ArrayList<UpperDmndDmndMap>)procParam.get("upperDmndDmndMapListDS");
		upperDmndDmndMapDao.insert(objList);
	}	

}
