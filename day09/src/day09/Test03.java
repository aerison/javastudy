package day09;

public class Test03 {
	
	import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
	import java.util.Set;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add(123);
		list.add("��浿");
		list.add('A');
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).charAt(0)+"**");
		}
		System.out.println(list.contains("�浿"));
		//list.clear();
		list.remove(2);
		System.out.println(list);
		
		Iterator<String> li = list.iterator();
		while(li.hasNext()) {
			String data = li.next();
			System.out.print(data+" , ");
		}
		
		System.out.println("------------- Set -----------");
		
		Set<String> set = new HashSet<String>();
		set.add("ȫ�⵿");
		set.add("ȫ�ŵ�");
		set.add("ȫ�е�");
		set.add("ȫ����");
		set.add("ȫ�̵�");
		
		System.out.println(set);
		for(String data :set) {
			System.out.println("**"+data.charAt(data.length()-1));
	}
		Iterator<String> si = set.iterator();
			
			while(si.hasNext()) {
				String data = si.next();
				if(data.equals("�ڱ浿")) {
					si.remove();
			}
	}

	System.out.println(set);