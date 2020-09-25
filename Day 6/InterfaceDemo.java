import java.util.Scanner;
interface Drawable{
	float PI = 3.14f ;
	void draw();
}
abstract class Shape{
		float ar;
		abstract void area();
		void show(){
			System.out.println("Area = " +ar);
		}
}


class Rectangle extends Shape implements Drawable{
	void area () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		float length = sc.nextFloat();
		System.out.println("Enter breadth");
		float breadth = sc.nextFloat();
		ar = length * breadth;
	}
	public void draw(){
		System.out.println("drawing rect");
}
}

class InterfaceDemo	{
	public static void main (String args[]){
			Shape r = new Rectangle();
			r.area();
			r.show();
		    r.draw();
	}
}	