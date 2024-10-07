package num;

public class swap_nums {
	public static void main(String[] args) {
		int a =20;
		int b =60;
		System.out.println(nums(a,b));
		
	}
	public static String nums(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A="+a);
		System.out.println("B="+b);
		return "a="+a+"b="+b;
		
	}

}
