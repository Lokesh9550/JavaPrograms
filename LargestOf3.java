package labprograms;

public class LargestOf3 {

	public static void main(String[] args) {
		// Bigger of among three numbers
	
//			declaring three variables integer type a,b,c initialized values
				int a,b,c;
				a=100;
				b=120;
				c=98;
				//comparing values by using if else condition
				if(a>b) {
					if(a>c) {
						System.out.println(a+" is Largest");
					}
					else {
						System.out.println(c+" is Largest");
					}
				}
				else {
					if(b>c) {
						System.out.println(b+" is Largest");
					}
					else {
						System.out.print(c+" is Largest");
					}
				}

			}
	}