class SuperMethod{
	public static void main(String arg[])
	{
	System.out.println("using super in method");
	SuperM1 obj = new SuperM1();
	SuperM1 obj1 = new SuperM1(5);	
	}
SuperMethod()
	{
	System.out.println("hello ");
	}

}
class SuperM{
SuperM()
{
System.out.println("This is my super");
}	
SuperM(int a)
	{
	System.out.println(a);
	}
}

class SuperM1 extends SuperM{
SuperM1()
	{
	
	System.out.println("all program");
	 }

SuperM1(int a)
	{
	super(4);    	
	System.out.println("se hello");	
	}
}