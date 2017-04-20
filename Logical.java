class Logical{

	public static void main(String arg[])
	{
	int a=12;
	int b=15;
	int c=9;
	

	
	System.out.println(" a = " + a);
	System.out.println(" b = " + b);
	System.out.println(" c = " + c);

	
		System.out.println("(a<b)&&(a<c) " + ((a<b)&&(a<c)));	
		System.out.println((b<c)&&(b<a));
		System.out.println((c<a)&&(c<b));	
		
		System.out.println((a>b)&&(a>c));	
		System.out.println((b>c)&&(b>a));
		System.out.println((c>a)&&(c>b));

		System.out.println("(a<b)||(a<c) " + ((a<b)||(a<c)));	
		System.out.println((b<c)||(b<a)) ;
		System.out.println((c<a)||(c<b));	
		
		System.out.println((a>b)||(a>c));	
		System.out.println((b>c)||(b>a));
		System.out.println((c>a)||(c>b));
		
		System.out.println("!(a>b)" + (!(a>b)));
		System.out.println("!(100<200)" + (!(a<b)));
		


		
System.out.println("using a not equals to b " + (a!=b));	
		
	}


		



}
  
