package solve_problem;

public class missingChar {
	
	public static String missingChar(String str, int n) {
		return str.substring(0,n)+str.substring(n+1);
		  
	}

	public static void main(String[] args) {
		System.out.print(missingChar("raghul",2));

	}

}
