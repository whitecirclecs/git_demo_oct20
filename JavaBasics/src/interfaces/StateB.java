package interfaces;

public class StateB implements CentralGovtTaxes {
	
	public void electricityTax() {
		System.out.println("Electricity Tax-10%");
	}
	
	public void fuelTax() {
		System.out.println("Fuel Tax - 5%");
	}
	
	public void roadTax() {
		System.out.println("Road Tax - 7%");
	}
}
