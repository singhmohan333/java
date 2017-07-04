// creating objects by passing argument

class ObjectsArgument{
	public static void main(String arg[]){

		VariablesV obj = new VariablesV();
		VariablesV obj1 = new VariablesV();
		VariablesV obj2 = new VariablesV();
		VariablesV obj3 = new VariablesV();


		obj.getValue(1,"mohan");
		obj1.getValue(2,"singh");
		obj2.getValue(3,"king");
		obj3.getValue(4,"mk");

		obj.display();
		obj1.display();
		obj3.display();
		obj2.display();
				
	}
	
}



class VariablesV{
	int id;
	String name;

	void getValue(int i, String n){
		id=i;
		name=n;

	}
   void display(){
   	System.out.println(id +" " + name);
   }
   
   

}