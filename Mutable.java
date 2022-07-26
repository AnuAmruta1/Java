Write the same programme for the class
MutableExample, to output the object values ‘hello 2’ and ‘hello3’.

class Mutable
{
	String name;
	Mutable(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public static void main(String[] args)
	{
		Mutable m = new Mutable("hello2");
		System.out.println(m.getName());
		m.setName("hello3");
		System.out.println(m.getName());
	}
}