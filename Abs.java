class Abs{
        public static void main(String arg[])	
	{
	Syst obj = new Syst();
	obj.display(5);
	}

}



abstract class Abst{
	
	int a;
	abstract void display(int a);
		}
 

class Syst extends Abst{

void display(int a)
	{
	System.out.println(a);
	}
	
}
