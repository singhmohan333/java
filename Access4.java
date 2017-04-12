class Access4{
	public static void main(String arg[])
	{
	Access5 obj = new Access5();	
	Access6 obj2 = new Access6();	
System.out.println(obj.a);
	System.out.println(obj2.b);
	obj2.sho(5);
	}
}
class Access5{	int a=41;	}

class Access6{	 
 int b=4;	
	void sho(int t)
	{
	for(int i=0;i<=10;i++)
	{
	System.out.print("X" + t + "" );
	
		}
	} 

}



