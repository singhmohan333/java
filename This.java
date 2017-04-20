class This{


   public static void main(String arg[])
	{
	This2 obj = new This2(10,15);
	obj.display();
		
	}


}


class This2{
	int a;
	int b; 
     	This2(int a, int b)
        	{
	a=a;
	b=b;
	}

	void display()
	{
	System.out.println(a);
	System.out.println(b);
	}
}