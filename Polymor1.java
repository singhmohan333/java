class Polymor1{
	void total()
	{
	System.out.println("the simple method overloading");
	}
	void total(int a)
	{
	System.out.println("the value of a is " +a);
	}
	
	void total(int a, int b)
	{
	System.out.println(a+b);
	}
    public static void main(String arg[])
	{
	
	Polymor1 obj = new Polymor1();
	obj.total();
	obj.total(1);
	obj.total(54,44);
	
	}
	
	


}