package com.trx.wrestx;

//import org.springframework.stereotype.Component;

//@Component
public class Task1 implements Runnable {
	
	public Task1(int taskId) {
		this.taskId = taskId;
	}

	private int taskId;
	
    @Override
    public void run() {

    	System.out.println(Thread.currentThread().getName() + " running: " + this.toString());
    	
    	try {
    		System.out.println("Started task " +  taskId);
			Thread.sleep(5000);
			System.out.println("Completed task " +  taskId);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
}