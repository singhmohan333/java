class Suupr{
	int a; 
	Suupr()
	{
		System.out.println("your are in Suupr classs");
	}

}


class Suupr1 extends Suupr{

	Suupr1()
	{
	super();
	System.out.println("your in class suupr1");
      }
}



class SuperKey1{
	public static void main(String arg[])
	{
		Suupr1 obj = new Suupr1();
	}
}