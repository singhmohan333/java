class NestedIf{
	public static void main(String arg[])
	{	
	int a=25;
	int b=25;
	int c=25;
	if(a>b)
	{
		if(a>c)
			{System.out.println("a is greater than c");}
			
			else if(b>c) {System.out.println("the b is greater than c");}		
			else { System.out.println(" the c is greater");}
	}
	else if(a==b)
		
	{ if((a==b)||(a==c))
		System.out.println("b is greater");	}

	}
	}