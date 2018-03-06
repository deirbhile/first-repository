/**
Name: Return Methods
Description: Write a program that includes Method
Created by: Deirbhile Tuohy
Created on: 6/3/18
*/
    public class ReturnMethods{
 public static void main(String [] args){
	 ReturnMethods methods = new ReturnMethods();
	 System.out.println("Value returned: "+methods.method1());
	 Index.main(null);
 }

public int method1(){
  System.out.println("Method 1 here and I am calling method 2");
  return method2();
  } //end method

  public int method2(){
    System.out.println("Hi method 1, from method 2, I am calling method 3");
 return method3();
  //System.out.println("Method 3 says hello to you method 1.");
  } //end method

  public int method3(){
    System.out.println("Hi method 2, from method 3, tell method 1 I say hello.");
  return 5;
  } //end method
}

