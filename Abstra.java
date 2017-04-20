class Abstra{
	public static void main(String arg[])
	{
	System.out.println("abstract class");
	Absts obj = new Absts();
	obj.sum();
	}
    }


	abstract class Abstt{
	abstract void sum();
	       }

class Absts extends Abstt{
	void sum()
	{
	System.out.println("all data");
	}
	}