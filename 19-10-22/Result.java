/* Program to print pass or fail 
@author:Shemab Alam
@date:19-10-2022 */

import java.util.Scanner;
 
 class Result
 {
	 public static void main(String args[])
	 {
		 Scanner sc= new Scanner(System.in);
		 Float per;
		 System.out.println("Enter Marks 1:");
		 Float marks1=sc.nextFloat();
		 
		 System.out.println("Enter Marks 2:");
		 Float marks2=sc.nextFloat();
		 
		 System.out.println("Enter Marks 3:");
		 Float marks3=sc.nextFloat();
		 
		 per =(marks1+marks2+marks3/300)*100;
		 
		if(per>=40)
			System.out.println("Congratulation you are pass:");
		else
			System.out.println("You are fail");
	 }
 }
		 