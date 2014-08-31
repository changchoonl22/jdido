package pe.dido.svr.compmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.compmodeling.model.UdaCluster;

public interface UdaClusterDao {

	void deleteUdaClusterById(UdaCluster udaCluster);
	void deleteUdaClusterList(List<UdaCluster> deleteList);
	//UdaClusterMapper
	UdaCluster findUdaClusterById(int id);
	ArrayList<UdaCluster> findUdaClusterList(int id);
	void insertUdaClusterById(UdaCluster udaCluster);
	void insertUdaClusterList(List<UdaCluster> insertList);
	void updateUdaClusterById(UdaCluster udaCluster);
	void updateUdaClusterList(List<UdaCluster> updateList);

}