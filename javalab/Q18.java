import java.util.Scanner;
	public class Q18{
		public static void main(String[] args){
			int sum = 0;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter first number: ");
			int n1 = input.nextInt();
			System.out.print("Enter second number: ");
			int n2 = input.nextInt();
			for(int i=n1;i<=n2;i++)
				{
					if(i%2!=0)
					sum+=i;
				}
			System.out.println("Sum of odd number between " + n1 + " to " + n2 + " is " + sum);
		}
}