class AccessPrivate{
/* private */ AccessPrivate(){}


void msg(){System.out.println("hello java");}
}

public class AccessPrivate1{
public static void main(String arg[]){
	
	
 AccessPrivate obj = new AccessPrivate();
 
 System.out.println("access modifier");
 
 obj.msg();
}
}