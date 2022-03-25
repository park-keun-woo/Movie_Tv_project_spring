package com.group7.MovieApp.member;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("*") // http://127.0.0.1 또는 localhost 다 사용하도록
@RestController
public class MemberController {
	
	@Autowired 
	MemberService service;	
	
	String sessionId= "";
	
	//회원가입 
	@RequestMapping(value="/join")
	public String join(MemberVO vo) {
		service.join(vo);	
		
		String result = "gogo";
		return result;
	}
	
	
	//아이디 중복체크  
	@RequestMapping("/idCheck/{userId}")
	public String idCheck(@PathVariable String userId) {
		// 서비스 호출 -> DAO -> Mapper -> userId가 존재하면 userId 반환
		String userId_result = service.idCheck(userId);

		String result = "use";
		
		if (userId_result != null) // prdNo_result가 받은 값이 있으면 (널이 아니면)
			result = "no_use";
		
		return result;
	}

////	//로그인 
//	@RequestMapping(value="/login")
//	public String login(MemberVO vo) {		
//		service.login(vo);
//		
//		String result = "fail";
//		if(vo != null) {
//			result = "success";
//		}
//		System.out.println(result);
//		return result;
//	}

	@RequestMapping(value="/login")
	public String login(@RequestParam HashMap<String, Object> param, MemberVO vo) {	
		
		MemberVO resultvo = service.login(param);
//		System.out.println(param.get("userId"));
//		System.out.println(param.get("userPwd"));
		
		
		String result = "";
		
		if(resultvo != null) {
			result = "success";
		}else {
			result = "fail";
		}
		System.out.println(result);
		return result;
		}
	
	



	// 로그아웃
	@RequestMapping(value="/logout")
	public void logout(HttpSession session) {
		session.invalidate();
	}
	

}
