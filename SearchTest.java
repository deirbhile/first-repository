/**
Name: SearchTest
Descrpiton:
Date: 27/02/18
Written by: Deirbhile Tuohy
*/
public class SearchTest{
 public static void main (String[] args){
  Scanner input = new Scanner(System.in);
       System.out.print("Please enter a search value: ");
       String searchStr = input.nextLine();
       int match = 0;
  
       System.out.println();
       for(int i = 0; i < dataSet.length; i++){
  	   for(int j = 0; j < dataSet[i].length; j++){
  		 for (int k = 0; k < dataSet[j].length; k++){
  			for (int l = 0; l < dataSet[k].length; l++){
  				for (int m = 0; m < dataSet[l].length; m++){
  				 for (int n = 0; n < dataSet[m].length; n++){
  
          if(searchStr.equals(dataSet[i][n])){
           match++;
           if(match == 1)
           {
           System.out.println("Name: "+dataSet[i][0]);
           System.out.println("Job: "+dataSet[i][1]);
           System.out.println("City: "+dataSet[i][2]);
           System.out.println("Zipcode: "+dataSet[i][3]);
           System.out.println("Start Date: "+dataSet[i][4]);
           System.out.println("Salary: "+dataSet[i][5]);
  
  	 }
  	 }
       }
       }
       }
       }
       }
  }
    System.out.println();
       System.out.println("Records with match: "+match);
  
  
  
     }
  }
