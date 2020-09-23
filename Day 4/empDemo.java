class emp{
private int empId;
private String empName;
private int empSalary;
private int presentDay;
private int absentDay;

void set(int eid,String ename,int esal,int pday,int aday){
	empId=eid;
	empName=ename;
	empSalary=esal;
	presentDay=pday;
	absentDay=aday;
	}

void show(){
	System.out.println(empId +" " +empName+" "+empSalary+" "+presentDay);
	System.out.println(absentDay);
}
}

class empDemo{
	public static void main(String args[]){
	emp e=new emp();
	e.set(102,"Ram",20000,30,1);
	e.show();
	emp e1=new emp();
	e.set(106,"Shayam",30000,28,3);
	e.show();
	e.set(109,"param",660000,31,0);
	e.show();
	
}
}