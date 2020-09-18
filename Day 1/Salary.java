import java.util.Scanner;

class Salary 
{
    	public static void main( String[] args ) 
    	{
		Scanner sc = new Scanner(System.in);
	
		float bs, gross_salary, da, hra;

		System.out.println("Enter basic salary:");
		bs = sc.nextFloat();
	
		if (bs<1500)
		{
			hra = bs * 10 / 100;
			da = bs * 90 / 100;
		}
		else
		{
			hra = 500;
			da = bs * 98 / 100;
		}
		gross_salary = bs + hra + da;
		System.out.println("Gross salary = Rs." +gross_salary );
    }

}