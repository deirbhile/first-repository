/**
Name: Enhanced For Java
Description: Creates and array of 5 integers
Created on: 20/03/18
Created by: Deirbhile Tuohy
**/

public class EnhancedFor{

  public static void main(String [] args){
	   int[] x = {7, 6, 11, 15, 19};
	   int total = 0;


     //assign values to the array
	  for(int i = 0; i < x.length; i++){
	     total += x[i];
}
	      System.out.println("Sum of array values is: "+total);


  }
}
