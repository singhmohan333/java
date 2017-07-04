import java.util.*;

class Calculater{
	public static void main(String arg[])
	{
		int a, b, c ;


	Scanner s = new Scanner(System.in);

	System.out.println("enter two number");
	a= s.nextInt();
	b= s.nextInt();
	System.out.println("enter 1 for sum");
	System.out.println("enter 2 for subtraction");
	System.out.println("enter 3 for multiply");
	System.out.println("enter 4 for division");
	c = s.nextInt();

	switch (c)
		{
		case 1 :
		   int d = a+b;
		System.out.println(d);
		break;

		case 2 :
			int e=a-b;
		System.out.println(e);
		break;

		case 3 :
		   int f=a*b;
		System.out.println(f);
		break;

		case 4 :
		int g=a/b;
		System.out.println(g);
		break;

		default : System.out.println("you enter wrong choice");
	}

	

	}
}