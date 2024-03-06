package com.kh.Test240122;
//다음과 같은 코드를 실행했을 때 예시와 같은 결과가 출력되도록 TV 클래스 작성
//TV myTV = new TV("삼성", 2020, 65)
//myTV.show();
//=> 삼성에서 만든 2020년형 65인치 TV

public class TV {

	private String brand;
	private int version;
	private int size;
	private int price;
	
	public TV(String brand, int version, int size, int price) {
		this.brand = brand;
		this.version = version;
		this.size = size;
		this.price = price;
	}
		
		public int getprice() {
			return this.price;
		}
		
		public void setprice(int price) {
			this.price = price;
		}
		
		public void show() {
			System.out.println(brand + "에서 만든 " + version + "형 " + size + "인치 TV");
		}
		
	}
