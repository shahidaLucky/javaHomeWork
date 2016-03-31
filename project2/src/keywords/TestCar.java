package keywords;

public class TestCar {

	public static void main(String[] args) {
		//static variable example
		Car toyota =  new Car();
		toyota.setCarSize(10);
		System.out.println("toyota car size : " + toyota.getCarSize());
		
		Car honda = new Car();
		honda.setCarSize(12);
		System.out.println("Honda car size : " + honda.getCarSize());
		
		System.out.println("toyota car size : " + toyota.getCarSize());
		
		//static method access
		//Car.carProperty();

	}

}
