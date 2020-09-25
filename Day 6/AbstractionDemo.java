import java.util.Scanner;
abstract class Shape{
		float ar;
		abstract void area();
		void show(){
			System.out.println("Area = " +ar);
		}
}

class Rectangle extends Shape{
	void area () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		float length = sc.nextFloat();
		System.out.println("Enter breadth");
		float breadth = sc.nextFloat();
		ar = length * breadth;
	}
}

class AbstractionDemo	{
	public static void main (String args[]){
			Shape r = new Rectangle();
			r.area();
			r.show();
		
	}
}	