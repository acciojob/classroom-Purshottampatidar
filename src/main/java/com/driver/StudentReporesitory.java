package com.driver;

import java.util.HashMap;

public class StudentReporesitory {

    HashMap<String,Student> studentDb=new HashMap<>();
    HashMap<String,Teacher> teacherDb=new HashMap<>();


    public void addStudent(Student student){
        studentDb.put(student.getName(),student);
    }

    public void addTeacher(Teacher teacher){
        teacherDb.put(teacher.getName(),teacher);
    }
}
