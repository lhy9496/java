
public class Operator02 {
	/*
	 * 증감연산자
	 * ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
	 * 		++변수, 변수++
	 * -- : 변수에 담긴 값을 1 감소시켜주는 연산자
	 * 		--변수, 변수--
	 * (증감연산자)변수 : 전위연산 → 증감적용하고 출력
	 * 변수(증감연산자) : 후위연산 → 출력하고 증감적용
	 */
	public static void main(String[] args) {
		int num1 = 0;
				
		System.out.println(num1++);//	0(1)
		System.out.println(--num1);//	0(0)
		System.out.println(--num1);//	-1(-1)
		System.out.println(num1--);//	-1(-2)
		System.out.println(num1++);//	-2(-1)
		System.out.println(++num1);//	0(0)
		System.out.println(++num1);//	1(1)
		System.out.println(num1++);//	1(2)
		//num1의 최종값 2
	}
}
