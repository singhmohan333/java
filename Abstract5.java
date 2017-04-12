class Abstract5{
	public static void main(String arg[])
{
	System.out.println("using abstract class");

	Abss obj = new Abss();
	obj.sum();
}
}



abstract class Abb{
	abstract void sum();


} 



class Abss extends Abb{

	void sum()
	{

		System.out.println("welcome java");
	}

}