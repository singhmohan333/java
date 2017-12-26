import java.util.*;

class Ifmarks{
  public static void main(String args[]){
	  Scanner s = new Scanner(System.in);
 
 System.out.print("enter marks");
int m = s.nextInt();



if(m<50){
System.out.print("Fail !");
}
else if(m>=50 && m<60)
{
System.out.print("D grade");
}
 else if(m>=60 && m<70)
{
System.out.print("c grade");
}
else if(m>=70 && m<80)
{
System.out.print("B grade");
}
else if(m>=80 && m<90)
{
System.out.print(" A grade");
}

else if(m>=90 && m<100)
{
System.out.print("a++ grade");
}
else
{
System.out.print("invalid");
}

 
  }
}