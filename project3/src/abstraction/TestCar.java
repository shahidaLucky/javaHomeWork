package abstraction;

public class TestCar {

	public static void main(String[] args) {
		
		Car car = new CompleteCar();
		car.start();
		
		MotorCar motorCar = new CompleteCar();
		motorCar.engineRunOnGasoline();

		CompleteCar toyota = new CompleteCar();
		toyota.hyBridEngine();
	}

}
