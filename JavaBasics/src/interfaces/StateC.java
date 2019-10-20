package interfaces;

public class StateC implements CentralGovtTaxes {
	
	public void electricityTax() {
		System.out.println("Electricity Tax-25%");
	}
	
	public void fuelTax() {
		System.out.println("Fuel Tax - 20%");
	}
	
	public void roadTax() {
		System.out.println("Road Tax - 22%");
	}
}
