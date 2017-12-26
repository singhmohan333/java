abstract class AllArea{
	double d1;
	double d2;

AllArea(double a, double b)
{
d1=a;
d2=b;
}
void abstract double area( );
{

}
	
}

class Rectangle extends AllArea{
	Rectangle(double a, double b){
	super(a,b);
	}
	double area(){
	System.outb .println("inside area for rectangle" + (d1 * d2 ));
	}
}
class Triangle extends AllArea{
	Triangle(double a, double b)
	{
	super(a,b);
	}
double area()
	{
	System.out.println("Inside area for tiangle" + ((d1*d2)/2));
	
	}
}

class Abstract{
	public static void main(String arg[])
	{
	Rectangle obj = new Rectangle(9,2);
	Triangle obj2 = new Triangle(8,8);
               
	}
}