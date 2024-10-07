package dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class countOfSamenum {

	public static void main(String[] args) {
		int a []= {1,2,3,2,8,4,1,5,7};
		int b[]= {3,8,9};
		Set<Integer>data= new HashSet<>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					data.add(a[i]);
					
				
				}
				
			}
		}
System.out.println(data);
	}

}
