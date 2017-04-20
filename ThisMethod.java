class ThisMethod{
public static void main(String arg[])	
	{
                ThisUse obj = new ThisUse();
	ThisUse obj1 = new ThisUse(12);
	ThisUse obj2 = new ThisUse(12,22);
	ThisUse obj3 = new ThisUse(12,12,21);
}

}

class ThisUse{
       ThisUse()
    {
    System.out.println("welcome to class first");
    }
   ThisUse(int a)
	{
	System.out.println("welcome to class first");
	System.out.println(a);
	}
   ThisUse(int a, int b)
	{
	System.out.println("welcome to class first");
	System.out.println(a);
	System.out.println(b);	
	
	}
   ThisUse(int a, int b, int c)
	{
	System.out.println("welcome to class first");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	}

      
}