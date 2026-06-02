package solve_problem;

public class posNeg {
	
	public static boolean posNe(int a, int b, boolean negative) {
		  if(negative) {
			  return (a<0||b<0);
		  }else {
			  return((a>0&&b<0)||(a<0&&b>0));
		  }
	}

	public static void main(String[] args) {
		System.out.println(posNe(1,-1,false));

	}

}
