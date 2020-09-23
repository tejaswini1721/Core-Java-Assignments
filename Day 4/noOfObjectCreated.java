class noOfObjectCreated{
    private int stdId;
    private String stdName;
    public static int counter=0;

   noOfObjectCreated(int id,String name){
        stdId=id;
        stdName=name;
        counter++;
    }
}
class noOfObjectCreated1{
    public static void main(String args[]){
        noOfObjectCreated s1=new noOfObjectCreated(1,"Tina");
       noOfObjectCreated s2=newnoOfObjectCreated(2,"Dipa");
       noOfObjectCreated s3=new noOfObjectCreated(3,"Siya");
       noOfObjectCreated s4=new noOfObjectCreated(4,"Reena");
        noOfObjectCreated s5=new noOfObjectCreated(5,"Meena");

        System.out.println("Total objects count "+Student.counter);
    }
}