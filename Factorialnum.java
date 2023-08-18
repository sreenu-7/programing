package PracticeLoops;

import java.util.Scanner;
public class Factorialnum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+num +" is="+fact);
	}

}

//output:
/*enter the number
5
factorial of 5 is=120*/