package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.utility.MyUtility;

public class CourseTest {

    public static void main(String[] args) {
        Course c = new Course("1","REST API","REST API - long description",5,500);
        System.out.println("The " + c.getShortTitle() + " takes " + c.getNumberOfDays() + " days and costs " + c.getPricePerDay() + " EUR per day.");
        System.out.println(c);

        System.out.println("Testing MyUtility static method:");
        MyUtility.printCourse(c);
    }

}
