package PracticeLoops;

import java.util.Scanner;
public class PowerNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the base & exponetial number");
		int base=scan.nextInt();
		int exponential=scan.nextInt();
		
		int power=1;
		for(int i=1;i<=exponential;i++) {
			power=power*base;
		}System.out.println("power="+power);
	}	

}

//output:
/*2
4
power=16*/
