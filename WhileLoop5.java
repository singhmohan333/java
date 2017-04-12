class WhileLoop5{
	public static void main(String arg[])
	{
	int i=1;
	
	System.out.println("Using While loop printing patterns ");
		
	while(i<=5)
	   {
	      int j=1;
		while(j<=i)
		{
		System.out.print(j);
		j++;
		}  
		
	  System.out.println(" ");
	    i++;
	   }
      }
}