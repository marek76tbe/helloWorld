package be.abis.exercise.repository;

import be.abis.exercise.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MemoryCourseRepository implements CourseRepository {

    private List<Course> listOfCourses;

    public MemoryCourseRepository() {
        listOfCourses = new ArrayList<Course>();
        listOfCourses.add(new Course("1", "REST API 1", "REST API 1 - long description", 5, 501 ));
        listOfCourses.add(new Course("2", "REST API 2", "REST API 2 - long description", 6, 502 ));
        listOfCourses.add(new Course("3", "REST API 3", "REST API 3 - long description", 7, 503 ));
        listOfCourses.add(new Course("4", "REST API 4", "REST API 4 - long description", 6, 504 ));
        listOfCourses.add(new Course("5", "REST API 5", "REST API 5 - long description", 6, 505 ));
    }

    @Override
    public List<Course> findAllCourses() {
        return this.listOfCourses;
    }

    @Override
    public Course findCourseById(int id) {
        Course found = null;

        for (Course c: listOfCourses)
        {
              if (c.getCourseId().equals(String.valueOf(id)))
              {
                  found = c;
                  break;
              }
        }
        return found;
    }


    public Course findCourseByShortTitleOLD(String shortTitle) {
        Course toRet = null;

        for (Course c: listOfCourses)
        {
            if (c.getShortTitle().equals(shortTitle))
            {
                toRet = c;
                break;
            }
        }
        return toRet;
    }

    @Override
    public Course findCourseByShortTitle(String shortTitle){
        return listOfCourses.stream().filter(c -> c.getShortTitle().equalsIgnoreCase(shortTitle)).findFirst().orElse(null);
    }

    @Override
    public List<Course> findCoursesByDuration(int duration){
        return listOfCourses.stream().filter(c -> c.getNumberOfDays()==duration).collect(Collectors.toList());
    }

    @Override
    public void addCourse(Course c) {
        listOfCourses.add(c);
    }

    // Updates all occurences having the same courseId
    public void updateCourseAll(Course c) {
        for(Course cc: listOfCourses)
        {
            if (cc.getCourseId().equals(c.getCourseId()))
            {
                cc.setLongTitle(c.getLongTitle());
                cc.setShortTitle(c.getShortTitle());
                cc.setPricePerDay(c.getPricePerDay());
                cc.setNumberOfDays(c.getNumberOfDays());
            }
        }
    }

    @Override
    public void updateCourse(Course c) {
        Course cc = this.findCourseById(Integer.valueOf(c.getCourseId()));
        if (cc != null) {
            cc.setLongTitle(c.getLongTitle());
            cc.setShortTitle(c.getShortTitle());
            cc.setPricePerDay(c.getPricePerDay());
            cc.setNumberOfDays(c.getNumberOfDays());
        }
    }


    @Override
    public void deleteCourse(int id) {
        Course cc = this.findCourseById(id);
        if (cc != null) {
            listOfCourses.remove(cc);
        }
    }

    // Delete all occurences having the given id
    public void deleteCourseAll(int id) {
        int i = listOfCourses.size();
        while (i>0 && listOfCourses.size() > 0)
        {
            if (listOfCourses.get(i).getCourseId().equals(String.valueOf(id))) {
                listOfCourses.remove(i);
            }
            else {
                i--;
            }
        }
    }
}
