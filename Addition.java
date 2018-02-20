/**
Name: Addition

Description: Prompt user to enter numbers

Created by: Deirbhile Tuohy

Created on: 20/02/2018

*/

import java.util.Scanner;

public class Addition{
   public static void main(String [] args){
	   Scanner input = new Scanner(System.in);
	   int total = 0;

	   System.out.println("Enter numbers (ctrl-z to terminate)");

	   while(input.hasNext()){
		   total += input.nextInt();

	   }
	   System.out.println("Total is: "+total);

   }
}
