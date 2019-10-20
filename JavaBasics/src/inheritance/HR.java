package inheritance;

import demo2.Management;

public class HR extends Management {

	

	int bonus = 12000;
	
	public static void main(String[] args) {
		HR Tim = new HR();
		int totalAnnualCompensation = Tim.annualSalary + Tim.bonus;
		System.out.println("Total Annual Compensation of Tim = $ " + totalAnnualCompensation);
		Tim.day("Monday");
	}

}
