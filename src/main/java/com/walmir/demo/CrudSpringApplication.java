package com.walmir.demo;

import com.walmir.demo.model.Course;
import com.walmir.demo.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
      @Bean
	  CommandLineRunner initDatabase(CourseRepository courseRepository){
		return  args -> {
            courseRepository.deleteAll();

			
			Course c = new Course();
			c.setName("Angular-com Spring");
			c.setCategory("Front-end");






			courseRepository.save(c);
		};

	  }

}
