package busreserve;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	

	public int getBusNo() {
		return busNo;
	}


	public boolean isAc() {
		return ac;
	}



	public void setAc(boolean val) {
		ac = val;
	}



	public int getCapacity() {//Accessor
		return capacity;
	}



	public void setCapacity(int cap) {//mutator
		capacity = cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No :"+ busNo + "Ac :" + ac + "Total capacity :"+ capacity);
	}



	public static void main(String[] args) {
		

	}

}
