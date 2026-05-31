//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


package solve_problem;

public class difference {
	
	public static int diff21(int n) {
		if(n <=21) {
			int diff = 21 - n;
			return diff;
		}else {
			 int diff = (n - 21) * 2;
			 return diff;
		 }
		}

	public static void main(String[] args) {
		System.out.println(diff21(22));

	}

}
