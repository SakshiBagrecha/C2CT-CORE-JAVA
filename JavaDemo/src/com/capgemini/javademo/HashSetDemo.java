package com.capgemini.javademo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		
		Set<String> obj2=new HashSet<>();
	
		obj2.add("Yogita");
		obj2.add("Sharvari");
		obj2.add("Govind");
		obj2.add("Rekha");
		obj2.add("Samiksha");
		obj2.add(null);
		
		Set<String> obj1=new HashSet<>();
		
		obj1.add("Yogita");
		obj1.add("Sharvari");
		obj1.add("Govind");
		obj1.add("Rekha");
		
		obj1.add(null);
		Set<String> obj=new HashSet<>();
		
		obj.add("Yogita");
		obj.add("Sharvari");
		obj.add("Govind");
		obj.add("Rekha");
		obj.add("Samiksha");
		obj.add(null);
		System.out.println(obj.size());
		System.out.println(obj.contains("Nayna"));
		System.out.println(obj.getClass());
		System.out.println(obj.isEmpty());
		System.out.println(obj.equals(obj1));


		System.out.println(obj);

	}

}