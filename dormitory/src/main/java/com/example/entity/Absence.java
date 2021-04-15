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
public class Absence extends Entity{

	/**
	 *
	 */
	private Integer id;
	/**
	 *
	 */
	private Integer studentId;
	/**
	 *
	 */
	private Integer dormitoryId;
	/**
	 *
	 */
	private Date startTime;
	/**
	 *
	 */
	private Date endTime;
	/**
	 *
	 */
	@Length(max = 0)
	private String remark;

	private Student student;

	private Dormitory dormitory;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public Integer getDormitoryId() {
		return dormitoryId;
	}
	public void setDormitoryId(Integer dormitoryId) {
		this.dormitoryId = dormitoryId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Dormitory getDormitory() {
		return dormitory;
	}

	public void setDormitory(Dormitory dormitory) {
		this.dormitory = dormitory;
	}
}