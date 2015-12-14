package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Users;
import com.test.repository.UsersRepositoty;

@Service
public class UsersService {

	@Autowired
	UsersRepositoty usersRepositoty;
	
	public Users findOne(int id){
		return usersRepositoty.findOne(id);
	}
	
	public List<Users> findAll(){
		return usersRepositoty.findAll();
	}
	
	public void saveUser(){
		
	}
	
}
