package com.example.first_work_project.repository;

import com.example.first_work_project.classes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
