package com.example.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.example.utils.Entity;
import java.util.Date;


/**
 * 
 * @author 1751242646@qq.com
 * @time 2021-03-12 16:53:27
 */
public class SelectionDormitory extends Entity{

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private Integer dormitoryId;
	/**
	 * 
	 */
	private Integer clazzId;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDormitoryId() {
		return dormitoryId;
	}
	public void setDormitoryId(Integer dormitoryId) {
		this.dormitoryId = dormitoryId;
	}
	public Integer getClazzId() {
		return clazzId;
	}
	public void setClazzId(Integer clazzId) {
		this.clazzId = clazzId;
	}
}