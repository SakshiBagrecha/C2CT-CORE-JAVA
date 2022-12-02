package com.capgemini.javademo;

interface Lambda 
{
 public void Demo();
	
}

public class Demo {

 public static void main(String[] args) {
  Lambda obj=()->
  {System.out.println("I am from Akola Batch");
  System.out.println("I am from Akola Batch");
  System.out.println("I am from Akola Batch");
  System.out.println("I am from Akola Batch");
  };
  obj.Demo();
}
}