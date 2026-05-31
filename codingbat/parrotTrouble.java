//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
//We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
//Return true if we are in trouble.

package solve_problem;

public class parrotTrouble {
	
	public static boolean trouble(boolean talking, int hour) {
		if(talking && hour > 20) {
			return true;
		}else if (talking && hour < 7) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(trouble(true,8));

	}

}
