class Foo{
	static void m1(){
	System.out.println(" m1");
	}
	void m2(){
		System.out.println(" m2");
	}
	
}	



class methodcallDemo{
	public static void main(String args[]){
	//Foo f = new Bar();
	//f.m1();
	Foo.m1();
	//Bar.m1();
	//Bar f1 = (Bar)f;
	//f1.m1();
	new Foo().m2();
	}
}	