package pe.dido.svr.uidesign.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.uidesign.model.UiAuthorMap;

public interface UiAuthorMapDao {

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiAuthorMapMapper#deleteUiAuthorMapById(pe.dido.svr.uidesign.model.UiAuthorMap)
	 */
	public void deleteUiAuthorMapById(UiAuthorMap uiAuthorMap);

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiAuthorMapMapper#deleteUiAuthorMapList(java.util.List)
	 */
	public void deleteUiAuthorMapList(List<UiAuthorMap> deleteList);

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiAuthorMapMapper#findUiAuthorMapById(int)
	 */
	public UiAuthorMap findUiAuthorMapById(int id);

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiAuthorMapMapper#findUiAuthorMapList(int)
	 */
	public ArrayList<UiAuthorMap> findUiAuthorMapList(int id);

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiAuthorMapMapper#insertUiAuthorMapById(pe.dido.svr.uidesign.model.UiAuthorMap)
	 */
	public void insertUiAuthorMapById(UiAuthorMap uiAuthorMap);

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiAuthorMapMapper#insertUiAuthorMapList(java.util.List)
	 */
	public void insertUiAuthorMapList(List<UiAuthorMap> insertList);

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiAuthorMapMapper#updateUiAuthorMapById(pe.dido.svr.uidesign.model.UiAuthorMap)
	 */
	public void updateUiAuthorMapById(UiAuthorMap uiAuthorMap);

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiAuthorMapMapper#updateUiAuthorMapList(java.util.List)
	 */
	public void updateUiAuthorMapList(List<UiAuthorMap> updateList);

}