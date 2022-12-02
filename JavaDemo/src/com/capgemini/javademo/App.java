package com.capgemini.javademo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


 class Dataa
 {
  private String name;

  public Dataa(String name) {
   this.name = name;
  }

  public String getName() {
   return name;
  }

  @Override
  public String toString() {
   return "Data [name=" + name + "]";
  }
  
  }

 public class App {

  public static void main(String[] args) {
   List<Dataa> list=new ArrayList<>();
   list.add(new Dataa("Sakshi"));
   list.add(new Dataa("Isha"));
   list.add(new Dataa("Radhika"));
   list.add(new Dataa("Rekha"));
   list.add(new Dataa("Sarvashri"));
   list.add(new Dataa("Divya"));

     
   
   Collections.sort(list,(Dataa o1,Dataa o2)->{return o1.getName().compareTo(o2.getName());});
   
   for (Dataa data:list)
   {
    System.out.println(data.getName());
   }
  }
 }