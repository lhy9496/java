import java.util.ArrayList;
import java.util.List;

public class ArrayListRun {
	/*
	 * 컬렉션이란
	 * 자료구조 개념이 내장되어 있는 클래스. 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다.
	 * 
	 *  - 자료구조 : 방대한 데이터를 보다 효율적으로 관리(추가, 삭제, 조화, 정렬, 수정)할 수 있도록 도와주는 개념
	 *  - 프레임워크 : 이미 만들어져 있는 틀(뼈대)
	 *  
	 *  * 배열의 단점과 컬렉션의 장점
	 *  > 배열의 단점
	 *  	1. 배열은 크기를 지정해야 한다. = 한 번 크기를 지정하면 변경할 수 없다.
	 *  	   새로운 값을 더 추가하고자 한다면 새로운 크기의 배열을 만들고 기존의 값을 전부 복사하는 코드를 작성해야 한다.
	 *  
	 *  	2. 배열 중간 위치에 값을 추가하거나 삭제하는 경우, 값을 이동시키는 복잡한 코드를 직접 작성해야 한다.
	 *  
	 *  	3. 한 공간에 한 타입의 데이터들만 저장이 가능하다.
	 *  
	 *  > 컬렉션의 장점
	 *  	1. 크기 제약이 없다. => 크기를 지정하지 않아도 되며, 크기를 지정했어도 더 많은 데이터들이 들어오면 그만큼 사이즈가 늘어난다.
	 *  
	 *  	2. 중간에 값을 추가 또는 삭제할 경우, 값을 이동시키는 작업(알고리즘)을 직접 기술할 필요가 없다.
	 *  
	 *  	3. 한 공간에 여러 타입의 데이터들을 저장할 수 있다(단, 객체만 가능)
	 *  	   한 타입만 담도록 제한할 수도 있음(제네릭 사용 가능)
	 *  
	 *  * 방대한 데이터들을 단지 보관만 해두고 조회만 할 경우, 배열을 많이 사용한다.
	 *  * 방대한 데이터들을 보관, 추가, 삭제 등 수정하는 작업이 빈번할 경우, 컬렉션을 많이 사용한다.
	 *  
	 */
	
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(3); //크기 지정은 자유
		
		System.out.println(list);
		
		// E --> Element : 리스트에 담긴 데이터(요소)
		
		// 1. add(E e) : 리스트 공간 끝에 전달된 데이터를 추가시켜주는 메소드
		list.add(new Music("비의 랩소디", "임재현"));
		list.add(new Music("네모의 꿈", "기억 안남"));
		list.add(new Music("사랑의 인사", "씨야"));
		list.add("끝");
		
		//지정된 크기보다 더 많이 넣어도 오류가 발생하지 않는다. = 장점 1 : 크기 제약 없음
		//다양한 타입의 데이터를 담을 수 있다. = 장점 3 : 여러 타입 보관 가능
		System.out.println(list); // list의 특징 : 순서 유지하면서 담김(0번 인덱스부터 차곡차곡)
		
		// 2. add(int index, E e) : 직접 인덱스를 지정해서 해당 인덱스 위치에 데이터를 추가시켜주는 메소드
		list.add(1, new Music("텔미", "원더걸스"));
		
		//중간 위치에 데이터 추가 시 복잡한 알고리즘 자동 구현 =>장점 2
		System.out.println(list);
		
		// 3. remove(int index) : 해당 인덱스 위치의 데이터를 삭제시켜주는 메소드
		list.remove(1);
		System.out.println(list);
		
		// 4. set(int index, E e) : 해당 인덱스 위치에 데이터를 새로 전달된 e로 수정시켜주는 메소드
		list.set(0, new Music("봄날은 간다", "김건모"));
		System.out.println(list);
		
		// 5. size() : 리스트의 사이즈 반환시켜주는 메소드(즉, 몇 개의 데이터가 담겨있는지)
		System.out.println("리스트의 사이즈 : " + list.size());
		
		// 6. get(int index) : 해당 인덱스 위치의 객체를 반환시켜주는 메소드( = 배열[인덱스]와 같음)
		Music m = (Music)list.get(0);
		String s = (String)list.get(3);
		
		System.out.println(m);
		System.out.println(s);
		System.out.println(list.get(1));
		System.out.println(((Music)(list.get(1))).toString());
		
		// 7. subList(int index1, int index2) : List로부터 추출하여 새로운 List를 반환
		List sub = list.subList(0, 2); // 0부터 2인덱스 전까지
		System.out.println(sub);
		
		//8. addAll(Collection c) : 컬렉션을 통째로 뒤에 추가시켜주는 메소드
		list.addAll(sub);
		System.out.println(list);
		
		//9. isEmpty() : boolea => 컬렉션이 비어있는지 묻는 메소드
		System.out.println(list.isEmpty());
		
		//10. clear() : 전부 비워주는 메소드
//		list.clear();
//		System.out.println(list.isEmpty());
		
		
		System.out.println("============================");
		//반복문을 이용해서 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("============================");
		//for each문 (향상된 for문)
		for(Object e : list) {
			System.out.println(e);
		}
		
	}
}
