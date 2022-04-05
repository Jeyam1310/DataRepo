package com.controlstat;

public class Patternex {

public static void main(String[] args) 

{
for(int row=1; row<=4 ; row++)
    {
	for (int c0 = 3; c0 <row; c0++) 
	 {
	 System.out.print("7");	
	 }
      for(int c1=3; c1>=row; c1--)
       {
         System.out.print(" ");
       }
        for(int c2=2; c2<=row; c2++)
        {
         System.out.print("7");
         }
         for(int c3=1; c3<=row; c3++)
          {
         System.out.print("7");
          }
          for(int c4=3; c4>=row; c4--)
           {
         System.out.print(" ");
           }
      System.out.println();
     }
}
                  }
