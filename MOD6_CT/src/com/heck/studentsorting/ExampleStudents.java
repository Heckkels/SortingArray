package com.heck.studentsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class ExampleStudents extends Student{

	public static void main(String[] args) {
		
		ArrayList<Student> rollCall = new ArrayList<Student>();
		
		rollCall.add(new Student(101, "Fred Andrews: ", "219 Clarks Hwy"));
		rollCall.add(new Student(102, "F.P. Jones: ", "827 Golden Arches Prkwy"));
		rollCall.add(new Student(104, "Toni Topaz", "463 West Saxton Ave"));
		rollCall.add(new Student(106, "Hal Cooper", "399 Sycamore Crt"));
		rollCall.add(new Student(108, "Hiram Lodge", "7487 San Carlos Rd"));
		rollCall.add(new Student(105, "Betty Cooper", "118 Marconi Road"));
		rollCall.add(new Student(103, "Veronica Lodge", "8006 Blue Spring Drive"));
		rollCall.add(new Student(109, "Cheryl Blossom", "8486 Trout Ave"));
		rollCall.add(new Student(107, "Reggie Mantle", "566 University Street"));
		rollCall.add(new Student(110, "Kevin Keller", "7160 Hickory Street"));
		
		System.out.println("Unsorted");
		
		for(int i = 0; i < rollCall.size(); i++) {
			System.out.println(rollCall.get(i));
		}
		
		System.out.println();
		
		Collections.sort(rollCall, new SortByName());
		
		System.out.println("Sorted By Name");
		
		for (int i = 0; i < rollCall.size(); i++) {
			System.out.println(rollCall.get(i));
		}
		
		System.out.println();
		
		Collections.sort(rollCall, new SortByRollno());
		
		System.out.println("Sorted by Roll Number");
		
		for (int i = 0; i <rollCall.size(); i++) {
			System.out.println(rollCall.get(i));
		}
		
		System.out.println();
		
		System.out.println("Selection Sort Example");
	}

}
