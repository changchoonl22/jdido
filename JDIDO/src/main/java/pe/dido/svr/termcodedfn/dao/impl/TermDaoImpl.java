package pe.dido.svr.termcodedfn.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.termcodedfn.dao.TermDao;
import pe.dido.svr.termcodedfn.model.Term;
import pe.dido.svr.termcodedfn.service.TermCodeServiceImpl;

@Repository("termDao")
public class TermDaoImpl implements TermDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Term findById(HashMap searchVo) {
		return sqlSession.selectOne("Term.findById",searchVo);

	}

	@Override
	public List<Term> findList(){//HashMap searchVo) {
		return sqlSession.selectList("Term.findList");//,searchVo);

	}

	@Override
	public void insert(List objList) {	
		sqlSession.insert("Term.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("Term.update", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("Term.delete", List<Term> objList);
	}

}
