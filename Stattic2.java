class Stattic{
	String fname;
	String lname;

	static int member = 0;

	Stattic(String fn, String ln)
	{
		fname= fn;
		lname= ln;
		member++;
		System.out.println(fname + "  "+ lname);
	}



}

class Stattic2{
	public static void main(String arg[]){
		Stattic obj = new Stattic("mohan","singh");
		Stattic obj2 = new Stattic("swt","singh");
		Stattic obj3 = new Stattic("man","singh");

	}

}