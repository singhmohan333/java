import java.util.*;

class Switch
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
	int choice;

	System.out.println("Enter your choice 1 2 3 4 5 6 7");
	choice = s.nextInt();






	switch (choice)

	{
	case 1 : 
	System.out.println("monday");
	break;
	
	case 2 : 
	System.out.println("tuesday");
	break;
	case 3 : 
	System.out.println("wednesday");
	break;
	case 4 : 
	System.out.println("thrusday");
	break;
	case 5 : 
	System.out.println("friday");
	break;
	case 6 : 
	System.out.println("monday");
	break;
	case 7 : System.out.println("monday");
	break;

	default : System.out.println("enter wrong choice");



	}


	}

	
}