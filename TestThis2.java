class Student{
int rollno;
String name;
float fee;

Student(int rollno, String name, float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
	}
	
void display(){
	System.out.println(rollno+"   "+  name  +  "  "+ fee );
}
	}
class TestThis2{
	
	public static void main(String arg[]){
	
	
	      System.out.println("rollno name  fee " );
	Student s1 = new Student(3 ,"    mohan",44f);
	Student s2 = new Student(34,"   mtt", 65f);
	s1.display();
	s2.display();	
	}
}

