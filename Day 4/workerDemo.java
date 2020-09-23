class worker{
private int workerId;
private String workerName;

void set(int wid,String wname){
	workerId=wid;
	workerName=wname;
	}

void show(){
	System.out.println(workerId +" " +workerName);
}
}

class workerDemo{
	public static void main(String args[]){
	worker w=new worker();
	w.set(102,"Ram");
	w.show();
	worker w1=new worker();
	w.set(105,"Sham");
	w.show();
	w.set(109,"kishan");
	w.show();
	
}
}