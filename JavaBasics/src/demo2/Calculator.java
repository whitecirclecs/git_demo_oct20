package demo2;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(20, 5);
		obj.add(10, 5, 20);
	}

}
