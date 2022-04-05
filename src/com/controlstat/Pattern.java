package com.controlstat;

public class Pattern 
{
	public static void main(String[] args) 
	{
	
	//int row=1;
	//for (int col=1; col<=row; col++) 
		//{
		//System.out.print(row);	
		//}
	//System.out.println();
	
	//int row1=2;
	//for (int col =0; col <=row; col++) 
		//{
		//System.out.print(row1);
		//}
	//System.out.println();
	
	//int row2=3;
	//for (int col = 0; col<=row2; col++) 
		//{
		//System.out.print(row2);
		//}
	//System.out.println("pattern");
		for (int row = 3; row >=1; row--) 
		{
		for (int col = 3; col >=row; col--) 
			{ 
			System.out.print(row);
			}
			System.out.println();
		}
		
	}
	
}
