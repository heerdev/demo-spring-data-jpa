package com.test.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Customer;
import com.test.entity.Tasks;
import com.test.repository.CustomerRepository;
import com.test.repository.TaskRepository;

@Service
public class InitDbService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private TaskRepository taskRepository;

	@PostConstruct
	public void init() {
		{
			Customer customer = new Customer();
			customer.setName("John");
			customerRepository.save(customer);
		}
		{
			Customer customer = new Customer();
			customer.setName("Tom");
			customerRepository.save(customer);
		}
		
		{
			Tasks tasks = new Tasks();
			tasks.setTaskName("Java spring boot");
			tasks.setDescription("Awesome application in java angularjs");
			taskRepository.save(tasks);
		}
	}
}
