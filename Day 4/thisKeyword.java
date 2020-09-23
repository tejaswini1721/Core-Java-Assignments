class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee)
{  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){
System.out.println(rollno+" "+name+" "+fee);
}  
}  
  
class thisKeyword{  
public static void main(String args[]){  
Student s1=new Student(111,"tejaswini",5000.60f);  
Student s2=new Student(112,"abhishek",6000.50f);  
s1.display();  
s2.display();  
}
}  