class StaticBlock{

static{
  System.out.println("This is static block");
}

public static void main(String arg[]){
int a;

System.out.println("this main block");

}

static{
	
	System.out.println("This is second static block");
}
}