package com.capgemini.javademo;


class Eclipseone implements Runnable{
	
	public void run()
	{
	    
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is" + Thread.currentThread().getId());
	}
}

public class MultiThread3 {
	
	public static void main(String[] args) {
		Eclipseone e=new Eclipseone();
		Thread t=new Thread(e);
		t.start();
	        
			System.out.println("Main Thread name is" + Thread.currentThread().getName());
			System.out.println("Main Thread ID is" + Thread.currentThread().getId());

		}
	}

