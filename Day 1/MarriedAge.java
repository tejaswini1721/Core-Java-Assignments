import java.util.Scanner;
 
 class MarriedAge
{

   public static void main(String args[]){
int age;
String gender;

Scanner sc=new Scanner (System.in);

System.out.println("Enter the age of person");

 age=sc.nextInt();

System.out.println("Enter the gender of person");

 gender=sc.next();

System.out.println("The age of person is"+age);
System.out.println("The gender of person is"+gender);

if(age>18)

{

System.out.println("You are eligible to marry");

}

else{

System.out.println("You are not eligible to marry");

}

}

}