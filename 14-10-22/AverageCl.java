 /* program to calculate the average using command line 
@author:Shemab Alam
@date=14 October 2022 */

//Declaring class

class AverageCl
{
	//start of main method
	public static void main(String args[])
	{
		float n1=Float.parseFloat(args[0]);
        float n2=Float.parseFloat(args[1]);
		float n3=Float.parseFloat(args[2]);
		
		//calculating average 
		
		float avg= n1+n2+n3/3;
		System.out.println("Average of Three Numbers is:" +avg);
	}
}