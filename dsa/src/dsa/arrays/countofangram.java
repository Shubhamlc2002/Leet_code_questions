package dsa.arrays;



import java.util.HashSet;
import java.util.Scanner;

public class countofangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		
		
		int count=0;
		
		String data[]=str.split(" ");
		HashSet <String> set= new HashSet<>();
		for (String string : data) {
			set.add(string);
		}
		
		for (String string : set) {
			for (String string2 : set) {
				if(!string.equalsIgnoreCase(string2)) {
					//System.out.println();
				if(string.length()==string2.length()) {
					//System.out.println("String="+string+"String2="+string2);
					int sum=0;
					int sum1=0;
					for(int i=0;i<string.length();i++) {
						
						 sum=sum+(int)string.charAt(i);
						
						//System.out.println("sum of String ="+sum);
					}
					for(int i=0;i<string2.length();i++) {
						sum1=sum1+(int)string2.charAt(i);
						//System.out.print("sum of string 2:-"+sum1);
					}
					System.out.println(sum+"and"+sum1);
					if(sum==sum1) {
						System.out.println("String1:-"+string+"String2:-"+string2);
						count++;
					}
					
				}
					
				}
				
			}
			
		}
		int count1=count/2;
		System.out.println(count1);
	}

}