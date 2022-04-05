package com.controlstat;

public class Study {
	

	public static void main(String[] args) {
		
		
		String s ="Hi all welcome to my home";
		System.out.println(s);
		
		
		
		int i =0;
		int count=0;
		
	  while (i<s.length()) {
			char ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				count++;
				i++;
			
		}
		System.out.println(count++);
		
		
	
		
	}
	
}		