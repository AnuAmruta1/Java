import java.util.Scanner;
class ScannerStudentDetails
{
	public static void main(String[] args)
	{
		System.out.println("STUDENT DETAILS:");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student ID:");
		int studentId=s.nextInt();
		System.out.println("Enter the Student Name:");
		String studentName=s.next();
		System.out.println("Enter the Student Age:");
		byte studentAge=s.nextByte();
		System.out.println("Enter the Student Mobile No:");
		long studentMobileNo=s.nextLong();
		System.out.println("Enter the Student Gender (M/F):");
		char studentGender=s.next().charAt(0);
		System.out.println("Enter the Student CGPA:");
		float StudenCGPA=s.nextFloat();
		System.out.println("Student ID:"+studentId);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Age:"+studentAge);
		System.out.println("Student Mobile No:"+studentMobileNo);
		System.out.println("Student Gender:"+studentGender);
		System.out.println("Student CGPA:"+StudenCGPA);
}
}
