package test13;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Inventory {
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;
	
	public Inventory() {
		super();
	}

	public Inventory(String productName, Date putDate, int putAmount) {
		super();
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
		this.inventoryAmount = putAmount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return new Date();
	}

	public void setGetDate(Date getDate) {
		this.getDate = new Date();
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) throws AmountNotEnough{
		this.getAmount = getAmount;
		if (getAmount > getInventoryAmount()) {
			throw new AmountNotEnough("");
		} else {
			this.setInventoryAmount(getInventoryAmount()-getAmount);
		}
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

	@Override
	public String toString() {
		SimpleDateFormat putsdf = new SimpleDateFormat("yyyy년 MM월 dd일 입고");
		SimpleDateFormat getsdf = new SimpleDateFormat("yyyy년 MM월 dd일 출고");
		if (getDate == null) {
			return productName + "\t" + putsdf.format(putDate) + ", " + putAmount + "개, "
					+ getDate + ", " + getAmount + "개, 재고 " + inventoryAmount + "개";
		} else {
			return productName + "\t" + putsdf.format(putDate) + ", " + putAmount + "개, "
					+ getsdf.format(getDate) + ", " + getAmount + "개, 재고 " + inventoryAmount + "개";
		}
	}
	
	
}
