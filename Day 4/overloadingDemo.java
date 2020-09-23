class mathOpe{
	static void sum (int i , int j){
	int k =i+j;
 	System.out.println(k);
}
                 static void mul(int i,int j,int p){
	int k=i*j*p;
	System.out.println(k);
}
}
class overloadingDemo{
  public static void main(String args[])
{
mathOpe.sum(20,10);
mathOpe.mul(30,10,2);
}
}
	

