package classNObject;

public class House {
	
	int houseNo = 32;
	static String houseName = "";
	
	
	public void livingRoom(){
		System.out.println("Watch TV--->Game Of Thrones");
	}
	
	public void setHouseName(String houseName){
		this.houseName = houseName;
	}
	
	public String getHouseName(){
		return houseName;
	}

}
