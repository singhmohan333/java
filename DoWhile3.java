class DoWhile3{
   public static void main(String arg[])
	{
	int i=1;
	do
	{
		
		int j=1;
		System.out.print(" + ");
		do {
		 System.out.print("*");     
  		j++; 
		
		}
		while(j<=5-i+1);
	System.out.print(" + ");
	System.out.println("  ");
	i++;
	}
 	while(i<=5);
 }
} 