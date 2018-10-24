package day09;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee<String,String> emp1 = new Employee("홍길동", "001");
		System.out.println(emp1.NAME.CHARaT(0)+"**");

		Employee<String,Integer> emp2 = new Employee("고길동", "20");
		System.out.println(emp2.NAME.CHARaT(0)+"**");
		
		Employee emp3 = new Employee("A", 20);
		if(emp3.name instanceof String)
		System.out.println(((String)emp3.name).charAt(0)+"**");
	}

}

class Employee<V,T> {
	V name;
	T number;
	
	
	
	public V getName() {
		return name;
	}

	public void setName(V name) {
		this.name = name;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}

	public Employee(String name, T number) {
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Employee [name= " + name + ", number= " + number + "]
	}
	
}
