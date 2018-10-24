package day06;

public class Account {
		
		private String number; //public 을 붙이면 완전히 오픈된 무보안 권한이 됨
		private String name; // private - 외부에서 접근 불가
		private int money;
		
		public void setMoney(int money) {
			if(money < 0) {
				return;
			}
			this.money = money;
			
		}
		
		public getMoney() {
				return this.money;
			
		}
		
		
		
		
		//입금하다
		
		public void input(int money) {
			System.out.println("입금 : " + money);
			this.money += money;
			
			System.out.println("잔고 :"+ this.money);
		}
		
		//출금하다
		
		public int output(int money) {
			System.out.println("출금 전 잔고 : " + this.money);
			this.money -= money;
			System.out.println("출금 후 잔고 : " + this.money);
			return money;
		}
		
		
		
		
		//------------------------------------------------------------
		
		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		//조회
		public void print() {
			System.out.printf("[계좌번호 %s ( %s ) %d 원]\n",this.number,this.name,this.money);
		}

	}