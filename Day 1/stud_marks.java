import java.util.Scanner;
class stud_marks{
public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	                float total, Percentage;
		 Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();	
		
		total = english + chemistry + computers + physics + maths;
		
	               Percentage = (total / 500) * 100;
	    
	               System.out.println(" Total Marks =  " + total);
	
	               System.out.println(" Marks Percentage =  " + Percentage);
	}
}
