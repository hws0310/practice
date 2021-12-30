package com.clone.sns.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.clone.sns.model.dao.MemberDao;
import com.clone.sns.model.service.LoginService;
import com.clone.sns.model.vo.Member;

public class LoginServiceImpl implements LoginService {
	@Autowired
	MemberDao memberDao;
	
	@Override
	public Member selectMemberById(String userId, String password) throws Exception {
		Member member=memberDao.selectMemberById(userId);
		
		if(member==null) {
			throw new Exception();
		}
		if(!(password==member.getPassword())) {
			throw new Exception();
		}
		return member;
	}
}
