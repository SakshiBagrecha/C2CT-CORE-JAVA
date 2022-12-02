package com.capgemini.javademo;

import java.time.LocalTime; 
import java.time.Zoneld;

import java.time.temporal.ChronoUnit;

public class ZonalDemo {

public static void main(String[] args) {

// for(String i:Zoneld.getAvailableZonelds())

// { // System.out.println(i);

// }

	Zoneld zone1-Zoneld.of("Asia/Kolkata"); 
	LocalTime zone1time=LocalTime.now(zone1); 
	System.out.println(zone1time);

	
	Zoneld zone2=Zoneld.of("Asia/Tokyo"); 
	LocalTime zone2time= LocalTime.now(zone2);
	System.out.println(zone2time);
	
	
}
}
