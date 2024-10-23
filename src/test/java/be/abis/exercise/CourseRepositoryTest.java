package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.repository.CourseRepository;
import be.abis.exercise.repository.MemoryCourseRepository;

public class CourseRepositoryTest {

    public static void main(String[] args) {
        CourseRepository mcr = new MemoryCourseRepository();
        System.out.println("There are " + mcr.findAllCourses().size() + " course in the list:");
        System.out.println(mcr.findAllCourses());
        System.out.println("There are " + mcr.findAllCourses().size() + " course in the list v.2 :");
        mcr.findAllCourses().forEach(System.out::println);

        test1id(mcr, 3);
        test1id(mcr, 8);

        Course cp = mcr.findAllCourses().stream().filter(p->p.getCourseId()=="1").findFirst().orElse(null);
        System.out.println("Course with id = 1  is " + cp);
        //Course cp = mcr.findAllCourses().stream().filter(p->p.getCourseId()=="1").findFirst().orElseThrow(()->new CourseNotFoundException("Not found"));

        System.out.println("Courses by a duration of 6 days:");
        mcr.findCoursesByDuration(6).forEach(System.out::println);
    }

    private static void test1id(CourseRepository mcr, int idToTest)
    {
        Course c = mcr.findCourseById(idToTest);
        System.out.println("Course with id = " + idToTest + " is ");
        System.out.println(c);
    }
}
