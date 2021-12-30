package com.clone.sns.model.vo;

import java.util.Date;

public class Vip extends Member {

	
	public Vip(String userId, String name, String userName, String password, Date createTime, Integer follower,
			Integer following) {
		super(userId, name, userName, password, createTime, follower, following);
	}
	
	 
}
