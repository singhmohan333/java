class WhileLoop6{
	public static void main(String arg[])
	{
	int i=5;
	System.out.println(" Using loop for pattern");
	
	while(i>=1)
	{
	 	int j=5;
		while(j>=i)
		{
		System.out.print(j);
		j--;
		}
	System.out.println(" ");
	i--;
	}
	
    }
}