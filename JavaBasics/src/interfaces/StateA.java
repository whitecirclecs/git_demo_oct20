package interfaces;

public class StateA implements CentralGovtTaxes{
	
	public void electricityTax() {
		System.out.println("Electricity Tax-15%");
	}
	
	public void fuelTax() {
		System.out.println("Fuel Tax - 10%");
	}
	
	public void roadTax() {
		System.out.println("Road Tax - 12%");
	}

}
