// using exception handle
import java.util.*;

class ExceptionHandle1{
	public static void main(String arg[]){
     Scanner s = new Scanner(System.in);
       String a=null;
     try
     {
     System.out.println(a.length());
     }
     catch(NullPointerException e){
     	System.out.println("enter" + e);

     }

	}
}