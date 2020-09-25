import java.util.Scanner;
abstract class processor{
		int num;
		abstract void process();
		void showData(){
			System.out.println("facto = " +res);
		}
}

class Factorial extends processor{
	void process () {
		 int factorial(int n) ;
    { 
        int res = 1, i; 
        for (i = 2; i <= n; i++) 
            res *= i; 
        return res; 
    } 
	}
}

class factDemo	{
	public static void main (String args[]){
			processor r = new processor();
			r.areaprocess();
			r.showData();
		
	}
}	