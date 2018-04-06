import java.util.Scanner;

 public class Convert{
	 public static void main (String []args){
		 Scanner input = new Scanner(System.in);
		 int select;
		 int celsius;
		 int fahrenheit;

		 System.out.println("1. Fahrenheit to Celsius");
		 System.out.println("2. Celsius to Fahrenheit");
		 System.out.println("3. Exit");
		 System.out.print("Choice: ");
		 select = input.nextInt();

		 if(select < 3){
			 System.out.print("Enter temperature: ");
			 int temp = input.nextInt();

			 switch(select){
				 case 1:
				 System.out.printf("%d Fahrenheit is %d Celsius\n",temp * celsius(temp));
				 break;

				 case 2:
				 System.out.printf("%d Celsius is %d Fahrenheit\n",temp *fahrenheit(temp));
				 break;
	}
}
	while(select != 3);
	System.out.println("Incorrect number. Please try again");
}
  public static int fahrenheit(int celsiusTemp){
	 return((int) (9.0/5.0 * (celsiusTemp + 32)));
 }
 public static int celsius (int fahrenheitTemp){
	 return((int) (5.0/9.0 * (fahrenheitTemp - 32)));
	 Index.main(null);
}
 }




