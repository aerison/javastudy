package day08;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("입력");
			}
		};
		
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("삭제");
			}
		};

		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("업데이트");
			}
		};

		Command cmd = null;
		cmd.exec();
		
	
	}

}


interface Command{
	void exec();
}