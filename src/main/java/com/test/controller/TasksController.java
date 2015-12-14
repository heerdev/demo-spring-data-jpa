package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Tasks;
import com.test.service.TaskService;
@RestController
@RequestMapping("task")
public class TasksController {
	@Autowired
	TaskService taskService;
	
	@RequestMapping("/all")
	public List<Tasks> getAllTasks(){
		return taskService.findAll();
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Tasks createTask(@RequestBody Tasks task){
			return taskService.saveTask(task);
	}
}
