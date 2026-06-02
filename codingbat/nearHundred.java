//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the 
//absolute value of a number.


package solve_problem;

public class nearHundred {
	
	public static boolean hundred(int n) {
		int num = 100;
		int numb = 200;
		if(Math.abs(num - n) <= 10 || Math.abs(numb - n) <= 10) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		System.out.println(hundred(89));
		System.out.println(hundred(188));

	}

}
