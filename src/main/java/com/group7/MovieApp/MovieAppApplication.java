package com.group7.MovieApp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.multi.spring_boot_react.MainController;
import com.multi.spring_boot_react.product.IProductDAO;
import com.multi.spring_boot_react.product.ProductController;

@SpringBootApplication

@ComponentScan(basePackageClasses = MainController.class)
@ComponentScan(basePackageClasses = ReactController.class)
//@MapperScan(basePackageClasses = IProductDAO.class)
public class MovieAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieAppApplication.class, args);
	}

}
