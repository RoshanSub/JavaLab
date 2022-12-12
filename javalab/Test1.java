//public class Test1{
   // public static void main(String[] args){
	//for(int a=5; a<=10; a++){
	//	if(a==8){
			//return;
			//continue;
		//}
		//continue;
		//return;
		
			
		//System.out.println(a);
		//return;
	  //}
	  //int a=5,b=5;
	  //System.out.println(a==b);
	  
	  //int a=10,b=10;
	  //System.out.println(a!=b);
	//}
//}

import java.util.Scanner;  
	public class Test1{       
		public static void main(String args[]){  
			int number, digit, sum = 0;  
			Scanner sc = new Scanner(System.in);  
			System.out.print("Enter the number: ");  
			number = sc.nextInt();  
			while(number > 0)  
			{     
			digit = number % 10;    
			sum = sum + digit;    
			number = number / 10;  
			}    
			System.out.println("Sum of Digits: "+sum);  
		}  
	}  