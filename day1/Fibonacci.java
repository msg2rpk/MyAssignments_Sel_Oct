package week1.day1;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = -1;
		int b = 1;
		
		short n=10; //Fibonacci series count
		
		for(int i =0; i <n ; i++)
		{
			int c = a + b;
			System.out.println(c);
			a=b;
			b=c;
			

	}

}
	
}
