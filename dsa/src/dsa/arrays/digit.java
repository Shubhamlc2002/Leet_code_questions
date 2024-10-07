package dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class digit {

	public static void main(String[] args) {
	int a =4613;
	List<Integer>al = new ArrayList<>();
	int reverse=0;
	while(a>0) {
		int b =a%10;
		 reverse=reverse*10+b;
		 a=a/10;
		
		
	}
	System.out.println(reverse);

	}

}
