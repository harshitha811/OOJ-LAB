package cie;
import java.util.Scanner;
public class Student{
	public String name,usn;
	public int sem;
	Scanner ss=new Scanner(System.in);
	public void get(){
		System.out.println("Enter your name:");
		name=ss.nextLine();
		System.out.println("Enter your usn:");
		usn=ss.next();
		System.out.println("Enter your semester:");
		sem=ss.nextInt();
	}
}
