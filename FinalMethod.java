class FinalMethod extends FinalMe{
	public static void main(String arg[])
{
	FinalMe obj = new FinalMe();
	obj.sum('a');
	FinalMethod obj1 = new FinalMethod();
	obj.sum();
}
	final void sum(){
	System.out.println("hello");
	}
}

class FinalMe{
final void sum(char a)
{	
System.out.println("hello hi" + a);
} 

}
