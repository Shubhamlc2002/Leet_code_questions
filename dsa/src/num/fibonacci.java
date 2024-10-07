package num;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a1 =sc.nextInt();
		int a =0;
		int b =1;
		int c=1;
		for(int i=0;i<a1;i++) {
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}

	}

}
