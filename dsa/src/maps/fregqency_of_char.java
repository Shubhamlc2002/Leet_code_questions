package maps;

import java.util.HashMap;

//Q find out maximmum frequency of char

public class fregqency_of_char {

	public static void main(String[] args) {
		String s ="shumbmhamchmavamn";
		HashMap <Character ,Integer> hm=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else {
				hm.put(s.charAt(i), 1);
			}
		}
		char ch=s.charAt(0);
		for (Character key :hm.keySet()) {
			if(hm.get(key)>hm.get(ch)) {
				ch=key;
			}
			
		}
		System.out.println(ch);
		
	}

}
