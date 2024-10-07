package dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class removeleadingzeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		ArrayList<Integer> al= new ArrayList<>(a);
		for(int i=0;i<a;i++) {
			al.add(sc.nextInt());
		}
		System.out.println(al);
	
	}

}
