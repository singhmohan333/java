class This3{


   public static void main(String arg[])
	{
	This4 obj = new This4(10,15);
	This4 obj1 = new This4(150,55);
	obj.display();
	obj1.display();
	}
}
class This4{
	int a;
	int b; 
     	This4(int a, int b)
        	{
	this.a=a;
	this.b=b;
	}

	void display()
	{
	System.out.println(a);
	System.out.println(b);
	this.init();	
	}
	void init()
	{
	System.out.println("hello");
	}
}