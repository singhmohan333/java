public class DateFormat{
	int month;
	int day;
	int year;

	public DateFormat(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		System.out.println("the costructior for this is " + this + );

	}
public String toString(){
	return String.format("%d/%d/%d", month, day, year); 
}
}

class UseToString{
	DateFormat obj = new DateFormat(1,2,3);
}