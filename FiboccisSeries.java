package PracticeLoops;

import java.util.Scanner;
public class FiboccisSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int range=scan.nextInt();
		
		int num1=0,num2= 1;
		int num3=0;
		for(int i=1;i<=range;i++) {
			num3=num1+num2;
			num1=num3;
			num2=num3;
			System.out.println("fibocci series of"+range +" is="+num3);
		}
	
	}

}

//output:
/*enter the number
10
fibocci series of10 is=1
fibocci series of10 is=2
fibocci series of10 is=3
fibocci series of10 is=5
fibocci series of10 is=8
fibocci series of10 is=13
fibocci series of10 is=21
fibocci series of10 is=34
fibocci series of10 is=55
fibocci series of10 is=89*/