package com.group7.MovieApp.movie;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class MovieService implements IMovieService {
	
	@Autowired
	@Qualifier("IMovieDAO")
	IMovieDAO dao;

	@Override
	public ArrayList <MovieVO> likeListView(String userId) {
		return dao.likeListView(userId);
	}

	@Override
	public void insertLikeList(MovieVO movieVO) {
		dao.insertLikeList(movieVO);
	}

}
