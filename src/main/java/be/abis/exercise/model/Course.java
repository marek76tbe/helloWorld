package be.abis.exercise.model;

public class Course {

    private String courseId;
    private String shortTitle;
    private String longTitle;
    private int numberOfDays;
    private int pricePerDay;

    public Course() {
    }

    public Course(String courseId, String shortTitle, String longTitle, int numberOfDays, int pricePerDay) {
        this.courseId = courseId;
        this.shortTitle = shortTitle;
        this.longTitle = longTitle;
        this.numberOfDays = numberOfDays;
        this.pricePerDay = pricePerDay;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public String getLongTitle() {
        return longTitle;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "The " + shortTitle + " course takes " + numberOfDays + " day and costs " + pricePerDay + " per day.";
    }

    public String toFullString() {
        return "Course{" +
                "courseId=" + courseId +
                ", shortTitle='" + shortTitle + '\'' +
                ", longTitle='" + longTitle + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}

