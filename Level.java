class Level{
	public static void main(String arg[])
	{
	First obj = new First();
	System.out.println(obj.x);	
	}
}


class First extends Second{
	int x=34;
}

class Second{
	int y=22;
}
	