package com.clone.sns.model.service;

import org.apache.ibatis.annotations.Param;

import com.clone.sns.model.vo.Member;

public interface LoginService {
	Member selectMemberById(String userId, String password) throws Exception;
	
}
