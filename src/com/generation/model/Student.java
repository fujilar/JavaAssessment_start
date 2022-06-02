package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.*;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
    private List<Course> courses;
    private Map<Course, Double> grades;
    public Student( String id, String name, String email, Date birthDate )

    {
        super( id, name, email, birthDate );
        courses = new ArrayList<>();
    }

    public Map<Course, Double> getGrades () {
        return grades;
    }
    public void addGrades(Course course, double grade)
    {
        grades.put(course, grade);
    }
    public double returnGrades(String courseId) {

        for (Course c : courses) {
            if (c.getCode().equals(courseId)) {
                return grades.get(c);
            }
        }

        return -1.0;
    }

    public void enrollToCourse( Course course )
    {
        //TODO
        courses.add(course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
        for (Course c : courses) {
            if (c.getCode().equals(courseId)) {
                return c;
            }
        }
       return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        if (courses.size() >0) {
            return courses;
        }
        return null;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
