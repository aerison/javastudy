package day08;

public class PolyArgumentTest2 {
	
	class Product {
		int price;		// ��ǰ ����
		int bonuspoint;	// ��ǰ ���� �� �����ϴ� ���ʽ����
		
		Product (int price) {
			this.price =price;
			bonuspoint = (int) (price/10.0);
		}
		
		Product() {}		// �⺻ ������
	}
	
	class Tv extends Product {
		Tv() { super(100); }			// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�
		public String toString() { return "Tv";}
	}
	
	class Computer extends Product {
		Computer() { super(200); }
		public String toString() { return "Audio"; }
	}
	
	class Buyer {									//����
		int money = 1000;							//�����ݾ�
		int bonuspoint = 0;							//���ʽ� ����
		Product[] item = new Product[10];			// ������ ��ǰ�� �����ϱ� ���� �迭
		int i = 0;									// Product �迭�� ���� ī����
		
		void buy (Product p) {
			if(money < p.price) {
				System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
				return;
			}
			
			money -= p.price;						// ���� ������ ������ ��ǰ�� ������ ��
			bonuspoint += p.bonuspoint;				// ��ǰ�� ���ʽ� ������ �߰�
			item[i++] = p;							// ��ǰ�� Product[] item �� ����
			System.out.println(p + "��/�� �����ϼ̽��ϴ�");
		}
		
		void summary() {							// ������ ��ǰ ����ؼ� ������
			int sum = 0;							// ������ ��ǰ�� �����հ�
			String itemList = "";					// ������ ��ǰ ���
		
		
		//�ݺ����� �̿��Ͽ� ������ ��ǰ�� �� ���ݰ� ����� ����
		for(int i=0; i<item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ",";
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + " �����Դϴ�");
		System.out.println("������ ��ǰ�� " + itemList + " �Դϴ�");
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