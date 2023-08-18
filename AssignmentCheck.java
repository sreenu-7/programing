package PracticeLoops;
import java.util.Scanner;
public class AssignmentCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the schools,classes,number of students");
		int s=scan.nextInt();
		int c=scan.nextInt();
		int stud=scan.nextInt();
		checkAssignment(s,c,stud);
	}

	public static void checkAssignment(int s, int c, int stud) {
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=c;j++) {
				for(int k=1;k<=stud;k++) {
					if(i%2!=0 && k%2==0) {
					System.out.println("completed assignmentof "+i + "class "+j +"students "+k);
					}else if(i%2==0 && k%2!=0){
						System.out.println(" not completed assignmentof "+i + "class "+j +"students "+k);
					}else {
						System.out.println("students assignment in progress "+i + "class "+j +"students "+k);
					}
				}
			}
		}System.out.println("all schools ,classess &students completed assignment");
		
	}

}
