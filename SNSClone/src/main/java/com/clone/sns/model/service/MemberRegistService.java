package com.clone.sns.model.service;

import com.clone.sns.model.request.MemberRegistRequest;

public interface MemberRegistService {
	int insertMember(MemberRegistRequest memberRegistRequest) throws Exception;
}
