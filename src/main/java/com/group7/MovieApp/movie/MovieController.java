package com.group7.MovieApp.movie;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*") // http://127.0.0.1 또는 localhost 다 사용하도록
@RestController
public class MovieController {
	
	@Autowired
	MovieService service;
	
	@RequestMapping(value="/movie/insertLikeList")
	public void insertLikeList(MovieVO movieVO) {
		service.insertLikeList(movieVO);
	}
	
	@RequestMapping("/movie/likeListView/{userId}")
	public HashMap<String, Object> likeListView(@PathVariable String userId) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("likeList", service.likeListView(userId));
		return map;
	}
	
	@RequestMapping(value="/movie/delete/{movieNo}")
	public void deleteLikeList(@PathVariable String movieNo) {
		service.deleteLikeList(movieNo);
	}
}
