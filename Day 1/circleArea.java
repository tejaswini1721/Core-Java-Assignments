import java.util.Scanner;
 class circleArea
{
    public static void main(String[] args) 
    {
        int r;
        double pi = 3.14, area,circumference;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
       circumference=2*pi*r;
        System.out.println("Area of circle:"+area);
        System.out.println("circumference of circle:"+circumference);
 
    }            
}