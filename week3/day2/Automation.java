package week3.day2;

public class Automation implements TestTool {
	
	public void Selenium() {
		System.out.println("This is Selenium implementation from Automation class");
		
	}

	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.Selenium();
		
		MultipleLangauge obj1 = new MultipleLangauge();
		obj1.Java();
		obj1.javaScript();
		obj1.python();
		obj1.ruby();
	}

	

}
