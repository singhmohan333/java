class WhileLoop7{
      public static void main(String arg[])
	{
	int i=1;
	
	System.out.println("using while loop");
	while(i<=5)
		{
		int j=1;
		while(j<=5-i+1)
		{
		System.out.print(j);
		j++;
		}
	    System.out.println(" ");
	i++;		
       }
	
	}
}
