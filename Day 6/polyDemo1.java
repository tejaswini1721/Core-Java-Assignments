class Foo{
void m1(){
	System.out.println("Foo m1");
	}
}	

class bar extends Foo {	
	void m1(){
	System.out.println("bar m1");
	}
}

class polyDemo1{
	public static void main(String args[]){
	Foo f = new bar();
	f.m1();
	
	}
}	