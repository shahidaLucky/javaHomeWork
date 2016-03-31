package variable;

public class Computer {
	
    static int ramSize = 10;
    final int cpu = 3;
    int memory ;
	
	public int getRamSize(){
		return ramSize;
	}
	
	public void setRamSize(int ramSize){
		this.ramSize = ramSize;
	}
	
	public final int calculateCPUCapacity(){
		int total = cpu + 5;
		
		return total;
	}

}
