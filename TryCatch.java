/**
Name: Try Catch
Description:  try and catch block
Created on: 14/03/18
Created by: Deirbhile Tuohy
**/



public class TryCatch{
public static void main(String[] args){

int[] x = {7, 6, 11, 15, 19};

try{
System.out.println("The value stored in index 5 is: "+x[5]);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("There was an ArrayOutOfBoundsException");
}catch(Exception e){
System.out.println("Warning: Some other exception");
}

System.out.println("End of Program");
Index.main(null);

}

}