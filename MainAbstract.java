abstract class Bank
{
	public abstract void getBalance(int balance);

}
class BankA extends Bank
{
	public void  getBalance(int a)
	{
		System.out.println("Balance A is:$" +a);
	}
}
class BankB extends Bank
{
	public void  getBalance(int a)
	{
		System.out.println("Balance B is:$" +a);
	}
}
class BankC extends Bank
{
	public void  getBalance(int a)
	{
		System.out.println("Balance C is:$" +a);
	}
}
class MainAbstract
{
	public static void main(String[] args)
	{
		BankA a=new BankA();
		a.getBalance(100);
		BankB b=new BankB();
		b.getBalance(150);
		BankC c=new BankC();
		c.getBalance(200);

	}
}