//input by user 
import java.util.*;
class UserInput1{
    public static void main(String arg[]){
    int a;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the value of n and * are print");
        a= s.nextInt();
   
     for(int i=1;i<=a;i++){
       for(int j=1;j<=i;j++)
       {
        System.out.print(j);
        }
       
    System.out.println( );
        }
  }
}
