//Given 2 int a and b, return true if one if them is 10 or if their sum is 10.

package solve_problem;

public class makes10 {
	
	public static boolean make10(int a, int b) {
		if(a == 10 || b ==10) {
			return true;
		}else if(a + b == 10) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(make10(10,1));
		System.out.println(make10(2,10));
		System.out.println(make10(5,5));
		System.out.println(make10(5,1));
	}

}
