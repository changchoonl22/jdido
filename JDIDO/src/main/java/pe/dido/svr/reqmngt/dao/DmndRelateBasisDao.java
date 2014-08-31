package pe.dido.svr.reqmngt.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.reqmngt.model.DmndRelateBasis;

public interface DmndRelateBasisDao {

	void deleteDmndRelateBasisById(DmndRelateBasis dmndRelateBasis);
	void deleteDmndRelateBasisList(List<DmndRelateBasis> deleteList);
	//DmndRelateBasisMapper
	DmndRelateBasis findDmndRelateBasisById(int id);
	ArrayList<DmndRelateBasis> findDmndRelateBasisList(int id);
	void insertDmndRelateBasisById(DmndRelateBasis dmndRelateBasis);
	void insertDmndRelateBasisList(List<DmndRelateBasis> insertList);
	void updateDmndRelateBasisById(DmndRelateBasis dmndRelateBasis);
	void updateDmndRelateBasisList(List<DmndRelateBasis> updateList);

}