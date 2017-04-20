class Constructor{

	Constructor()
	{
	System.out.println("no value ");
	}
	Constructor(int a)
	{
	System.out.println("the value of a " + a );
	}
	Constructor(int a, int b)
	{
	System.out.println("the value of a "+ a);
	System.out.println("the value of b "+ b);
	}

public static void main(String arg[])
	{
	Constructor obj = new Constructor();
	Constructor obj2 = new Constructor(1);
	Constructor obj3 = new Constructor(1,6);
	

	
	}
}