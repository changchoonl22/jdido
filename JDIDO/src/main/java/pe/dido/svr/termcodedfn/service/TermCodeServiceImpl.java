package pe.dido.svr.termcodedfn.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.reqmngt.model.UpperDmndDmndMap;
import pe.dido.svr.termcodedfn.dao.*;
import pe.dido.svr.termcodedfn.model.*;

@Service("termCodeService")
public class TermCodeServiceImpl implements TermCodeService {
	@Autowired
	private CodeMDao codeMDao;
	@Autowired
	private CodeDDao codeDDao;
	@Autowired
	private TermDao termDao;	
	
	//codem
	@Override
	@Transactional(readOnly = true)
	public CodeM findCodeMById(HashMap searchVo) {
		return codeMDao.findById(searchVo);
	}

	@Override
	@Transactional(readOnly = true)
	public List<CodeM> findCodeMList(){//HashMap searchVo){
		return codeMDao.findList();//searchVo);
	}

	@Override
	@Transactional
	public void saveCodeMList(HashMap procParam) {
		List<CodeM> objList = new ArrayList<CodeM>();
		
		
        List<CodeM> insertList = new ArrayList<CodeM>();
        List<CodeM> updateList = new ArrayList<CodeM>();
        List<CodeM> deleteList = new ArrayList<CodeM>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<CodeM>) procParam.get("codeMListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	CodeM tempObj = (CodeM) objList.get(i);
            if((tempObj.getStatusYn()).equals("I")){
                   insertList.add(iidx, tempObj);
                   iidx++;
            }else if((tempObj.getStatusYn()).equals("U")){
                   updateList.add(uidx, tempObj);
                   uidx++;
            }else if((tempObj.getStatusYn()).equals("D")){
                   deleteList.add(didx, tempObj);
                   didx++;
            }
        }
        if(insertList.size()>0){
        	codeMDao.insert(insertList);
        }else if(updateList.size()>0){
        	codeMDao.update(updateList);
        }else if(deleteList.size()>0){
        	codeMDao.delete(deleteList);
        }		
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	//coded
	@Override
	@Transactional(readOnly = true)
	public CodeD findCodeDById(HashMap searchVo) {
		return codeDDao.findById(searchVo);
	}


	@Override
	@Transactional(readOnly = true)
	public List<CodeD> findCodeDList(){//HashMap searchVo){
		return codeDDao.findList();//searchVo);
	}

	@Override
	@Transactional
	public void saveCodeDList(HashMap procParam) {
		List<CodeD> objList = new ArrayList<CodeD>();
		
		
        List<CodeD> insertList = new ArrayList<CodeD>();
        List<CodeD> updateList = new ArrayList<CodeD>();
        List<CodeD> deleteList = new ArrayList<CodeD>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<CodeD>) procParam.get("codeDListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	CodeD tempObj = (CodeD) objList.get(i);
            if((tempObj.getStatusYn()).equals("I")){
                   insertList.add(iidx, tempObj);
                   iidx++;
            }else if((tempObj.getStatusYn()).equals("U")){
                   updateList.add(uidx, tempObj);
                   uidx++;
            }else if((tempObj.getStatusYn()).equals("D")){
                   deleteList.add(didx, tempObj);
                   didx++;
            }
        }
        if(insertList.size()>0){
        	codeDDao.insert(insertList);
        }else if(updateList.size()>0){
        	codeDDao.update(updateList);
        }else if(deleteList.size()>0){
        	codeDDao.delete(deleteList);
        }	
	}
	
	//term
	@Override
	@Transactional(readOnly = true)
	public Term findTermById(HashMap searchVo) {
		return termDao.findById(searchVo);
	}


	@Override
	@Transactional(readOnly = true)
	public List<Term> findTermList(){//HashMap searchVo){
		return termDao.findList();//searchVo);
	}

	@Override
	@Transactional
	public void saveTermList(HashMap procParam) {
		List<Term> objList = new ArrayList<Term>();
		
		
        List<Term> insertList = new ArrayList<Term>();
        List<Term> updateList = new ArrayList<Term>();
        List<Term> deleteList = new ArrayList<Term>();

        int iidx=0, uidx=0, didx=0;
		objList = (ArrayList<Term>) procParam.get("termListDS");
        
        for(int i = 0; i < objList.size(); i++){
        	Term tempObj = (Term) objList.get(i);
            if((tempObj.getStatusYn()).equals("I")){
                   insertList.add(iidx, tempObj);
                   iidx++;
            }else if((tempObj.getStatusYn()).equals("U")){
                   updateList.add(uidx, tempObj);
                   uidx++;
            }else if((tempObj.getStatusYn()).equals("D")){
                   deleteList.add(didx, tempObj);
                   didx++;
            }
        }
        if(insertList.size()>0){
        	termDao.insert(insertList);
        }else if(updateList.size()>0){
        	termDao.update(updateList);
        }else if(deleteList.size()>0){
        	termDao.delete(deleteList);
        }	
	}	
}
