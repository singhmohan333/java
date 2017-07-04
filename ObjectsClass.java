class Student{
	int a;
	String s;
}

class ObjectsClass{
	public static void main(String arg[]){
		Student obj = new Student();
		obj.a = 22;
		obj.s = "mohan";

		System.out.println("output is " + obj.a +"  "+ obj.s);

	}
}