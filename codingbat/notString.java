package solve_problem;

public class notString {
	public static String noString(String str) {
		if(str.startsWith("not")) {
			return str;
		}else {
			return "not " +str;
		}
		  
	}


	public static void main(String[] args) {
		System.out.println(noString("not java"));

	}

}
