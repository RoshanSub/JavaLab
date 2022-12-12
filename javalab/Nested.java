	import java.util.Scanner;
	public class Nested{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("1. Separate Information\n2. Combined Information");
	System.out.println("\nEnter a choice to display information(1/2): ");
	int choice1 = input.nextInt();
	switch(choice1)
	{
	case 1:
	System.out.println("1. Name\n2. Phone No.\n3. Address");
	System.out.println("Enter your choice(1/2/3)");
	int choice2 = input.nextInt();
	switch(choice2)
	{
	case 1:
	System.out.println("Name : Roshan Subedi");
	break;
	case 2:
	System.out.println("Phone No. : 9862404925");
	break;
	case 3:
	System.out.println("Address : Charikot,Dolakha");
	break;
	default:
	System.out.println("Invalid input");
	}
	break;
	case 2:
	System.out.println("Name: Roshan Subedi\nPhone No. : 9862404925\nAddress : Charikot,Dolakha");
	break;
	default:
	System.out.println("Invalid input");
	}
	}
	}