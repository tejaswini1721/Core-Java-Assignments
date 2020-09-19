class student{
	private int rollno;
	private String studName;
	void setData(int id, String name){
		rollno = id;
		studName = name;
	}
	void showData(){
		System.out.println(rollno+" "+studName);
	}
}
class studentData{
	public static void main(String args[]){
		student s = new student();
		s.setData(100,"Tejaswni");
		s.showData();
		
	}
}