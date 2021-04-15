package com.example.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.example.utils.Entity;
import java.util.Date;
import java.util.List;


/**
 * 
 * @author 1751242646@qq.com
 * @time 2021-03-12 16:53:27
 */
public class Menu extends Entity{

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	@Length(max = 0)
	private String title;
	/**
	 * 
	 */
	@Length(max = 0)
	private String icon;
	/**
	 * 
	 */
	@Length(max = 0)
	private String href;
	/**
	 * 
	 */
	@Length(max = 0)
	private String target;
	/**
	 * 
	 */
	private Integer parentId;
	/**
	 * 0:管理员/宿管员;1:学生
	 */
	private Integer type;

	private List<Menu> child;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

	public List<Menu> getChild() {
		return child;
	}

	public void setChild(List<Menu> child) {
		this.child = child;
	}
}