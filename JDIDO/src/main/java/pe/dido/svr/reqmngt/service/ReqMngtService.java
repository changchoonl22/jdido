package pe.dido.svr.reqmngt.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.reqmngt.model.Dept;
import pe.dido.svr.reqmngt.model.DmndDeptMap;
import pe.dido.svr.reqmngt.model.DmndM;
import pe.dido.svr.reqmngt.model.DmndRelateBasis;
import pe.dido.svr.reqmngt.model.UpperDmnd;
import pe.dido.svr.reqmngt.model.UpperDmndDmndMap;

public interface ReqMngtService {

	//DeptDao	
	public Dept findDeptById(HashMap searchVo);

	public List<Dept> findDeptList();

	public void saveDeptList(HashMap procParam);

	//DmndDeptMapDao	
	public DmndDeptMap findDmndDeptMapById(HashMap searchVo);

	public List<DmndDeptMap> findDmndDeptMapList();

	public void saveDmndDeptMapList(HashMap procParam);

	//DmndMDao	
	public DmndM findDmndMById(HashMap searchVo);

	public List<DmndM> findDmndMList();

	public void saveDmndMList(HashMap procParam);

	//DmndRelateBasisDao	
	public DmndRelateBasis findDmndRelateBasisById(HashMap searchVo);

	public List<DmndRelateBasis> findDmndRelateBasisList();

	public void saveDmndRelateBasisList(HashMap procParam);

	//UpperDmndDao	
	public UpperDmnd findUpperDmndById(HashMap searchVo);

	public List<UpperDmnd> findUpperDmndList();

	public void saveUpperDmndList(HashMap procParam);

	//UpperDmndDmndMapDao	
	public UpperDmndDmndMap findUpperDmndDmndMapById(HashMap searchVo);

	public List<UpperDmndDmndMap> findUpperDmndDmndMapList();

	public void saveUpperDmndDmndMapList(HashMap procParam);

}