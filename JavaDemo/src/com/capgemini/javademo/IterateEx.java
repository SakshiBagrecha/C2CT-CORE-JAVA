package com.capgemini.javademo;

import java.util.stream.Stream;

public class IterateEx {

 public static void main(String[] args) {
  
  Stream.iterate(1, element->element+1).filter(element->element%5==0).limit(3).forEach(System.out::println);

 }

}