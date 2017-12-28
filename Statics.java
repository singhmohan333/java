class Ds{
int a = 40;
}

class Statics{
   static{
	   
	   System.out.println("static block invoked");
	} 
	
  public static void main(String arg[]){
  
  Ds d = new Ds();
  
  
  System.out.println("Hello system");
  System.out.println(d.a);
  
  }
}


