package com.JPA.StudentMangement.Service;

import com.JPA.StudentMangement.Entity.Student;
import com.JPA.StudentMangement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class StudentService {
     @Autowired
     StudentRepository studentRepository;

    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student added successfully!";
    }

    public Optional<Student> getStudent(int id) {
        return studentRepository.findById(id);
    }

    public String updateStudent(Student student, int id) {
        Optional<Student> oldStudent=studentRepository.findById(id);
        Student newStudent=oldStudent.get();
        newStudent.setCity(student.getCity());
        newStudent.setName(student.getName());
         studentRepository.saveAndFlush(newStudent);
        return "Student updated successfully!";
    }

    public String deleteStudent(int id) {
         studentRepository.deleteById(id);
        return "Student deleted successfully!";
    }
}
