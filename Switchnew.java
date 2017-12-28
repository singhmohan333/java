import java.util.*;

public class Switchnew{
public static void main(String arg[])
{
Scanner s = new Scanner(System.in);

System.out.println("Enter choice 1 to 11");
int n = s.nextInt();

switch(n){
	case 4 : System.out.println("TRY AGAIN");
	break;
	case 2 : System.out.println("YOU WIN CAR");
	break;
	case 1 : System.out.println("dance");
	break;
	case 3 : System.out.println("eferer");
	break;
	case 5 : System.out.println("close");
	break;
	case 6 : System.out.println("click me");
	break;
	case 7 : System.out.println("system run");
	break;
	case 8 : System.out.println("drawing");
	break;
	case 9 : System.out.println("data copy");
	break;
	case 10 : System.out.println("drive");
	break;
	case 11 : System.out.println("do done");
	break;
	default : System.out.println("worong !!!!!");
}
}

}