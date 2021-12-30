package com.clone.sns.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.sns.model.dao.MemberDao;
import com.clone.sns.model.request.MemberRegistRequest;
import com.clone.sns.model.service.LoginService;
import com.clone.sns.model.service.MemberRegistService;
import com.clone.sns.model.vo.Member;

@Service("memberRegistService")
public class MemberRegistServiceImpl implements MemberRegistService {
	@Autowired
	private MemberDao memberDao;
	@Override
	public int insertMember(MemberRegistRequest memberRegistRequest) throws Exception{
		int cnt=memberDao.insertMember(memberRegistRequest);
		if(cnt==0) {
			throw new Exception();
		}
		return cnt;
	}
	

}
