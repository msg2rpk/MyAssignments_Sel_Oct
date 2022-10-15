package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("From AxisBank class - deposit");
	}
	
	public static void main(String[] args) {
		
		AxisBank abObj = new AxisBank();
		abObj.deposit();
		
		abObj.saving();
		abObj.fixed();
	}

}
