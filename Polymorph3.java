class Polymorph3{
	

	public static void main(String arg[])
	{
	
	OverRiding2 obj =new OverRiding2();
	obj.display();
	OverRiding obj1 = new OverRiding();
	obj1.display();
	}
		
}
class OverRiding{
	void display()	
	{
	System.out.println("over riding");
	}
}
class OverRiding2 extends OverRiding{
	void display()
	{
	System.out.println(" fun");
	}
} 