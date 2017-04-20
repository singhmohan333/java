class IfElse2{
	public static void main(String Arg[])
	{
	int a=15;
	int b=15;
	int c=15;
	//if(a>b)
	//{
	//System.out.println("a is greater than b " + a);
	//}
	//else if(a<b)
	//{
	//System.out.println("b is greater than a");
	//}
	//else if(b>c)
	//{
	//System.out.println("b is greater than c");
	//}
	if(a==b)
	{
	System.out.println("a is equal to b ");
	}
	else if(b==c)
	{
	System.out.println("b equal to c and");
	}
	//else if()	{	System.out.println("b is greater than c");			}
	else if((a==b)&&(b==c))
	{ System.out.println("a b c are equal");		}
	else
	{ System.out.println("c is less than a & b");	}	
	}
}