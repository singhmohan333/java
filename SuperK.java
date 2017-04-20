class SuperK{
	public static void main(String arg[])
	{
	System.out.println("we are using super key word");
	Sup obj = new Sup();
	}
}
class Sup extends Supe{
	Sup()
	{
	super();
	System.out.println("hello");
	}
}
class Supe{
Supe()
	{
	System.out.println("a line");
	}
}
class Ss extends Supe{
	Ss(){
	System.out.println("hi mohan");
	}
}

