package abstraction;

public class CompleteCar extends MotorCar implements Energy,SteamEngine{

	public void engineRunOnBatteryCharge() {
		System.out.println("Engine runs on Battery charge");
		
	}
	
	public void hyBridEngine(){
		System.out.println("Hybrid engine");
	}

	public void solarEnergy() {
		System.out.println("Hybrid run on solar energy");
		
	}

	public void steamEngineSource() {
		System.out.println("Runs on Steam engine");
	}

}
