package com.lile.mybatisExer.model;

import java.io.Serializable;

/**
 * 权限表
 */
public class SysPrivilege implements Serializable {
	private static final long serialVersionUID = 6315662516417216377L;
	/**
	 * 权限ID
	 */
	private Long id;
	/**
	 * 权限名称
	 */
	private String privilegeName;
	/**
	 * 权限URL
	 */
	private String privilegeUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public String getPrivilegeUrl() {
		return privilegeUrl;
	}

	public void setPrivilegeUrl(String privilegeUrl) {
		this.privilegeUrl = privilegeUrl;
	}

}
/*
由于Java 中的基本类型会有默认值，例如当某个类中存在private int age ；宇段时，
创建这个类时， age 会有默认值0 。当使用age 属性时，它总会有值。因此在某些情况下，
便无法实现使age 为口ull 。并且在动态SQL 的部分，如果使用age != null 进行判断，
结果总会为true ，因而会导致很多隐藏的问题。
所以，在实体类中不要使用基本类型。基本类型包括byte 、int , short 、long 、float 、
double 、char 、boolean 。
*/
