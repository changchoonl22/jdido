package pe.dido.svr.lnkdesign.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.lnkdesign.model.LnkIfPgm;

public interface LnkIfPgmDao {

	public LnkIfPgm findById(HashMap searchVo);

	public List<LnkIfPgm> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}