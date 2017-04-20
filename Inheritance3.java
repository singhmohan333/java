class Inheritance3
{
	public static void main(String arg[])
	{

	UseInherit2 obj = new UseInherit2();
	obj.fun();
	obj.fun2();
	System.out.println(obj.c);
	System.out.println(obj.c);
	}
}


class UseInherit{
	int a=44;
	}

class UseInherit1 extends UseInherit
{
int c=2;
void fun2()
{
System.out.println(c);
}
}
class UseInherit2 extends UseInherit1
{
void fun()
{
System.out.println("the system of all things");
}
}