package pe.dido.svr.lnkdesign.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.lnkdesign.model.LnkIfIem;
import pe.dido.svr.lnkdesign.model.LnkIfPgm;
import pe.dido.svr.lnkdesign.model.LnkIfPgmMeta;
import pe.dido.svr.lnkdesign.model.LnkOtrSys;
import pe.dido.svr.lnkdesign.model.LnkSysNode;

public interface LnkDesignService {

	//LnkIfIemDao	
	public LnkIfIem findLnkIfIemById(HashMap searchVo);

	public List<LnkIfIem> findLnkIfIemList();

	public void saveLnkIfIemList(HashMap procParam);

	//LnkIfPgmDao	
	public LnkIfPgm findLnkIfPgmById(HashMap searchVo);

	public List<LnkIfPgm> findLnkIfPgmList();

	public void saveLnkIfPgmList(HashMap procParam);

	//LnkIfPgmMetaDao	
	public LnkIfPgmMeta findLnkIfPgmMetaById(HashMap searchVo);

	public List<LnkIfPgmMeta> findLnkIfPgmMetaList();

	public void saveLnkIfPgmMetaList(HashMap procParam);

	//LnkOtrSysDao	
	public LnkOtrSys findLnkOtrSysById(HashMap searchVo);

	public List<LnkOtrSys> findLnkOtrSysList();

	public void saveLnkOtrSysList(HashMap procParam);

	//LnkSysNodeDao	
	public LnkSysNode findLnkSysNodeById(HashMap searchVo);

	public List<LnkSysNode> findLnkSysNodeList();

	public void saveLnkSysNodeList(HashMap procParam);

}