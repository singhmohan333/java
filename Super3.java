class Super3{
      public static void main(String arg[])
	{
	Super5 obj = new Super5();
	obj.display();
	
	}

}


class Super4{
int a=22;
void sum()
	{
	System.out.println(a);
	}

}


class Super5 extends Super4{
void display(){
	System.out.println("hello a");
	super.sum();
}

}
