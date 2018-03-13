/**
Name: Arithematic
Description:
Created on: 13/03/18
Created by: Deirbhile Tuohy
**/

public class Arithematic{

	public static void main(String [] args){
    Arithematic a = new Arithematic();
    System.out.println("2 + 3 = "+a.addNumbers(2,3));
    System.out.println("2 + 3 + 5 ="+a.addNumbers(2,3,5));
    Index.main(null);
}
   public int addNumbers(int x, int y){
	   return x + y;

   }
   public int addNumbers(int x, int y, int z){
	   return x + y + z;
   }


}
