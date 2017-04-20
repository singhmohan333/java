//using user input for switch cases sum multiple division subtraction

import java.util.*;
class UserInput4{
public static void main(String arg[]){
    int a, b;
    int sum=0;
    int ch; 
 Scanner n = new Scanner(System.in);
 System.out.println("Enter 1 for sum");
 System.out.println("Enter 2 for Subtract");
 System.out.println("Enter 3 for Multiplication");
 System.out.println("Enter 4 for division");
 ch = n.nextInt();

switch(ch) {
case 1:
   System.out.println("Enter two numbers to sum");
      a=n.nextInt();
      b=n.nextInt();
    sum=a+b;
   System.out.println("The sum of number is " + sum );
           
break;
case 2:
 System.out.println("Enter two numbers to subtraction");
      a=n.nextInt();
      b=n.nextInt();
sum=a-b;
   System.out.println("The subtraction of number is " + sum );
break;
case 3:
 System.out.println("Enter two numbers to multiple");
      a=n.nextInt();
      b=n.nextInt();
sum=a*b;
   System.out.println("The multiple of number is " + sum );
break;
case 4:
 System.out.println("Enter two numbers to division");
      a=n.nextInt();
      b=n.nextInt();
sum=a/b;
   System.out.println("The division of number is " + sum );
break;
default:
System.out.println("Enter wrong choice");
   }   
 }
}             
     
 
