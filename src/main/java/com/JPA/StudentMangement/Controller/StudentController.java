package com.JPA.StudentMangement.Controller;

import com.JPA.StudentMangement.Entity.Student;
import com.JPA.StudentMangement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    //Create
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return  studentService.addStudent(student);
    }

    //Read
    @GetMapping("/getStudent/{id}")
    public Optional<Student> getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

    //Update
    @PutMapping("/updateStudent/{id}")
    public String updateStudent(@RequestBody Student student, @PathVariable("id") int id){
      return studentService.updateStudent(student,id);
    }

    //Delete
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }

}
