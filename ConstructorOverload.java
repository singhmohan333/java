//costructor over loading

class ConstructorOver{

	int  hour;
	int minute;
	int second;

	public ConstructorOver(){

	}
	public ConstructorOver(int h){
		this(h,0,0);
	}
	public ConstructorOver(int h, int m){
		this(h,m,0);

	}
	public ConstructorOver(int h, int m, int s){
		setTime(h,m,s);
	}
public void setTime(int h, int m, int s){
	setHour(h);
	setMinute(m);
	setSecond(s);
}
public void setHour(int h){
	hour= ((h>=0 && h < 24 ) ? h:0);
}
public void setMinute(int m){
	minute= ((m>=0 && m < 60 ) ? m:0);
}
public void setSecond(int s){
	second= ((s>=0 && s < 60 ) ? s:0);
}
public int getHour(){
	return hour;
}
public int getMinute(){
	return minute;
}
public int getSecond(){
	return second;
}

public String timeS(){
	return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
}

}

class ConstructorOverload{ 

public static void main(String args[]){

ConstructorOver obj = new ConstructorOver(3);

System.out.printf("%s\n", obj.timeS());
	}
}