class constructorChaining
{
constructorChaining()
{
this(5);
System.out.println("The Default constructor");
}
constructorChaining(int x)
{
this(5, 15);
System.out.println(x);
}
constructorChaining(int x, int y)
{
System.out.println(x * y);
}
public static void main(String args[])
{
new constructorChaining();
}
}