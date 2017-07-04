class Inherit{
public static void main(String arg[]){
	Food obj = new Food();
	obj.eat();
	obj.eatA();
}
	
}

class Food extends Apple{


	public void eat(){
		System.out.println("we are in eat food method");
	}
}
class Apple{

public void eatA(){
		System.out.println("we are in eat eat method");
	}
	
}


class Dish{

	public void eatD(){
		System.out.println("we are in eat dish method");
	}


	
}
