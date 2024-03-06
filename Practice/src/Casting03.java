
public class Casting03 {
	public static void main(String[] args) {
//		선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+-*/)와 형변향을 이용해
//		다음과 같은 값이 나오도록 코드를 작성하라
		
		int inum1 = 10;
		int inum2 = 4;
		
		float fnum = 3.0f;
		
		double dnum = 2.5;

		char ch = 'A';
		
		System.out.println((int)dnum); //2
		System.out.println(inum1/inum2); //2
		
		System.out.println((float)inum1); //10.0
		System.out.println(inum2*dnum); //10.0
		
		System.out.println(((float)inum1)/((float)inum2)); //2.5
		System.out.println((float)dnum); //2.5

		System.out.println((int)fnum); //3
		System.out.println((int)(inum1/fnum)); //3
		System.out.println(inum1/fnum); //3.3333333
		System.out.println(((double)inum1)/fnum); //3.3333333333333335
		
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65
		System.out.println(ch+inum1); // 75
		System.out.println((char)(ch+inum1)); //'K'

	}
}
