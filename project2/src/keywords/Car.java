package keywords;

public class Car {
	
	static int carSize = 10;
	static String color = "green";
	
	public void setCarSize(int carSize){
		this.carSize = carSize;
	}
	
	public int getCarSize(){
		return carSize;
	}
	
	public static void carProperty(){
		System.out.println("Car size: " + carSize +" "+"Car color : "+color );
	}
	

}
