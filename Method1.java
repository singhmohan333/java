class Method1{
public static void main(String arg[])
	{
	int a=12, b=33;
	Method1 call = new Method1();
	call.multi(a,b);
	call.multi(3,2); 
	}
	void multi(int x, int y)
	{
	float p;
	p=x*y;
	//System.out.println("jj");
	System.out.println(p);
	}

}