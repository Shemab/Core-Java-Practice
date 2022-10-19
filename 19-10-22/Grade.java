/*WAP to print the grade according to the percentage
@author:Shemab Alam
@date:19-10-2022*/

import java.util.*;

//declaring class
class Grade
{
	public static void main(String args[])
	{
		//creating an Object
		Scanner sc= new Scanner(System.in);
		float percentage;
		char grade;
		
		System.out.println("Enter the percentage:");
		percentage=sc.nextFloat();
		
		if(percentage>=85)
		 grade='A';
		else if(percentage>=70)
			grade='B';
		else if(percentage>=55)
			grade='C';
		else if(percentage>=40
			grade='D';
		else 
			grade='F';
		
		if(grade=='F')
			
		System.out.println("Sorry!! You are Fail:");
		else
			System.out.println("You are Pass");
	}
}

		
