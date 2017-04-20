class Polymor2{
	void fun()
	{
	   System.out.println("System out all");
	}
	    void fun(int a)
	{
	    System.out.println(a);
	}
   	    public static void main(String arg[])
	{
	   Polymor2 obj = new Polymor2();
	   obj.fun(4);
	   obj.fun(4);
	   obj.fun();
	   obj.fun(4);
	}

	
}