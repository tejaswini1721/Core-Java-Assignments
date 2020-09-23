class overladingOpe{
	static void sum (int i , int j){
	int k =i+j;
 	System.out.println(k);
}
                 static void subtract(int i,int j){
	int k=i-j;
	System.out.println(k);
}
class overloadingDemo{
  public static void main(String args[]);
{
overladingOpe.sum(20,10);
overladingOpe.subtract(30,10);
}
}
	

