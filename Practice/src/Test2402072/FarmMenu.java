package Test2402072;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

//View : 사용자에게 보여지는 시각적인 요소
public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		
		while(true) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.println();
			
			System.out.print("메뉴 번호 입력 : ");
			
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				this.adminMenu();
				break;
			case 2:
				this.customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void adminMenu() {
		while(true) {
			System.out.println("=====***** 직원 메뉴 *****=====");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println();
			
			System.out.print("메뉴 번호 입력 : ");
			
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				this.addNewKind();
				break;
			case 2:
				this.removeKind();
				break;
			case 3:
				this.changeAmount();
				break;
			case 4:
				this.printFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void customerMenu() {
		while(true) {
			System.out.println("현재 KH마트 농산물 수량");
			printFarm();
			System.out.println();
			System.out.println("=====***** 고객 메뉴 *****=====");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println();
			
			System.out.print("메뉴 번호 입력 : ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				this.buyFarm();
				break;
			case 2:
				this.removeFarm();
				break;
			case 3:
				this.printBuyFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void addNewKind() {
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int Fkind = sc.nextInt();
			if (Fkind < 1 || Fkind > 3) {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			
			Farm f = null;
			switch (Fkind) {
			case 1:
				f = new Fruit ("과일" , name);
				break;
			case 2:
				f = new Vegetable ("채소" , name);
				break;
			case 3:
				f = new Nut ("견과", name);
				break;
			}
			if (fc.addNewKind(f, amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void removeKind() {
		
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			int Fkind = sc.nextInt();
			if (Fkind < 1 || Fkind > 3) {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();
			
			Farm f = null;
			switch (Fkind) {
			case 1:
				f = new Fruit ("과일" , name);
				break;
			case 2:
				f = new Vegetable ("채소" , name);
				break;
			case 3:
				f = new Nut ("견과", name);
				break;
			}
			
			if (fc.removeKind(f)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				break;
			} else {
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void changeAmount() {
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			int Fkind = sc.nextInt();
			if (Fkind < 1 || Fkind > 3) {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("수정할 수량 : ");
			int amount = sc.nextInt();
			
			Farm f = null;
			switch (Fkind) {
			case 1:
				f = new Fruit ("과일" , name);
				break;
			case 2:
				f = new Vegetable ("채소" , name);
				break;
			case 3:
				f = new Nut ("견과", name);
				break;
			}
			
			if (fc.changeAmount(f, amount)) {
				System.out.println("농산물 수량이 수정되었습니다.");
				break;
			} else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void printFarm() {
		Iterator entries = fc.printFarm().entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<Farm, Integer> entry = (Map.Entry) entries.next();
			String kind =  entry.getKey().getKind();
			String name = null;
			int amount = entry.getValue();
			if (entry.getKey() instanceof Fruit) {
				Fruit fr = (Fruit)entry.getKey();
				name = fr.getName();
			} else if (entry.getKey() instanceof Vegetable) {
				Vegetable vg = (Vegetable)entry.getKey();
				name = vg.getName();
			} else if (entry.getKey() instanceof Nut) {
				Nut nt = (Nut)entry.getKey();
				name = nt.getName();
			}
			System.out.println(kind + ": " + name + "(" + amount +"개)");
		}
	}
	
	public void buyFarm() {
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매 종류 번호 : ");
			int Fkind = sc.nextInt();
			if (Fkind < 1 || Fkind > 3) {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();

			Farm f = null;
			switch (Fkind) {
			case 1:
				f = new Fruit ("과일" , name);
				break;
			case 2:
				f = new Vegetable ("채소" , name);
				break;
			case 3:
				f = new Nut ("견과", name);
				break;
			}
			
			if (fc.buyFarm(f)) {
				System.out.println("구매에 성공하였습니다.");
				break;
			} else {
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void removeFarm() {
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매 종류 번호 : ");
			int Fkind = sc.nextInt();
			if (Fkind < 1 || Fkind > 3) {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();

			Farm f = null;
			switch (Fkind) {
			case 1:
				f = new Fruit ("과일" , name);
				break;
			case 2:
				f = new Vegetable ("채소" , name);
				break;
			case 3:
				f = new Nut ("견과", name);
				break;
			}
			
			if (fc.removeFarm(f)) {
				System.out.println("구매 취소에 성공하였습니다.");
				break;
			} else {
				System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
			}
		}	
	}
	
	public void printBuyFarm() {
		for(Object o : fc.printBuyFarm()) {
			if (o instanceof Fruit) {
				Fruit fo = (Fruit)o;
				System.out.println(fo.getKind() + ": " + fo.getName());
			} else if (o instanceof Vegetable) {
				Vegetable vo = (Vegetable)o;
				System.out.println(vo.getKind() + ": " + vo.getName());
			} else if (o instanceof Nut) {
				Nut no = (Nut)o;
				System.out.println(no.getKind() + ": " + no.getName());
			}
		}
	}
	
}

