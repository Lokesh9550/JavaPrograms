package labprograms;

public class CheckTriangle {

	public static void main(String[] args) {
		// to check triangle or not
		int firstAngle =60;
		int secondAngle=60;
		int thirdAngle=60;
		int totalAngle =firstAngle+secondAngle+thirdAngle;
		if(totalAngle==180) {
			System.out.println("It is a Triangle");
		}
		else {
			System.out.println("It is not a Triangle");
		}

	}

}