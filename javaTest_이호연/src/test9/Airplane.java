package test9;

public class Airplane extends Plane{
	
	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		this.setFuelSize(getFuelSize()-(distance * 3));
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
}
