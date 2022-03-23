package com.group7.MovieApp.member;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService implements IMemberService {
	@Autowired
	@Qualifier("IMemberDAO")
	IMemberDAO dao;


	@Override
	public MemberVO login(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.login(map);
	}

	@Override
	public String idCheck(String userId) {
		return dao.idCheck(userId);
		
	}

	@Override
	public void join(MemberVO vo) {
		dao.join(vo);

	}
}


