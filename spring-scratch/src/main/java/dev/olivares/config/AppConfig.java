package dev.olivares.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import dev.olivares.repository.CourseRepository;
import dev.olivares.service.CourseService;

@Configuration
@ComponentScan("dev.olivares")
public class AppConfig {

    // @Bean("courseRepository")
    // public CourseRepository getCourseRepository() {
    // return new CourseRepository();
    // }

    // // telling spring it will manage this instance of Course Service
    // @Bean("courseService")
    // public CourseService getCourseService() {
    // return new CourseService(getCourseRepository());
    // }
}
