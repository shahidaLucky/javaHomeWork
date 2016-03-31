package abstraction;

public abstract class MotorCar implements Car {
	int size = 10;
	
	//Car interface methods
    public void carBodySize(){
    	
    	System.out.println("Car size: " + size);
	
    }
	
	public void needEngine(){
		
		System.out.println("Motor Engine Car");
		
	}
	
	public void start(){
		System.out.println("Start the engine to drive");
	}
	
	
	public void stop(){
		
		System.out.println("Press break pad to stop the car");
		 
	}
	
	//MotorCar methods
	public void engineRunOnGasoline(){
		System.out.println("Run by Gasoline");
	}
	
	public abstract void engineRunOnBatteryCharge();
	
	
	
	

}
