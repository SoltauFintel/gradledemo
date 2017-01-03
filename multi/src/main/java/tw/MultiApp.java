package tw;

public class MultiApp {

	public static void main(String[] args) {
		
		System.out.println("MultiApp");
		
		System.out.println(new Multi2().getMessage());
		
		new LibCaller().call();
	}
}
