package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Users;

public interface UsersRepositoty extends JpaRepository<Users, Integer>{

}
