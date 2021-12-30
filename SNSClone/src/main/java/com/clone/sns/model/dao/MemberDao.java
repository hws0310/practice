package com.clone.sns.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.clone.sns.model.request.MemberRegistRequest;
import com.clone.sns.model.vo.Member;

@Mapper
public interface MemberDao {
	Member selectMemberById(@Param("userId") String userId);
	
	int insertMember(@Param("memberRegistRequest") MemberRegistRequest memberRegistRequest);
}
