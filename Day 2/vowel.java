import java.util.Scanner;
class vowel{
	public static void main(String args[]){
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter Any Character");
	char ch=sc.next().charAt(0);
switch(ch){
case 'a': 
System.out.println("its vowel");
break;
case 'e': 
System.out.println("its vowel");
break;
case 'i': 
System.out.println("its vowel");
break;
case 'o': 
System.out.println("its vowel");
break;
case 'u': 
System.out.println("its vowel");
break;

default: 
System.out.println("not vowel");
break;
}
}
}