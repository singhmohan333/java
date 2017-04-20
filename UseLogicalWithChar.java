class UseLogicalWithChar{
		
	public static void main(String arg[])
	{
	char m='a';
	char n='b';
	char o='a';
	
	System.out.println("m =" + m);
	System.out.println("n = " + n);
	System.out.println("o = " + o);
	System.out.println("m==n " + (m==o));
	System.out.println((m<n)||(m<o));
	System.out.println((m<n)&&(m<o));
	System.out.println(m>n);
	

	}
	}