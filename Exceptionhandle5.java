//exception handle

import java.util.*;

class ExceptionHandle5{
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);


	int x,y;

  System.out.println("enter value of x and y");
  x= s.nextInt();
  y= s.nextInt();
  try{

  float z = (float) x / (float) y;
}
catch(ArithmeticException e){
     System.out.println("ccatch my excepotion");

}
finally{
	System.out.println("I am always with u");
}

	}
}