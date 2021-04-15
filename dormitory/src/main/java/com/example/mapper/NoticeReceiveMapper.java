package com.example.mapper;

import java.util.List;
import java.util.Map;

import com.example.entity.NoticeReceive;

public interface NoticeReceiveMapper {

	public int create(NoticeReceive noticeReceive);

	public int delete(Integer id);

	public int update(NoticeReceive noticeReceive);

	public int updateSelective(NoticeReceive noticeReceive);

	public List<NoticeReceive> query(NoticeReceive noticeReceive);

	public NoticeReceive detail(Integer id);

	public int count(NoticeReceive noticeReceive);

	public int deleteByNoticeId(Integer noticeId);

}