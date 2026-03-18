package com.semi.spring.member.model.dao;

import org.springframework.security.core.userdetails.UserDetails;

public interface MemberDao {

	UserDetails loadUserByUsername(String username);
}
