package classNObject;

public class TestHouse {

	public static void main(String[] args) {
		 
		 House myHouse = new House();
		 myHouse.livingRoom();
		 myHouse.setHouseName("Space House");
		 System.out.println(myHouse.getHouseName());
		 
		 Office myOffice = new Office();
		 System.out.println(myOffice.getOfficeName());
		 
		 Calculation calculator = new Calculation();
		 System.out.println(calculator.addition(12, 100));
		 

	}
		
}

