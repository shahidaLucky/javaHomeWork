package API;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {
		int [] array = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number: ");
		
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
		}
		sc.close();
		for(int j=0; j<array.length; j++){
		  System.out.println(array[j]);
		}

	}

}
