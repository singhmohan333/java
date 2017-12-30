class AccessModif{
protected void msg(){System.out.println("hello proitectetrrd");}

}

public class AccessModif2 extends AccessModif{
void msg(){System.out.println("hello java protecter d");}

public static void main(String arg[]){
	AccessModif2 obj = new AccessModif2();
	obj.msg();	
	
}
}