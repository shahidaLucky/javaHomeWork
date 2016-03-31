package variable;

public class TestComputer {

	public static void main(String[] args) {
		
		Computer dell = new Computer();
		System.out.println("Dell object ram size: "+ dell.getRamSize());
		
		Computer sony = new Computer();
		System.out.println("Sony object ram size: "+sony.getRamSize());
		sony.setRamSize(16);
		System.out.println("Sony object ram size: "+sony.getRamSize());
		
		System.out.println("Dell object ram size: "+ dell.getRamSize());
		
		Mobile lg = new Mobile();
		System.out.println(lg.calculateCPUCapacity());
		
		System.out.println(sony.calculateCPUCapacity());

	}

}
