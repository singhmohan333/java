class PublicClass{
public static void main(String arg[])
{
	PublicClass1 obj = new PublicClass1();
	System.out.println(obj.a);
	System.out.println(obj.s);	
	
}
}
class PublicClass1 extends PublicClass2{
	int a=42;
}

class PublicClass2{
int s=3;

}