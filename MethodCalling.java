class MethodCalling{


   public static void main(String arg[])
   {
      int a[]={4,5,6,7,8};
      	change(a);

      	for(int y: a)
      		System.out.println(y);

   }
   public static void change(int x[])
   {
   	for(int i=1;i<x.length;i++)
   	x[i] +=5;
   }

}


