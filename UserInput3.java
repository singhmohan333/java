//using user input for print print table of any number

import java.util.*;
class UserInput3{
public static void main(String arg[]){
    int a;
    int tab=0;
    int g; 
   Scanner n = new Scanner(System.in);
   
       
  System.out.println("Enter numbers you want print table ");
                  g= n.nextInt();  
 for(int i=1;i<=10;i++)
     { 
      tab=i*g; 
     System.out.println(g + " X "+ i + " = " + tab);       
  }                
     
 }
}