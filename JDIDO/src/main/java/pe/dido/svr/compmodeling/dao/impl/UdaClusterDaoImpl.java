/**
 * 
 */
package pe.dido.svr.compmodeling.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.compmodeling.dao.UdaClusterDao;
import pe.dido.svr.compmodeling.model.UdaCluster;

/**
 * @author cclee
 *
 */
@Repository
public class UdaClusterDaoImpl implements UdaClusterDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.UdaClusterMapper#deleteUdaClusterById(pe.dido.svr.compmodeling.model.UdaCluster)
	 */
	@Override
	public void deleteUdaClusterById(UdaCluster udaCluster) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.UdaClusterMapper#deleteUdaClusterList(java.util.List)
	 */
	@Override
	public void deleteUdaClusterList(List<UdaCluster> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.UdaClusterMapper#findUdaClusterById(int)
	 */
	@Override
	public UdaCluster findUdaClusterById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.UdaClusterMapper#findUdaClusterList(int)
	 */
	@Override
	public ArrayList<UdaCluster> findUdaClusterList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.UdaClusterMapper#insertUdaClusterById(pe.dido.svr.compmodeling.model.UdaCluster)
	 */
	@Override
	public void insertUdaClusterById(UdaCluster udaCluster) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.UdaClusterMapper#insertUdaClusterList(java.util.List)
	 */
	@Override
	public void insertUdaClusterList(List<UdaCluster> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.UdaClusterMapper#updateUdaClusterById(pe.dido.svr.compmodeling.model.UdaCluster)
	 */
	@Override
	public void updateUdaClusterById(UdaCluster udaCluster) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.UdaClusterMapper#updateUdaClusterList(java.util.List)
	 */
	@Override
	public void updateUdaClusterList(List<UdaCluster> updateList) {
		// TODO Auto-generated method stub

	}

}
