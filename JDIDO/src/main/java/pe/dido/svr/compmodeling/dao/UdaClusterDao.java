package pe.dido.svr.compmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.compmodeling.model.UdaCluster;

public interface UdaClusterDao {

	public UdaCluster findById(HashMap searchVo);

	public List<UdaCluster> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}