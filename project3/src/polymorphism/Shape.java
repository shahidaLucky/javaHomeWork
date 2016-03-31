package polymorphism;

public class Shape {
	
	public int areaOfLand(int a, int b, int c){
		int total = a + b + c;
		
		return total;
	}
	public int areaOfLand(int a, int b, String name){
		int total = a + b;
		
		return total;
	}
	
	public int areaOfLand(int a, int b, int c, int d){
		int total = a + b + c + d;
		
		return total;
	}
	public int areaOfLand(int a, int b, int c, int d, int e){
		int total = a + b + c + d + e;
		
		return total;
	}

}
