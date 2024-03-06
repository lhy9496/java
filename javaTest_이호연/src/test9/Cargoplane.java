package test9;

public class Cargoplane extends Plane{
	
	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		this.setFuelSize(getFuelSize()-(distance * 5));
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
