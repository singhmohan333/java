class Subclass extends Superclass
{
int rs=333;
public static void main(String arg[]){
Subclass s = new Subclass();

System.out.println(s.a);
System.out.println(s.rs);


}
}


class Superclass{

int a = 5;
}