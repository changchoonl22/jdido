package pe.dido.svr.uidesign.model;

import java.io.Serializable;

public class UiMenuPkg implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ui_menu_pkg
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ui_menu_pkg.MENU_CODE
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String menuCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ui_menu_pkg.MENU_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer menuId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ui_menu_pkg.MENU_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private String menuNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ui_menu_pkg.MOTHER_MENU_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	private Integer motherMenuId;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_menu_pkg
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		UiMenuPkg other = (UiMenuPkg) that;
		return (this.getMenuId() == null ? other.getMenuId() == null : this
				.getMenuId().equals(other.getMenuId()))
				&& (this.getMotherMenuId() == null ? other.getMotherMenuId() == null
						: this.getMotherMenuId()
								.equals(other.getMotherMenuId()))
				&& (this.getMenuNm() == null ? other.getMenuNm() == null : this
						.getMenuNm().equals(other.getMenuNm()))
				&& (this.getMenuCode() == null ? other.getMenuCode() == null
						: this.getMenuCode().equals(other.getMenuCode()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ui_menu_pkg.MENU_CODE
	 * @return  the value of ui_menu_pkg.MENU_CODE
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getMenuCode() {
		return menuCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ui_menu_pkg.MENU_ID
	 * @return  the value of ui_menu_pkg.MENU_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public Integer getMenuId() {
		return menuId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ui_menu_pkg.MENU_NM
	 * @return  the value of ui_menu_pkg.MENU_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public String getMenuNm() {
		return menuNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ui_menu_pkg.MOTHER_MENU_ID
	 * @return  the value of ui_menu_pkg.MOTHER_MENU_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public Integer getMotherMenuId() {
		return motherMenuId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_menu_pkg
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getMenuId() == null) ? 0 : getMenuId().hashCode());
		result = prime
				* result
				+ ((getMotherMenuId() == null) ? 0 : getMotherMenuId()
						.hashCode());
		result = prime * result
				+ ((getMenuNm() == null) ? 0 : getMenuNm().hashCode());
		result = prime * result
				+ ((getMenuCode() == null) ? 0 : getMenuCode().hashCode());
		return result;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ui_menu_pkg.MENU_CODE
	 * @param menuCode  the value for ui_menu_pkg.MENU_CODE
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ui_menu_pkg.MENU_ID
	 * @param menuId  the value for ui_menu_pkg.MENU_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ui_menu_pkg.MENU_NM
	 * @param menuNm  the value for ui_menu_pkg.MENU_NM
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ui_menu_pkg.MOTHER_MENU_ID
	 * @param motherMenuId  the value for ui_menu_pkg.MOTHER_MENU_ID
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	public void setMotherMenuId(Integer motherMenuId) {
		this.motherMenuId = motherMenuId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_menu_pkg
	 * @mbggenerated  Mon Aug 25 18:12:32 KST 2014
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", menuId=").append(menuId);
		sb.append(", motherMenuId=").append(motherMenuId);
		sb.append(", menuNm=").append(menuNm);
		sb.append(", menuCode=").append(menuCode);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}