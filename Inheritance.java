
class Inheritance{
	public static void main(String arg[])
	{
	Classes obj = new Classes();
	System.out.println(obj.b);
	System.out.println(obj.a);
	
}
}

class Class1{
	int a=2;
	void display()
	{
	System.out.println(a);
	}
}


class Classes extends Class1
{
	int b=3;
	void show()
	{
	System.out.println(b);
	}

}




