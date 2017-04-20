class ThisMethod2{
    public static void main(String arg[])
	{
	Usee obj = new Usee();
	Usee obj2 = new Usee(11);
	Usee obj3 = new Usee(2,34);
	Usee obj4 = new Usee(1,2,3);	

	}
}
class Usee{

	Usee()
	{	
	System.out.println("welcome to data");
	}
	Usee(int a)
	{
	this();
	System.out.println(a);
	}
	Usee(int a, int b)
	{
	this();
	System.out.println(b);
	}
	Usee(int a, int b, int c)
	{
	this();
	System.out.println(c);
	}
}