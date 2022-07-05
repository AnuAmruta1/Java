class TypeCasting
{
public static void main(String[ ] args)
{
char letter= 'A';
int ascii= letter;
char alp= (char) ascii;
System.out.println("value after typecasting Auto " +ascii);
System.out.println("value after typecasting manually " +alp);
}
}
