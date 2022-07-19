interface Girl
{
	int a=5;
	public void add();
	
}
interface Boy
{
	int b=7;
	public void add1();
}
class testClass implements Girl,Boy
{
	public void add()
	{
		System.out.println("The Value of Girl is:"+a);
	}
	public void add1()
	{
		System.out.println("The Value of Boy is:"+b);
	}
}
class MainInterface
{
	public static void main(String[] args)
	{
		testClass t=new testClass();
		t.add();
		t.add1();
	}
}