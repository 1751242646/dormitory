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
public class Bed extends Entity{

	/**
	 *
	 */
	private Integer id;
	/**
	 *
	 */
	@Length(max = 0)
	private String bno;
	/**
	 *
	 */
	private Integer dormitoryId;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public Integer getDormitoryId() {
		return dormitoryId;
	}
	public void setDormitoryId(Integer dormitoryId) {
		this.dormitoryId = dormitoryId;
	}
}