import java.util.Scanner;
public class StudentMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		//take input
		System.out.println("Enter Name:");
		s.name=sc.nextLine();
		System.out.println("Enter roll number");
		s.rollno=sc.nextInt();
		System.out.println("Maths marks");
		s.maths=sc.nextInt();
		System.out.println("Science marks");
		s.science=sc.nextInt();
		System.out.println("English marks");
		s.english=sc.nextInt();
		System.out.println("computer marks");
		s.computer=sc.nextInt();
		//calculations
		s.total=s.maths+s.science+s.english+s.computer;
		s.percentage=s.total/4.0;
		s.grade=calculateGrade(s.percentage);
		//save to database
		StudentDAO.insertStudent(s);
		StudentDAO.viewStudents();
	}
	public static char calculateGrade(double percentage){
		if(percentage>=90)
			return 'S';
		else if(percentage>=80)
			return 'A';
		else if(percentage>=70)
			return 'B';
		else if(percentage>=60)
			return 'C';
		else if(percentage>=50)
			return 'D';
		else if(percentage>=40)
			return 'E';
		else
			return 'F';
	}
}


		


		
