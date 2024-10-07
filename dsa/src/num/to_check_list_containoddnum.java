package num;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class to_check_list_containoddnum {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		List<Integer> al=new ArrayList<>();
		for(int i =0;i<a;i++) {
			int b=sc.nextInt();
			al.add(b);
		}
		for (Integer integer : al) {
			if(integer%2==0) {
				System.out.println(false);
				
			}
			else {
				System.out.println(true);
				
			}
				
		}

	}

}
