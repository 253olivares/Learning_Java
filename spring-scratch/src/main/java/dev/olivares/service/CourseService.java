package dev.olivares.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.olivares.model.Course;
import dev.olivares.repository.CourseRepository;

@Service
public class CourseService implements CrudService<Course> {

    private CourseRepository repository;

    public CourseService(CourseRepository courseRepository) {
        this.repository = courseRepository;
    }

    @Override
    public List<Course> list() {
        // TODO Auto-generated method stub
        return this.repository.findAll();
    }

    @Override
    public Optional<Course> get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void update(Course t, int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
