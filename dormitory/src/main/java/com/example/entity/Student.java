package com.example.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.example.utils.Entity;
import java.util.Date;


/**
 *
 * @author 1751242646@qq.com
 * @time 2021-03-26 23:13:26
 */
public class Student extends Entity{

	/**
	 *
	 */
	private Integer id;
	/**
	 *
	 */
	@Length(max = 0)
	private String stuNo;
	/**
	 *
	 */
	@Length(max = 0)
	private String name;
	/**
	 *
	 */
	@Length(max = 0)
	private String idcard;
	/**
	 *
	 */
	private Integer gradeId;
	/**
	 *
	 */
	private Integer sex;
	/**
	 *
	 */
	@Length(max = 0)
	private String phone;
	/**
	 *
	 */
	@Length(max = 0)
	private String password;
	/**
	 *
	 */
	private Integer clazzId;

	private Org org;

	private Grade grade;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getClazzId() {
		return clazzId;
	}
	public void setClazzId(Integer clazzId) {
		this.clazzId = clazzId;
	}
	public Org getOrg() {
		return org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
}