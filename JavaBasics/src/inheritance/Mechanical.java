package inheritance;

import demo2.Management;

public class Mechanical extends Management {

	int bonus = 10000;

	public static void main(String[] args) {
		Mechanical John = new Mechanical();
		int totalAnnualCompensation = John.annualSalary + John.bonus;
		System.out.println("Total Annual Compensation of John = $ " + totalAnnualCompensation);
		John.day("Monday");
	}

}
