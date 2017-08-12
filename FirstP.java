import java.util.*;
import java.io.IOException;



class FirstP{
 
	public static void main(String arg[])
	{

		   int a=0;
 Scanner s = new Scanner(System.in) ;
 



System.out.print("enter data");
 try{  
a = s.nextInt();

}catch(InputMismatchException e){

	System.out.println("Enter only numbers ");

}

System.out.print("number is " + a);



	}


}