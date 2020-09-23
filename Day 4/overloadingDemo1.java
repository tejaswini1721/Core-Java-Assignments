class mathOpe{
	static void sum (int i ,float j){
	float k =i+j;
 	System.out.println(k);
}
                 static void mul(float i,int j){
	float k=i*j;
	System.out.println(k);
}
}
class overloadingDemo1{
  public static void main(String args[])
{
mathOpe.sum(20,10.2f);
mathOpe.mul(3.2f,3);
}
}
	

