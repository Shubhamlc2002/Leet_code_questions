package dsa.arrays;

import java.util.Scanner;

public class removeduplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b[]=new int[a];
       for(int i=0;i<a;i++) {
    	  
    	   System.out.print("Enter num "+i+"= " );
    	   b[i]=sc.nextInt();
       }
       for(int i=0;i<b.length;i++) {
    	  for(int j=i+1;j<b.length;j++) {
    		  if(b[i]==b[j]) {
    			  System.out.println(b[i]);
    		  }
    	  }
       }
	}

}
