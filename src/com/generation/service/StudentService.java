package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        //TODO
        students.put( student.getId(), student);
    }

    public Student findStudent( String studentId )
    {
        //TODO
        if(students.containsKey(studentId))  {
            return students.get(studentId);
        }
        return null;
    }

    public boolean showSummary()
    {
        //TODO
        if (!students.isEmpty()){
            for (String id : students.keySet())
            {
                Student enrolledStudent = students.get(id);
                System.out.println(enrolledStudent);
                System.out.println("Enrolled Courses: ");

                if (enrolledStudent.getEnrolledCourses() !=null)
                {
                    for (Course c : enrolledStudent.getEnrolledCourses()) {

                        if (enrolledStudent.getGrades().containsKey(c)) {
                            System.out.println(c + " Grade: " + enrolledStudent.returnGrades(c.getCode()));
                        }
                        else {
                            System.out.println(c);
                        }
                    }
                }
                else {
                    System.out.println("No courses enrolled!");
                }
            }
            return true;

        }
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        Student enrolledStudent = students.get(studentId);

        if (enrolledStudent.findCourseById(course.getCode()) != null) {
            System.out.println("Course already registered.");
        }
        else {
            enrolledStudent.enrollToCourse(course);
        }
    }
}
