class SuperKey{
	public static void main(String arg[])
	{
	System.out.println("using super key word");
	Super2 obj = new Super2();
	obj.display();
	}

}
class Super1{
	int a=10;
void display()
{
System.out.println(a);
}
}

class Super2 extends Super1{
	int a=22, b=9;
	
	void display(){
	System.out.println(a);
	System.out.println(super.a);
	System.out.println(b);
	
	}
}	
