
public class Conversion {
	/*
	 * 형변환
	 * 자료형을 다른 자료형으로 변환해주는 것
	 * 
	 * 값처리 원칙
	 * 대입연산시 같은 자료형만 대입이 가능하다.
	 * 일반 연산시 같은 종류의 자료형으로만 연산이 가능하다.
	 * 두가지 이상의 자료형을 연산시 결과는 한가지 자료형으로 나와야 한다.
	 * 
	 * 자동 형변환
	 * 두개 이상의 자료형을 연산할 때, 하나의 자료형으로 일치시켜야 연산이 가능하다.
	 * 하여 데이터 손실이 적은 방향으로 컴파일러가 직접 형변환을 해주는 것
	 * 
	 * 강제 형변환
	 * 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환하는 것
	 * 자동으로 컴파일러가 해주지 않기 때문에 프로그래머가 명시적으로 진행한다.
	 * → 데이터의 손실을 감수하고 강제 변환
	 */
	public static void main(String[] args) {
		double pi = 3.1415;
		int wholeNumber = (int)pi;
		
		System.out.println(pi);
		System.out.println(wholeNumber);
		//실수인 pi가 정수 wholeNumber로 변환되면서 소숫점 아래가 삭제됨
		
		long num1 = 3000000007L;
		int num2 = (int)num1;
		
		System.out.println(num1);
		System.out.println(num2);
		//int로 표기 가능한 범위 밖의 변수인 num1이 int로 변환되면서
		//부호에 해당하는 자릿수가 영향을 받음
		
		short num3 = 1;
		short num4 = 2;
		short num5 = (short)(num3 + num4);
		// +로 연산하는 과정에서 int로 변환되기 때문에 (short)를 넣어서
		// short인 num5에 대입할 수 있도록 다시 변환시켜야 힌다.
		
		System.out.println(num3 + " , " +  num4);
		System.out.println(num5);
	}
}
