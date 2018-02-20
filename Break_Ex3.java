/**
Name: Addition

Description: Prompt user to enter numbers

Created by: Deirbhile Tuohy

Created on: 20/02/2018

*/

import java.util.Scanner;

public class Break_Ex3{
   public static void main(String [] args){
	   Scanner input = new Scanner(System.in);
	   int counter = 0;

	   System.out.println("See if you can guess the correct number");
	   System.out.println("Guess a number from 1 to 10");
	   System.out.println("You have 10 attempts");
	   System.out.println("Enter numbers (1 to 10 only) ");


	   while(input.hasNext()){
		   counter++;
		  if((input.nextInt() == 8)|| (counter == 10)){
		  System.out.println("Game Over");
		   break;
		  }


}
}
}
