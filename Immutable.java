Write the same programme for the class
ImmutableExample, to achieve object value ‘Hi’.

class Immutable
{
	String name;
	Immutable(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	public static void main(String[] args)
	{
		Immutable obj = new Immutable("hi");
		System.out.println(obj.getName());
	}
}