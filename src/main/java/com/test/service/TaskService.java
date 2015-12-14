package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Tasks;
import com.test.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository taskRepository;
	
	public Tasks findOne(int id){
		return taskRepository.findOne(id);
	}
	
	public List<Tasks> findAll(){
		return taskRepository.findAll();
	}
	
	public Tasks saveTask(Tasks task){
		return taskRepository.save(task);
	}
}
