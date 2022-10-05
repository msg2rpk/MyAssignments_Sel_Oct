package week1.day2;

public class CarWithObject {
	
	public void printCarName()
	{
		System.out.println("Mahindra Thar");	
	}
	
	private short getRegNumber()
	{
	short RegNo = 7777;
	return RegNo;
	}
	
	public String getColor() {
		return "Napoli Black";
	}
	
	public int addThreeNum(int x, int y, int z)
	{
		int a = x + y + z;
		return a;
	}
	
	
	public int subTwoNum(int x, int y)
	{
		int z = x - y;
		return z;
	}
	
	public float multiplyThreeNum(float x, float y, float z)
	{
		float a = x*y*z;
		return a;
	}
	
    public int divideTwoNum(int a, int b)
    {
    	int z= a/b;
    	return z;
    }

	
	private boolean isCarPuncture()
	{
		return false;
	}
	
	public static void main(String[] args) {
		CarWithObject obj1 = new CarWithObject();
		
		obj1.printCarName();
		
		System.out.println("Car Reg No: " +obj1.getRegNumber());
		System.out.println("Car color is: " +obj1.getColor());
		System.out.println("Car Puncture status is: " +obj1.isCarPuncture());
		
		
		System.out.println("Addition:" +obj1.addThreeNum(9, 8 , 7));
		System.out.println("Subtraction:" +obj1.subTwoNum(9, 3));
		
		System.out.println("Multiplication " +obj1.multiplyThreeNum(10.01f, 3.0201101f , 3.03f));
		System.out.println("Division " +obj1.divideTwoNum(19, 3));
		
	}

}
