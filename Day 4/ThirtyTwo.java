class Student{
    private int stdId;
    private String stdName;
    public static int counter=0;

    Student(int id,String name){
        stdId=id;
        stdName=name;
        counter++;
    }
}
class ThirtyTwo{
    public static void main(String args[]){
        Student s1=new Student(1,"Meena");
        Student s2=new Student(2,"Dipa");
        Student s3=new Student(3,"Siya");
        Student s4=new Student(4,"Reena");
        Student s5=new Student(5,"Niya");

        System.out.println("Total objects count "+Student.counter);
    }
}