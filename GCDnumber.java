package PracticeLoops;

import java.util.Scanner;
public class GCDnumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		int gcd=1;
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}System.out.println("GCD="+gcd);
	}

}

//output
/*12
8
GCD=4*/
