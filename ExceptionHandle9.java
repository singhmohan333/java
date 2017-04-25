//using exception handle


import java.util.*;

class ExceptionHandle9{
	public static void main(String arg[]){
   Scanner s = new Scanner(System.in);  
   int a;
   System.out.println("enter the value");
   try{
   a = s.nextInt();
   		}
   		catch(InputMismatchException e){
   			System.out.println("enter only integer value " +e );
   		}
   		finally{
   			for(int i=1;i<5;i++)
   			System.out.println("list item");

   		}
	}
}
