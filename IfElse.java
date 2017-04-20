class IfElse{
	public static void main(String Arg[])
	{
	int a=1;
	int b=1;
	int c=1;
	if(a>b)
	{
	System.out.println("a is greater than b " + a);
	}
	else if(a==b)
	{
	System.out.println("a is equal to b");
	}
	else if(a%2==0)
	{  System.out.println("the even number is" + a);		}
	else if(b%2==0)
	{   System.out.println("the even number is" + b);		}
	else 
	{
	System.out.println("b is greater than a  " + b);
	}
	}
}