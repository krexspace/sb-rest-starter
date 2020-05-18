package com.trx.wrestx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class SingletonBeanWithThreadsConfiguration {
	
    @Bean
    public TaskExecutor threadPoolTaskExecutor() {
    	// Ref: https://docs.spring.io/autorepo/docs/spring-framework/4.2.x/spring-framework-reference/html/scheduling.html
    	TaskExecutor executor = new SimpleAsyncTaskExecutor();
        return executor;
    }
}