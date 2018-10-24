package day09;

public class Test03 {
	
	import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
	import java.util.Set;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
		list.add("È«±æµ¿");
		list.add(123);
		list.add("°í±æµ¿");
		list.add('A');
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).charAt(0)+"**");
		}
		System.out.println(list.contains("±æµ¿"));
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
		set.add("È«±âµ¿");
		set.add("È«°Åµ¿");
		set.add("È«±Ðµ¿");
		set.add("È«Áöµ¿");
		set.add("È«¹Ìµ¿");
		
		System.out.println(set);
		for(String data :set) {
			System.out.println("**"+data.charAt(data.length()-1));
	}
		Iterator<String> si = set.iterator();
			
			while(si.hasNext()) {
				String data = si.next();
				if(data.equals("¹Ú±æµ¿")) {
					si.remove();
			}
	}

	System.out.println(set);