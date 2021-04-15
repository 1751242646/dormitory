package com.example.mapper;

import java.util.List;
import java.util.Map;

import com.example.entity.Menu;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {

//	public int create(Menu menu);
//
//	public int delete(Integer id);
//
//	public int update(Menu menu);
//
//	public int updateSelective(Menu menu);
//
//	public List<Menu> query(Menu menu);
//
//	public Menu detail(Integer id);
//
//	public int count(Menu menu);
//
//	public List<Menu> queryId(Integer userId);
//
//	public List<Menu> list();
//
//	public int createUserMenu(@Param("userId") Integer userId, @Param("menuId") Integer menuId);
//
//	public int deleteUserMenu(@Param("userId") Integer userId);
//
//	public List<Integer> queryCheckMenuId(Integer userId);




	public List<Menu> query(Integer userId);

	public List<Menu> queryByType();

	public List<Menu> list();

	public int createUserMenu(@Param("userId") Integer userId,@Param("menuId") Integer menuId);

	public int deleteUserMenu(@Param("userId") Integer userId);

	public List<Integer> queryCheckMenuId(Integer userId);








}