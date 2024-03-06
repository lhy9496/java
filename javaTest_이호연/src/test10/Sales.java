package test10;

public class Sales extends Employee implements Bonus{
	
	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public double tax() {
		double tax = this.getSalary() * 0.13;
		return tax;
	}
	
	public void incentive(int pay) {
		this.setSalary(getSalary() + (int)(pay * 1.2));
	}
	
}
