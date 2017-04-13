class A{
	

	int i;
}

class B extends A{
	int i;
	B(int a , int b){
	super.i=a;
	i=b;
	}


void show(){
	System.out.println("in superclass  " + super.i);

	System.out.println("in subclass  " + i );
}


}


class UseSuper{
	public static void main(String arg[])
	{
	B sub = new B(1,4);
	sub.show();

	}

}