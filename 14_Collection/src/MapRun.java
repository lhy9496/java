import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class MapRun {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		// 계층구조를 보면
		// List 계열, Set 계열의 클래스들은 Collection을 구현한 클래스.
		// => 객체를 추가하고자 할 때 공통적으로 add 메소드를 사용
		
		// Map 계열은 Collection을 구현한 클래스가 아님.
		// => 객체를 추가하고자 할 때 put 메소드를 사용(key + value 세트로 담음)
		
		// 1. put(K key, V value) : Map에 키, 밸류 세트로 추가시켜주는 메소드
		
		hm.put("다이제", new Snack("초코맛", 1000));
		hm.put("칸초", new Snack("단맛", 500));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("먹태깡", new Snack("짠맛", 300));
		
		System.out.println(hm); // {키=밸류, 키=밸류...}
		//저장되는 순서 유지 안 됨. value값이 중복되어도 키값이 중복되지 않는다면 잘 저장됨
		
		hm.put("새우깡", new Snack("매운맛", 600));
		System.out.println(hm);
		//동일한 키값으로 다시 추가하면 value값이 덮어씌워짐. = key가 식별자 역할을 해서 중복된 key값은 공존 불가.
		
		// 2. get(Object key) : V => 해당 key값을 가지는 value값을 반환시켜주는 메소드
		Snack s = (Snack)hm.get("다이제");
		System.out.println(s);
		
		// 3. size() : 담겨있는 객체들의 갯수 반환
		System.out.println(hm.size());
		
		// 4. replace(k key, v value) => 해당 키 값을 찾아서 다시 전달한 value값으로 수정시켜주는 메소드
		hm.replace("먹태깡", new Snack("엄청 짠맛", 600));
		System.out.println(hm);
		
		// 5. remove(Object key) => 해당 키값을 찾아서 그 밸류세트를 삭제시켜주는 메소드
		hm.remove("칸초");
		System.out.println(hm);
		
		// for each 사용 불가
		// Map은 Collection에 해당되지 않으므로 Arraylist도 불가능.
		// Iterator도 List, Set 계열에서만 사용이 가능하므로 불가능
		
		// Map -> Set 변경은 가능
		// 1. keySet()
		
		Set keySet = hm.keySet();
		System.out.println(keySet);
		
		Iterator itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack value = (Snack)hm.get(key);
			System.out.println(key + " : " + value);
		}
		
		// 2. entrySet() = 
		
		Set entrySet = hm.entrySet(); //key + value 세트 집합
		
		Iterator itEntry = entrySet.iterator();
		
//		while(itEntry.hasNext()) {
//			Entry entry = (Entry)itEntry.next(); //
//			
//			String key = (String)entry.;
//			Snack value = (Snack)entry.);
//			
//			System.out.println(key + " : " + value);
//		
//		}
		
		Properties prop = new Properties();
		Properties prop2 = new Properties();
		
		//Map 계열이기 때문에 put 메소드를 이용해서 key+value 세트로 담는다.
		
//		prop.put("다이제", new Snack("초코맛", 1000));
//		prop.put("칸초", new Snack("단맛", 500));
//		prop.put("새우깡", new Snack("짠맛", 500));
		prop.setProperty("list", "ArrayList");
		prop.setProperty("set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		System.out.println(prop.get("새우깡"));
		
		//Properties 사용하는 경우는 주로 Properties에 담긴 것들을 파일로 출력 또는 입력받아올 때 사용
		//즉, Properties에서 제공하는 store(), load() 등의 메소드를 사용하기 위해서 사용
		
		try {
			//store : Properties에 담겨 있는 key-value값들을 파일형태로 저장할 때 사용하는 메소드
			prop.store(new FileOutputStream("test.properties"),"propertiesTest");
			//ClassCastException
			//내부적으로 store 실행 시 properties에 담겨있는 키+밸류 세트들을 String으로 형변환해서 출력
			
			//storeToXML : Properties에 담겨있는 key-value값들을 xml파일 형태로 저장할 때 사용하는 메소드
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
			//load : 파일로부터 정보를 읽어온다.
			prop2.load(new FileInputStream("test.properties"));
			System.out.println(prop2);
			
			//loadFromXML : xml파일로부터 정보를 읽어온다.
			prop2.loadFromXML(new FileInputStream("test.xml"));
			System.out.println(prop2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 *  properties파일을 사용하는 이유
		 *  프로그램상에 필요한 기본 환경설정(서버의 ip주소, dbms경로...)관련한 구문을 기술할 것이다.
		 *  => 모두 문자열이기 때문에 개발자가 아닌 일반인 관리자가 해당 문서를 수정하기 쉽다
		 *  
		 *  xml파일 
		 */
	}
}
