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
public class NoticeReceive extends Entity{

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private Integer noticeId;
	/**
	 * 
	 */
	private Integer buildingId;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}
	public Integer getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}
}