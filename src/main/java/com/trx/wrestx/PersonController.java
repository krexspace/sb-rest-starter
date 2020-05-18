package com.trx.wrestx;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private ServiceImplA service1;
		
	@RequestMapping("persons")
	public List<Person>getAliens() {
		List<Person> aliens  = new ArrayList<>();
		Person a1 = new Person();
		a1.setName("a1");
		aliens.add(a1);
		Person a2 = new Person();
		a2.setName("a1");
		aliens.add(a2);
		Person a3 = new Person();
		a3.setName("a1");
		aliens.add(a3);
		
		return aliens;
	}
	
	@RequestMapping("taskCall")
	public List<Person>taskCall() {
		List<Person> aliens  = new ArrayList<>();
		Person a1 = new Person();
		a1.setName("a1");
		aliens.add(a1);
		Person a2 = new Person();
		a2.setName("a1");
		aliens.add(a2);
		Person a3 = new Person();
		a3.setName("a1");
		aliens.add(a3);
		
		service1.exec();
		
		return aliens;
	}
}
