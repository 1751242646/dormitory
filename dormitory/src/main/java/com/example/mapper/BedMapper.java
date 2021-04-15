package com.example.mapper;

import java.util.List;
import java.util.Map;

import com.example.entity.Bed;

public interface BedMapper {

	public int create(Bed bed);

	public int delete(Integer id);

	public int update(Bed bed);

	public int updateSelective(Bed bed);

	public List<Bed> query(Bed bed);

	public Bed detail(Integer id);

	public int count(Bed bed);

	public int deleteByDormitoryId(Integer dormitoryId);

}