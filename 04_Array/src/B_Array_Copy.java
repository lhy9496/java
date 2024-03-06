import java.util.Arrays;

public class B_Array_Copy {
	public static void main(String[] args) {
		
		// 배열 복사
		/*
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("=== 원본 배열 출력 ===");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		System.out.println();
		
		// 단순하게 origin을 다시 대입시킨 copy 배열 세팅
		
		int[] copy = origin;
		System.out.println("=== 복사본 배열 출력===");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		System.out.println();
		
		copy[2] = 99;
				
		System.out.println("---------- 복사본 배열 값 변경 후 ----------");
		
		System.out.println("=== 원본 배열 출력 ===");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		System.out.println();
		
		System.out.println("=== 복사본 배열 출력===");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		System.out.println();
		
		// copy의 값만을 수정해도 원본의 값이 변경됨
		// copy, origin 둘 다 같은 곳을 참조하고 있기 때문(메모리 주소값이 같음
		// 얕은 복사 : 주소값을 복사
		 */
		/*
		 * 얕은 복사의 문제점을 해결하기 위한 방법 : 깊은 복사
		 * 
		 
		
		// 	1.	for문 활용
		// 		새로운 배열을 만들고 반복문을 통해 원본 배열의 값들을 일일이 대입
		
		int[] origin2 = {1, 2, 3, 4, 5};
		
		int[] copy2 = new int [5];
			for(int i = 0; i < origin2.length; i++) {
				copy2[i] = origin2[i];
			}
			System.out.println("=== 원본 배열 출력 ===");
			for(int i = 0; i < origin2.length; i++) {
				System.out.print(origin2[i]+ " ");
			}
			System.out.println();
			
			System.out.println("=== 복사본 배열 출력===");
			for(int i = 0; i < copy2.length; i++) {
				System.out.print(copy2[i]+ " ");
			}
			System.out.println();
			
			copy2[2] = 99;
					
			System.out.println("---------- 복사본 배열 값 변경 후 ----------");
			
			System.out.println("=== 원본 배열 출력 ===");
			for(int i = 0; i < origin2.length; i++) {
				System.out.print(origin2[i]+ " ");
			}
			System.out.println();
			
			System.out.println("=== 복사본 배열 출력===");
			for(int i = 0; i < copy2.length; i++) {
				System.out.print(copy2[i]+ " ");
			}
			System.out.println();
		
		 
		
		//	2.	새로운 배열 생성 후 arraycopy() 메소드를 이용해서 복사하기
		int[] origin3 = {1, 2, 3, 4, 5};
		int[] copy3 = new int [10]; //0~9번 인덱스의 모든 값이 0으로 초기화
		
		// System.arraycopy(원본 배열, 복사시작할 인덱스, 복사본 배열, 복사본 배열의 복사 시작 인덱스, 복사할 갯수)
		System.arraycopy(origin3, 2, copy3, 0, 3);
		for(int i=0; i < copy3.length; i++) {
			System.out.print(copy3[i] + " ");
			
		
		//	3.	Arrays클래스에서 제공하는 copyOf()메소드 이용
		int[] origin4 = {1, 2, 3, 4, 5};
		
		//		복사본 배열 = Arrays.copyOf(원본배열명, 복사할 길이);
		int[] copy4 = Arrays.copyOf(origin4, 5);
		
		origin4[1] = 44;
		
		for(int i=0; i < copy4.length; i++) {
			System.out.print(copy4[i] + " ");
		}
		*/
		/*
		 * Arrays.copyOf 메소드
		 * => 내가 제시한 길이만큼 복사본 배열 크기 할당
		 * =>단. 내가 제시한 길이가 원본배열의 크기보다 클 경우 기존의 배열에 있는 값 다 0으로 채움
		 */
		//	4.	clone() 메소드 활용한 복사
		//인덱스 및 크기 지정불가
		int[] origin5 = {1, 2, 3, 4, 5};
		int[] copy5 = origin5.clone() ;
		
		origin5[1] = 44 ;
		for(int i=0; i < copy5.length; i++) {
			System.out.print(copy5[i] + " ");
		}
	}
	
	
}
