package assignment;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 53;
		int b = 37;
		int c = 78;
		if(a > c && a > b) {
			System.out.println("a is greatest");
		}
		else if(b > c && b > a) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}

	}

}
