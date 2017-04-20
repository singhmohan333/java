class PrivateMethod{
public static void main(String arg[])
{
Private1 obj = new Private1();
	System.out.println(obj.a);   // their is a error because it is private
	obj.display();
}
}

class Private1{
private int a;
private void display()
	{
	System.out.println("private method");

}
}