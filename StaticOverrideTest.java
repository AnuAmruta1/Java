class College
{
	public static void name()
	{
		System.out.println("MD COLLEGE");
	}
}
class Student extends College
{
	public static void name()
	{
		System.out.println("AMRUTA");
	}
}
class StaticOverrideTest
{
	public static void main(String[] args)
	{
		College c=new College();
		c.name();

		Student s=new Student();
		s.name();	
	}
}