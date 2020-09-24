class emp{
	private int empId;
	private String empName;
	
	emp(){
		System.out.println(" non param constructor");
	 empId=100;
	 empName="Riya";
	}
	
	emp(int empId,String empName) {
		System.out.println("paramerarized constructor");
	this.empId=empId;
	this.empName=empName;
	}
	void show(){
	System.out.println(empId + " " +empName);
}
}
class empDetails{
	public static void main (String args[]){
	emp e = new emp();
	e.show();
	emp e1= new emp(200,"Nilam");
	e1.show();
	}
}