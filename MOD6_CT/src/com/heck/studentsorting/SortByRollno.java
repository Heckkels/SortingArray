package com.heck.studentsorting;

import java.util.Comparator;

public class SortByRollno implements Comparator<Student>{

	public int compare(Student a, Student b) {
		
		return a.rollno - b.rollno;
	}
}
