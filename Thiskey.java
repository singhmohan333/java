class Thiskey{
void m(){
System.out.println(this);

}

public static void main(String arg[]){

Thiskey obj = new Thiskey();
System.out.println(obj);
obj.m();
}
}