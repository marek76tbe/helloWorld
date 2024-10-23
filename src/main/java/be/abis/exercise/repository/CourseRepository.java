package be.abis.exercise.repository;

import be.abis.exercise.model.Course;

import java.util.List;

public interface CourseRepository {

    List<Course> findAllCourses();

    Course findCourseById(int id);

    Course findCourseByShortTitle(String shortTitle);

    public List<Course> findCoursesByDuration(int duration);

    void updateCourse(Course c);

    void addCourse(Course c);

    void deleteCourse(int id);

}
