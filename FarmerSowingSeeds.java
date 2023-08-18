package PracticeLoops;
import java.util.Scanner;
public class FarmerSowingSeeds {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows and sports");
		int rows=scan.nextInt();
		int sports=scan.nextInt();
		sowingSeeds(rows,sports);

	}

	public static void sowingSeeds(int rows,int sports) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=sports;j++) {
				System.out.println("completed sowing of seeds in "+i +"and"+j);
			}
		}System.out.println("completed sowing of seeds in field");
		
	}

}
