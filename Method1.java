class Method1{
	public static void main(String arg[])
	{
	int a;
	Method1 obj = new Method1();
	obj.sum(22,2);

	obj.system(7,8);
	}

	void sum(int a, int b)
	{
	int c=a+b;
	System.out.println(c);
	}


	void system(int d, int e)
	{

		for(int i=1;i<=10;i++)
		System.out.println(i);

	}


}