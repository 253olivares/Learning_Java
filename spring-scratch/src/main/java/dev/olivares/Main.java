package dev.olivares;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.olivares.config.AppConfig;
import dev.olivares.service.CourseService;

public class Main {
    public static void main(String[] args) {
        // testing purpose
        // System.out.println("Hello spring!");

        // should print out our hello spring

        // NOTE: We do no want to call our lists and objects like this normally
        // spring will manage this for us automatically
        // create an instance of our service which starts the course list
        // and creates our starter course within our constructor
        // CourseService service = new CourseService();

        // // print out our list that we have stored in our service
        // System.out.println(service.list());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CourseService service = applicationContext.getBean("courseService", CourseService.class);

        System.out.println(service.list());

    }
}
