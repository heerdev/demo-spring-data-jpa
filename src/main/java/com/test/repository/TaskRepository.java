package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Tasks;

public interface TaskRepository extends JpaRepository<Tasks, Integer> {

}
