class PrivateVari{
public static void main(String arg[])
{
Private1 obj = new Private1();
	System.out.println(obj.a);   // their is a error because a is private
}
}

class Private1{
private int a;

}