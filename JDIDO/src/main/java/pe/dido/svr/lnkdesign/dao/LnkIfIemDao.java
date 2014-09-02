package pe.dido.svr.lnkdesign.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.lnkdesign.model.LnkIfIem;

public interface LnkIfIemDao {

	public LnkIfIem findById(HashMap searchVo);

	public List<LnkIfIem> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}