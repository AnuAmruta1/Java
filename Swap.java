class Swap 
{
public static void main(String[] args)
{
int X=10;
int Y=20;
System.out.println("Before Swap..");
System.out.println("X="+ X);
System.out.println("Y="+Y);

X=X+Y;
Y=X-Y;
X=X-Y;

System.out.println("After Swap..");
System.out.println("X="+ X);
System.out.println("Y="+Y);


}
}