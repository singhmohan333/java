import java.util.*;
class ExceptionHandle12{
public static void main(String arg[]){
    System.out.println("here we use trows for exception handle");

    A obj = new A();
    obj.display();

 }	
}




class A{
	Scanner s = new Scanner(System.in);
	void display() throws InputMismatchException
	{
		int a;
		System.out.println("enter value  of a");
		a = s.nextInt();
	}
}