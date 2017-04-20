class Polymorphism{
	sum()	
	{
	System.out.println("my first class:");
	}
	sum(int a)
	{
	System.out.println("jj");
	System.out.println("h");
	}

}
class Poly{
	public static void main(String arg[])
  	{
	Polymorphism obj = new Polymorphism();
	obj.sum(2);
	
   }

}