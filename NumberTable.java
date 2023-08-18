package PracticeLoops;

import java.util.Scanner;
public class NumberTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		
		int table=0;
		int count=10;
		for(int i=1;i<=count;i++) {
			table=num*i;
			System.out.println(num+ "*"+i +"=" +table);
		}

	}

}

//output:
/*enter the number
5
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50*/