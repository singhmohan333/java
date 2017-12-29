class Animal{
	void eat(){
		System.out.println("eating");
	}

}

class Dog extends Animal{
	
	void eat(){
		System.out.println("Eating fruits");
	}
}

class Polymorphismm extends Dog{
			void eat(){
					System.out.println("Drinking milk");	
			}
public static void main(String arg[]){
		Animal a1, a2, a3;
	
		a1 =new Animal();
		a2 =new Dog();
		a3 =new Polymorphismm();
		a1.eat();	
		a2.eat();	
		a3.eat();	
	
}	
}