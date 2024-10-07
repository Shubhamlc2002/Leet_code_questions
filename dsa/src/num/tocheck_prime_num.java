package num;

import java.util.Scanner;

public class tocheck_prime_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	       System.out.println(primenum(a));
		

	}
	public static boolean  primenum(int a) {
		if(a==0||a==1)
			return false;
		if(a==2)
		return true;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0)
				return false;
	
		}
		return true;
			
		
		
		
	}

}
