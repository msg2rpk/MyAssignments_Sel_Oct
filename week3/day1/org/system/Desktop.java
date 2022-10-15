package week3.day1.org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("desktopSize is: 15.6 inch");
	}
	
	public static void main(String[] args) {
		//This is an example of Single Inheritance
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}

}
