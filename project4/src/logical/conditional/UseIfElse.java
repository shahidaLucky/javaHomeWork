package logical.conditional;

public class UseIfElse {

	public static void main(String[] args) {
		int num =14;
		int range = 19;
		if((num % 2 == 0) || (num>range)){
			System.out.println("Number " + num + " is even and within the range");
		}else{
			System.out.println("Number "+ num + " is odd and may be not within the range");
		}

	}

}
