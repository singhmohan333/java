class This{


   public static void main(String arg[])
	{
	
	This2 obj = new This2(19,1);	
	obj.display();
	}


}


class This2{
	int a=3;
	int b=2; 
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