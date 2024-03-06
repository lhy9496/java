package test10;

public class Secretary extends Employee implements Bonus{
	
	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public double tax() {
		double tax = this.getSalary() * 0.1;
		return tax;
	}
	
	public void incentive(int pay) {
		this.setSalary(getSalary() + (int)(pay * 0.8));
	}

}
