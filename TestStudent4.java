class Student{
  int rollno;
String name;
void insertRecord(int r, String n){
rollno=r;
name=n;
}

void displayInformation(){
System.out.println(rollno+" "+name);
}
}
class TestStudent4{
public static void main(String arg[]){
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
Student s4=new Student();

s1.insertRecord(1111,"mohan");
s2.insertRecord(5155,"singh");
s3.insertRecord(2454,"raju");
s4.insertRecord(50004,"mark");


s1.displayInformation();
s2.displayInformation();
s3.displayInformation();
s4.displayInformation();
}
}