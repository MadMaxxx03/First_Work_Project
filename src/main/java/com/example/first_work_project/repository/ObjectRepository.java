package com.example.first_work_project.repository;

import com.example.first_work_project.classes.Object;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ObjectRepository extends JpaRepository<Object, Integer> {
}
