package API;

import java.util.Random;

public class UseRandom {

	public static void main(String[] args) {
		
		Random rm = new Random();
		int [] array = new int [1000000];
		for(int i=0; i<array.length; i++){
		   array[i] = rm.nextInt(10000);
		}
		
		for(int j=0; j<array.length; j++){
			System.out.println(array[j]);
		}

}
