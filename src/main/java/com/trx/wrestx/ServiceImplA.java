package com.trx.wrestx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class ServiceImplA {

	@Autowired
	private TaskExecutor asyncTaskExecutor2;

	// @PostConstruct
	public void exec() {
		for (int i = 0; i < 5; i++) {
			this.asyncTaskExecutor2.execute(new Task1(i));
		}
	}

}