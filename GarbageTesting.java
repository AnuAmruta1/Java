class GarbageTesting 
{
	public void finalize()
	{
		System.out.println("garbage collected object");
	}
	public static void main(String[] args)
	{
		String s = new String();
		s = null;
		System.gc();
		System.out.println("objected collected by garbage collector");

	}
}
