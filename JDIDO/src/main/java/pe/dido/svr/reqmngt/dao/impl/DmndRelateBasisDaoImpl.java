/**
 * 
 */
package pe.dido.svr.reqmngt.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.reqmngt.dao.DmndRelateBasisDao;
import pe.dido.svr.reqmngt.model.DmndRelateBasis;

/**
 * @author cclee
 *
 */
@Repository
public class DmndRelateBasisDaoImpl implements DmndRelateBasisDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndRelateBasisMapper#deleteDmndRelateBasisById(pe.dido.svr.reqmngt.model.DmndRelateBasis)
	 */
	@Override
	public void deleteDmndRelateBasisById(DmndRelateBasis dmndRelateBasis) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndRelateBasisMapper#deleteDmndRelateBasisList(java.util.List)
	 */
	@Override
	public void deleteDmndRelateBasisList(List<DmndRelateBasis> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndRelateBasisMapper#findDmndRelateBasisById(int)
	 */
	@Override
	public DmndRelateBasis findDmndRelateBasisById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndRelateBasisMapper#findDmndRelateBasisList(int)
	 */
	@Override
	public ArrayList<DmndRelateBasis> findDmndRelateBasisList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndRelateBasisMapper#insertDmndRelateBasisById(pe.dido.svr.reqmngt.model.DmndRelateBasis)
	 */
	@Override
	public void insertDmndRelateBasisById(DmndRelateBasis dmndRelateBasis) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndRelateBasisMapper#insertDmndRelateBasisList(java.util.List)
	 */
	@Override
	public void insertDmndRelateBasisList(List<DmndRelateBasis> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndRelateBasisMapper#updateDmndRelateBasisById(pe.dido.svr.reqmngt.model.DmndRelateBasis)
	 */
	@Override
	public void updateDmndRelateBasisById(DmndRelateBasis dmndRelateBasis) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndRelateBasisMapper#updateDmndRelateBasisList(java.util.List)
	 */
	@Override
	public void updateDmndRelateBasisList(List<DmndRelateBasis> updateList) {
		// TODO Auto-generated method stub

	}

}
