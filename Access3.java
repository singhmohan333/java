class Access3{
public static void main(String arg[])
	{
	Variables obj = new Variables();
	Variables2 obj1 = new Variables2();
	System.out.println(obj1.a);
	System.out.println(obj.a);
	System.out.println(obj.b);
	obj.main(3);
	}
}
 class Variables{

	public char a='d';
	public int b=3;
	
	public void main(int s)
	{ System.out.println(s);}
}

private class Variables2{
		int a=14;
	}