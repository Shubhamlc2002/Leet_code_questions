package maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class common_char {

	public static void main(String[] args) {
		String a ="shubham";
		String b ="chavan";
		ArrayList <Character>al=new ArrayList<>();
		Set <Character> c= new HashSet<>();
		for(int i=0;i<a.length();i++) {
			al.add(a.charAt(i));
			
		}
		for(int i=0;i<b.length();i++) {
			if(al.contains(b.charAt(i))) {
				c.add(b.charAt(i));
				
			}
		}
		System.out.println(c);
	
		

	}

}
