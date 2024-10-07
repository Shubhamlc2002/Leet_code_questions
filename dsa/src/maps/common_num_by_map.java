package maps;

import java.util.HashMap;

public class common_num_by_map {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		int b []= {2,5,7,8,9,0,1,7,7};
		HashMap<Integer,Integer> hm= new HashMap<>();
		for (int i : a) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}
			else {
				hm.put(i, 1);
			}
		}
		for (int i : b) {
			if(hm.containsKey(i)) {
				System.out.println("num:-"+i);
				hm.remove(i);
			}
			
		}
		

	}

}
