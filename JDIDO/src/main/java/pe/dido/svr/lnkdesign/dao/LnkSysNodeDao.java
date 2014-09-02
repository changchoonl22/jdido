package pe.dido.svr.lnkdesign.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.lnkdesign.model.LnkSysNode;

public interface LnkSysNodeDao {

	public LnkSysNode findById(HashMap searchVo);

	public List<LnkSysNode> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}