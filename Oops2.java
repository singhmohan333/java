class Data{
	int a;
	void method(int a, int b)
	{
	System.out.println("creating different class");
	int c;
	c=a+b;
	System.out.println(" sum is " + c);
	System.out.println( "  ");
	}
	
}
class ForLoop{
	void method2(int a, int b)
	{
	System.out.println(" value "+  a + b);
	System.out.println( "  ");
	}
	}
	

class Oops2{
	public static void main(String arg[])
	{
	Data obj = new Data();
	ForLoop obj2 = new ForLoop();
	ForLoop1 obj3 = new ForLoop1();	
	IfElse obj5 = new IfElse();	
	Switch1 obj4 = new Switch1();
	Boss obj6 = new Boss();
	Loop33 obj7 = new Loop33();

		
	System.out.println("creating methods with different classes ");
	obj.method(4,4);
	obj2.method2(12 , 43);
	System.out.println( "  ");
	obj5.iff();
	System.out.println( "  ");
	obj3.loop();
	System.out.println( "  ");
	obj4.switchh();
	System.out.println( "  ");
	obj6.abc();
	System.out.println( "  ");
	obj7.lk();
	}
	}



class ForLoop1{
	void loop()
	{
	System.out.println("creating different classes ");		
		for(int i=1;i<11;i++)
		{
		System.out.println(" hello " + i );
		}
            	       }
	}

class Switch1{
	void switchh()
	{
	System.out.println("creating different class with using switch statment ");	
	int choice=4;
	
	switch (choice)
	{
	case 1 : System.out.println(" you win System");
	break;
	case 2 : System.out.println(" you win computer ");
	break;
	case 3 : System.out.println("you win radio");
	break;
	case 4 : System.out.println("you win mobile");
	break;
	default : System.out.println(" you win nothing");
	}
      }
}

class IfElse{
	void iff()
	{
	System.out.println("creating different classes if con. ");	
	int i=5, j=5;
	if(i==j)
	{
	System.out.println("vlaue of j " + j);
	}
	else
	{
	System.out.println("value of i " + i);
	}


	}	
          }      

class Boss{
	void abc()
	{

	System.out.println("all are good");
	}
	} 


class Loop33{
    void lk()
      {
	System.out.println(" printing pattern");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
		System.out.print(i);	
		}
	  System.out.println(" ");	
	}
       }

}
