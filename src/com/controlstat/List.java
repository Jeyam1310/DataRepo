package com.controlstat;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class List {
	
	public static void main(String[] args) {
		
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	al.add(10);
	al.add(20);
	
	Map<Long,Integer> m = new LinkedHashMap<Long,Integer>();
	
	Scanner sc = new Scanner(System.in);
	m.put((long)978846032, 1843);
	m.put((long)753889839, 1432);
	System.out.println(m);

	int i =0;
	String nextLine = sc.nextLine();
	System.out.println(nextLine);
	if (i<m.size()) {
		if(m.get(753889839) != null)
		{
			System.out.println("Pin is 1258");
		}
	} else {
		System.out.println("none");
	}
	}
}
