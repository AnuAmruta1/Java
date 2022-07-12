import java.util.Scanner;
class ArithmaticOperator
	{
		public static void main(String[] args)
		{
			System.out.println("ArithmaticOperator:");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value of a to perform arithmatic operator:");
			int a=s.nextInt();
			System.out.println("Int a:"+a);
			System.out.println("Enter the value of b to perform arithmatic operator:");
			int b=s.nextInt();
			System.out.println("Int b:"+b);
			System.out.println("Addition of two number:"+(a+b));
			System.out.println("Substraction of two number:"+(a-b));	
			System.out.println("Multiplication of two number:"+(a*b));
			System.out.println("division of two number:"+(a/b));
		}
	}
