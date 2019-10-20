package demo;

public class Calculator {

	public static void add(int a, int b) { // add() is a method, a and b are formal parameters
		System.out.println(a + b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
		System.out.println("Subtract method");
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(double a, double b) {
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		add(20,10);
	}

}
