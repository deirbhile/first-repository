/**
Name: Continue
Descrpiton:
Date: 27/02/18
Written by: Deirbhile Tuohy
*/
import java.util.Scanner;

public class Continue{
 public static void main(String [] rags){
	 Scanner input = new Scanner(System.in);
	 int counter = 0;
     int x = 0;
  System.out.println("Enter a number from 1 and 10: ");
  x = input.nextInt();

  while(counter < 10){
	  counter++;
   if (x == counter) {
   continue;
   }
   System.out.println(counter);
}
}
}
