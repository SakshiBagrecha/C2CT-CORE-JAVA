package com.capgemini.javademo;

interface Lambda1
{
 public void demo();
}

public class DemoDemo {

 public static void main(String[] args) {
  
   new Thread ( ()->{ System.out.println("This is my thread1 ..running");}).start();

}
}