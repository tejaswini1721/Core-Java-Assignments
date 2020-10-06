package Excep;

import java.util.*;
class Voter {
	private int voterid;
	private String name;
	private int age;
	
	Voter(int voterid,String name,int age) 
	{
		this.voterid=voterid;
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "Voter Id : " +voterid+ " Voter Name : \n"+name+" Voter Age :"+age;
	}
	
	
	
}
public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter id : ");
			int id=sc.nextInt();
			System.out.println("Enter name :");
			String name=sc.next();
			System.out.println("Enter age : ");
			int age=sc.nextInt();
			if(age<18)
			{
				throw new Exception("Invalid age");
			}
			else {
				Voter v=new Voter(id,name,age);
				System.out.println(v);
				}
		}
			catch(Exception e){
				System.out.println(e);
			}
		

	}

}