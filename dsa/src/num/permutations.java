package num;

public class permutations {

	public static void main(String[] args) {
		String s="aim na kd klt sk lk an ma tkl ami";
		String data[]=s.split(" ");
		int count=0;
		for (String string : data) {
			
			for (String string2 : data) {
				int sum1=0;
				int sum2=0;
				for(int i=0;i<string.length();i++) {
					sum1+=(int)string.charAt(i);
					
				}
				for(int i=0;i<string2.length();i++) {
					sum1+=(int)string2.charAt(i);
					
				}
				if(sum1==sum2) {
					count++;
				}
				
			}
			
		}
		System.out.println(count/2);

	}

}
