package com.group7.MovieApp.member;

import java.util.ArrayList;
import java.util.HashMap;


public interface IMemberDAO {
	MemberVO login(HashMap<String, Object> map);
	String idCheck(String userId);
	void join(MemberVO vo);


}
