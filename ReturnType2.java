class ReturnType{

ReturnType get(){return this;}
}

class ReturnType2 extends ReturnType{
ReturnType2 get(){return this;}

void message(){System.out.println("welcome to covariant return type");}

public static void main (String arg[]){
new ReturnType2().get().message();
}
}