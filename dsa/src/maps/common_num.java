package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class common_num {

	public static void main(String[] args) {
		int a []= {1,3,6,8,3,34,67,23};
		Set <Integer> hs= new HashSet<>();
		int b[]= {1,5,2,8,0,24,65,34,6};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					hs.add(a[i]);
					
				
					
				}
			}
		}
		System.out.println(hs.size());

	}

}
