package maps;

import java.util.HashSet;
import java.util.Set;

public class Commom_char {

	public static void main(String[] args) {
		String s ="shuxbham";
		String s1="chavanx";
		Set <Character> c= new HashSet<>();
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s1.length();j++) {
				if(s.charAt(i)==s1.charAt(j)) {
					c.add(s.charAt(i));
					
					
				}
			}
		}
		for (Character character : c) {
			System.out.print(character+",");			
		}

	}

}
