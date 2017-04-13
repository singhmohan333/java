class Abc {
	Abc(int a){
	System.out.println("hello");
}
}


class Xyz extends Abc{
	Xyz()
	{
	
	//System.out.println("hi hello");
	}

}


class Sst {


	Sst()
	{
		System.out.println("hello sst");
	}
}

class All{

public static void main(String arg[])
{

	Xyz obj = new Xyz();
	Sst obj1 = new Sst();
	
}

}