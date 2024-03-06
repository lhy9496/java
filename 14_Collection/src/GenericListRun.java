import java.util.ArrayList;

public class GenericListRun {
	public static void main(String[] args) {
		//<Music>으로 제네릭 설정 => E => Music
		ArrayList<Music> list  = new ArrayList<>();
		
		list.add(new Music("봄날은 간다", "김건모"));
		list.add(new Music("빙고", "거북이"));
		
		System.out.println(list);
		
		for(Music tmp : list) {
			System.out.println(tmp);
		}
		
		/*
		 *  * 제네릭<>을 사용하는 이유
		 *  1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 *  2. 컬렉션에 저장된 객체를 열어서 사용할 때 매번 형변환화는 절차를 없애기 위해서	 
		 *  
		 */
	}
}
