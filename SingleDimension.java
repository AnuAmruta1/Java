Write the same programme by assigningthearray integer values 25, 89 and 100 for the class SingleDimensionDemo. Show the resulting output.

class SingleDimension
{
	public static void main(String[]args)
	{
		int[] a=new int[3];
		a[0]=25;
		a[1]=89;
		a[2]=100;

		System.out.println("Single dimension array elements are");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}	
}
