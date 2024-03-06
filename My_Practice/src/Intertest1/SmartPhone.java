package Intertest1;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String maker;
	
	public SmartPhone() {
		this.maker = "";
	}
	
	public abstract String printInformation();
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
}
