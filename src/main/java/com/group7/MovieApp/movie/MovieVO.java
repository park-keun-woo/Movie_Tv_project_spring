package com.group7.MovieApp.movie;

public class MovieVO {
	private String userId; 
	private String movieId; 
	private String movieTitle; 
	private String movieRuntime; 
	private String moviePost;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getMovieRuntime() {
		return movieRuntime;
	}
	public void setMovieRuntime(String movieRuntime) {
		this.movieRuntime = movieRuntime;
	}
	public String getMoviePost() {
		return moviePost;
	}
	public void setMoviePost(String moviePost) {
		this.moviePost = moviePost;
	}
	
	@Override
	public String toString() {
		return "MovieVO [userId=" + userId + ", movieId=" + movieId + ", movieTitle=" + movieTitle + ", movieRuntime="
				+ movieRuntime + ", moviePost=" + moviePost + "]";
	} 
	
	
	
}
