class Private{
int data = 40;
void msg(){
/* private int data = 40; use it give error
private void msg(){ */
System.out.println("hello java private access");

}

}

public class SimpleAcc{
public static void main(String arg[]){
Private obj = new Private();

System.out.println(obj.data);

obj.msg();

}
}