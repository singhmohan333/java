class Student{
int rollno;
String name, course;
float fee;
Student(int rollno, String name, String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student(int rollno, String name, String course, float fee){
	
	//this.fee=fee;
	//this.rollno,name,course);
}
void display(){System.out.println(rollno + "  " + course +"  "+fee);}
}

class TestThis8{
	public static void main(String arg[]){
		Student s1 = new Student(111, "Snket", " java");
		Student s2 = new Student(54545, "data" , "java");
			s1.display();
			s2.display();
	}
}