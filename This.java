class This1{
	
	This1()
	{
	System.out.println("hello ");

	}
	
	This1(int a){
		this();
	System.out.println("how");

	}

    This1(int a,int b)
	{
		this(a);
	System.out.println("are ");

	}
	
     This1(int a, int b, int c){
		this(a,b);
	System.out.println("you");

	}
}

class This
{	public static void main(String arg[]){
		This1 obj = new This1(11,11,22);
	}
}
