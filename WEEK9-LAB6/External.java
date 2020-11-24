/*Create a package CIE which has two classes- Student and Internals. The class Personal has
members like usn, name, sem. The class internals has an array that stores the internal marks
scored in five courses of the current semester of the student. Create another package SEE
which has the class External which is a derived class of Student. This class has an array that
stores the SEE marks scored in five courses of the current semester of the student. Import the
two packages in a file that declares the final marks of n students in all five courses.*/
package see;
import cie.*;
import java.util.Scanner;
public class External extends cie.Student{
	public int externalm[]=new int[5];
	Scanner ss=new Scanner(System.in);
	public void getExternals(){
		for(int i=0;i<5;i++){
		System.out.println("Enter your marks in subject "+(i+1)+" out of 100:");
		externalm[i]=ss.nextInt();
	}
	}
}