class emp{
	private int empId;
	private String empName;
	
	emp(){
	int empId=100;
	String empName="Riya";
	}
	
	emp(int empId,String empName) {
	this.empId=empId;
	this.empName=empName;
	}
	void show(){
	System.out.println(empId "+" empName);
}
}
class empDetails{
	public static void main (String args[]){
	emp e = new emp();
	e.show();
	}
