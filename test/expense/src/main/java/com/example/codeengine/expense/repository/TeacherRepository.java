package com.example.codeengine.expense.repository;

import com.example.codeengine.expense.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    Teacher findByName(String name);
}
