package PracticeLoops;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the prime number");
		int num=scan.nextInt();
		CheckPrime(num);
	}

	public static void CheckPrime(int num) {
		boolean isprime = true;
		if(num<1){
			isprime=false;
		}else {
			
			for(int i=2;i<=num;i++) {
					if(num%i==0) {
						isprime=false;
						break;
					}else {
						isprime=true;
						break;
					}
			}if(isprime==true) {
				System.out.println("prime number");
			}else {
				System.out.println("Not prime");
		}
		}
		
	}

}
