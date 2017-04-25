//exception handle

import java.util.*;

class ExceptionHandle2{
   public static void main(String arg[]){
    Scanner s = new Scanner(System.in);
     String a;
    System.out.println("Enter detail");
      a = s.nextLine();

      try{
         int i=Integer.parseInt(a);
         System.out.print(i);
      }
      catch(NumberFormatException e){
      	System.out.println(e);
      }
     }
   }