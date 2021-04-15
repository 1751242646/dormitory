package com.example.mapper;

import java.util.List;
import java.util.Map;

import com.example.entity.Selection;

public interface SelectionMapper {

	public int create(Selection selection);

	public int delete(Integer id);

	public int update(Selection selection);

	public int updateSelective(Selection selection);

	public List<Selection> query(Selection selection);

	public Selection detail(Integer id);

	public int count(Selection selection);

	public List<Selection> queryByClazzId(Integer clazzId);

}