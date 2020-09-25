class methodcalldemo2{
	int i=100;
	static int j= 200;
	void m3(){
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String args[]){
		//System.out.println(new methodcalldemo2().i);
		System.out.println(j);
		Foo.m1();
		
	}
}	