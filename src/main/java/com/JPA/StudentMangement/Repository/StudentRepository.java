package com.JPA.StudentMangement.Repository;

import com.JPA.StudentMangement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
