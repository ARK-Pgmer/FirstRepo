package studyPackage;
import java.util.Scanner;

class Marks{
	
	String name;
	int  rollno;
	float chem_marks, maths_marks,phy_marks;
	
	
	
}
public class StudentPercentage {

	public static void main(String[] args) {
			
		Scanner s=new Scanner(System.in);
		Marks Student = new Marks();
		System.out.println("How many students are there to check out their percentage? ");
		int n=s.nextInt();
		int i = n;
		int h=1;
		
		while(i>0) {
			
			System.out.println("Enter the "+h+" student's name: ");
			Student.name=s.next();
			
			System.out.println("Enter the "+h+" student's roll no.: ");
			Student.rollno=s.nextInt();
			
			System.out.println("Enter Physics mark: ");
			Student.phy_marks=s.nextFloat();
			
			System.out.println("Enter Chemistry mark: ");
			Student.chem_marks=s.nextFloat();
			
			System.out.println("Enter Mathematics mark: ");
			Student.maths_marks=s.nextFloat();
			
		
			double p=((Student.phy_marks+Student.chem_marks+Student.maths_marks)/300)*100;
			System.out.println("Total percentage is "+p+"%");
			i--;
			h++;
		}
			
	}

}
