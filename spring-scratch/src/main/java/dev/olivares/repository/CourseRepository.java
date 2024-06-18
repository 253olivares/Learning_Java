package dev.olivares.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dev.olivares.model.Course;

@Repository
public class CourseRepository implements CrudRepository<Course> {

    @Override
    public List<Course> findAll() {
        // initiate our new array list
        List<Course> courses = new ArrayList<Course>();
        // create a starter course objects
        Course springBoot = new Course(
                1,
                "Getting started with spring boot!",
                "Learn how to build a spring boot application!",
                "https://www.google.com/");

        Course springBoot2 = new Course(2, "Second spring boot object!", "Second application", "chicken.com");

        // add to course list
        courses.add(springBoot);
        courses.add(springBoot2);

        return courses;
    }

}
