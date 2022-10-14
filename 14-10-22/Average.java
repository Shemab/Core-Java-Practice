/* Program: Program to find average of three numbers
   @author=Shemab Alam
   @date=14th October 2022 
*/
//importing util package for Scanner class
import java.util.*;


//Declaring a class
class Average
{
   //start of main method
      public static void main(String args[])
	  {
		  //creating an object
		  Scanner sc=new Scanner(System.in);
		     
			 
		     int avg;
			 
			 //Enter first Number
		     System.out.println("Enter First Number");
		     int num1=sc.nextInt();
		    
			
			//Enter Second Number
			System.out.println("Enter Second Number");
			int num2=sc.nextInt();
			
		    //Enter Third Number;
			System.out.println("Enter Third Number");
			int num3=sc.nextInt();
			
			//Calculating the Average
			 avg= num1+num2+num3/3;
			 
			 //Printing the value 
			 System.out.println("Average of Three Number is :"+ avg);
	  }
	  //end of main method
	  
}
//end of class Average
			
			
	  