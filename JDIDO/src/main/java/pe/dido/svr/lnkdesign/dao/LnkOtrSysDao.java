package pe.dido.svr.lnkdesign.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.lnkdesign.model.LnkOtrSys;

public interface LnkOtrSysDao {

	public LnkOtrSys findById(HashMap searchVo);

	public List<LnkOtrSys> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}