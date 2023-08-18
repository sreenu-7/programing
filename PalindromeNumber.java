package PracticeLoops;

import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		checkPalindromeNum(num);

	}

	public static void checkPalindromeNum(int num) {
		
		int i=1;
		int reverse=0,n = 0;
		while(num!=0) {
			int digit=num%10;
			reverse = reverse*10+digit;
			n=n/10;
			i++;
			}if(reverse==num) {
				System.out.println("entered number"+num +" is palindrome="+n);
			}else {
				System.out.println("entered number"+num +" is not palindrome="+n);
			}
		}
		
	}


