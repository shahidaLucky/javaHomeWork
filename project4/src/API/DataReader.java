package API;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
	
		String path = "C:\\Users\\rrt\\Documents\\core_java\\SeleniumMarch2016\\sample.txt";
		
		FileReader fr = null ;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			System.out.println("Hey ! file is not found, verify the path");
			e.printStackTrace();
		}
		
		br = new BufferedReader(fr);
		String text = "";
		try {
			while((text = br.readLine())!=null){
				
				System.out.println(text);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		finally{
			
		try {
			if(fr!=null){
			fr.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
		if(br!=null){
				br.close();
		}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//end of finally
	 }
}
