package com.example.first_work_project.repository;

import com.example.first_work_project.classes.KnowledgeBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KnowledgeBaseRepository extends JpaRepository<KnowledgeBase, Integer> {
}
