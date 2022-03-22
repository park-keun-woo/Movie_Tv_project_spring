package com.group7.MovieApp.movie;

import java.util.ArrayList;

public interface IMovieDAO {
	ArrayList<MovieVO> likeListView(String userId); 		//전체 좋아요 목록
	void insertLikeList(MovieVO movieVO);	// 종아요 목록 등록

}
