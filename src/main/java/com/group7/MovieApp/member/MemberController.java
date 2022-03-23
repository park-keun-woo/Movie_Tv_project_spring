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
	
	//회원가입 
	@RequestMapping(value="/join")
	public void join(MemberVO vo) {
		service.join(vo);	
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

	//로그인 
	@RequestMapping(value="/login")
	public String loginCheck(@PathVariable HashMap<String, Object> param,
			@PathVariable String userId,
			@PathVariable String userPwd) {

        // 로그인 체크 결과
        MemberVO vo = service.login(param);
     
        String result = "success";
        System.out.println("userPwd : " + userPwd);
       System. out.println("vo : " + vo);
      
        if(vo != null ) {
   
            result = "success";
        }
        return result;
    
    }


	// 로그아웃
	@RequestMapping(value="/logout")
	public void logout(HttpSession session) {
		session.invalidate();
	}
	

}
