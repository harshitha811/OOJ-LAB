/*Create a package CIE which has two classes- Student and Internals. The class Personal has
members like usn, name, sem. The class internals has an array that stores the internal marks
scored in five courses of the current semester of the student. Create another package SEE
which has the class External which is a derived class of Student. This class has an array that
stores the SEE marks scored in five courses of the current semester of the student. Import the
two packages in a file that declares the final marks of n students in all five courses.*/
import cie.*;
import see.*;
import java.util.Scanner;
class StudentMain{
	public static void main(String args[]){
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the number of students:");
	int n=ss.nextInt();
	int total[];
	int i,j;
	total=new int[5];
	cie.Internals in[]=new cie.Internals[n];
	see.External e[]=new see.External[n];
	for(i=0;i<n;i++){
		in[i]=new cie.Internals();
		e[i]=new see.External();
		System.out.println("Enter details of student "+(i+1)+":");
		in[i].get();
		System.out.println("Enter your internals marks:");
		in[i].getInternals();
		System.out.println("Enter your externals marks:");
		e[i].getExternals();

}
	for(i=0;i<n;i++){
		System.out.println("Student "+(i+1));
		for(j=0;j<5;j++){
		total[j]=in[i].marks[j]+(e[i].externalm[j]/2);
		System.out.println("The total marks in subject "+(j+1)+":"+total[j]);
	}
}
}
}

