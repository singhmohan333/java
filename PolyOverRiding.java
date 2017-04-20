class PolyOverRiding{
public static void main(String arg[])
{
	MethodD obj = new MethodD();
	obj.sum();
	MethodC obj1 = new MethodC();
	obj1.sum();

}
}


class MethodC{

	void sum()
	{
	System.out.println("a");
	}
}

class MethodD extends MethodC{
	void sum()
	{
	System.out.println("b");
	}

}