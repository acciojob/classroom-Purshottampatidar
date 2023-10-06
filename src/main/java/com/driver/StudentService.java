package com.driver;

import org.mapstruct.AfterMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
     private StudentReporesitory reporesitoryObj;

    public void addStudent(Student student){
        reporesitoryObj.addStudent(student);
    }

    public void addTeacher(Teacher teacher){
        reporesitoryObj.addTeacher(teacher);
    }
}
