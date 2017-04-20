//using user input for print sum of numbers

import java.util.*;
class UserInput2{
public static void main(String arg[]){
    int a;
    int sum=0;
    int f; 
   Scanner n = new Scanner(System.in);
   
       
  System.out.println("enter how many numbers you want to sum");
                  f= n.nextInt();  


  System.out.println("enter numbers you want to sum");
 for(int i=0;i<f;i++)
     {  
                  a= n.nextInt(); 
           sum+=a;
  }                

   System.out.println("sum of numbers is " + sum );
     
 }
}