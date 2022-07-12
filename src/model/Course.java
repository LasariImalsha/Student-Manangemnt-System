package model;

public class Course {
    private String id;
    private String CourseName;
    private double cost;
    private String duration;
    private String subId;

    public Course() {
    }

    public Course(String id, String courseName, double cost, String duration, String subId) {
        this.id = id;
        CourseName = courseName;
        this.cost = cost;
        this.duration = duration;
        this.subId = subId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", CourseName='" + CourseName + '\'' +
                ", cost=" + cost +
                ", duration='" + duration + '\'' +
                ", subId='" + subId + '\'' +
                '}';
    }
}
