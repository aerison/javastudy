package day08;

public class PolyArgumentTest2 {
	
	class Product {
		int price;		// 제품 가격
		int bonuspoint;	// 제품 구매 시 제공하는 보너스상수
		
		Product (int price) {
			this.price =price;
			bonuspoint = (int) (price/10.0);
		}
		
		Product() {}		// 기본 생성자
	}
	
	class Tv extends Product {
		Tv() { super(100); }			// 조상클래스의 생성자 Product(int price)를 호출한다
		public String toString() { return "Tv";}
	}
	
	class Computer extends Product {
		Computer() { super(200); }
		public String toString() { return "Audio"; }
	}
	
	class Buyer {									//고객
		int money = 1000;							//소유금액
		int bonuspoint = 0;							//보너스 점수
		Product[] item = new Product[10];			// 구입한 제품을 저장하기 위한 배열
		int i = 0;									// Product 배열에 사용될 카운터
		
		void buy (Product p) {
			if(money < p.price) {
				System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
				return;
			}
			
			money -= p.price;						// 가진 돈에서 구입한 제품의 가격을 뱀
			bonuspoint += p.bonuspoint;				// 제품의 보너스 점수를 추가
			item[i++] = p;							// 제품을 Product[] item 에 저장
			System.out.println(p + "을/를 구입하셨습니다");
		}
		
		void summary() {							// 구매한 물품 요약해서 보여줌
			int sum = 0;							// 구입한 물품의 가격합계
			String itemList = "";					// 구입한 물품 목록
		
		
		//반복문을 이용하여 구입한 물품의 총 가격과 목록을 만듬
		for(int i=0; i<item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ",";
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + " 만원입니다");
		System.out.println("구입한 제품은 " + itemList + " 입니다");
	}
}
	
}
class PolyArgumentTest2 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}
  }
