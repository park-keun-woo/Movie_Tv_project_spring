package com.group7.MovieApp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.group7.MovieApp.movie.IMovieDAO;
import com.group7.MovieApp.movie.MovieController;



@SpringBootApplication

@ComponentScan(basePackageClasses = MainController.class)
@ComponentScan(basePackageClasses = ReactController.class)
@ComponentScan(basePackageClasses = MovieController.class)
@MapperScan(basePackageClasses = IMovieDAO.class)
public class MovieAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieAppApplication.class, args);
	}

}
