package PracticeLoops;
import java.util.Scanner;
public class SumNaturalNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the natural number");
		int num=scan.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("sum="+sum);
	}

}

//output:
/*enter the natural number
10
sum=55*/
