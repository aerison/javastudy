package day08;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("�Է�");
			}
		};
		
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("����");
			}
		};

		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("������Ʈ");
			}
		};

		Command cmd = null;
		cmd.exec();
		
	
	}

}


interface Command{
	void exec();
}