class Sum{
 	int a=10;
	int b=22;
	void sum(int a , int b)
	{
	System.out.println(a + b);
	}
}

class Add{
	int a=5;
	int b=8;
	
}	
	
	class Sub{
	void num()
	{
	for(int i=1;i<=5;i++)
	{
	System.out.println(i);	
	}
	}
	}

class Oops{
	public static void main(String arg[])
	{
	Sum obj = new Sum();
	Add bas = new Add();
	Sub foor = new Sub();
	System.out.println(obj.a);
	System.out.println(bas.a);
	obj.sum(0,4);
	System.out.print( "hello");
	foor.num();
	}
	} 