package assignment;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 67;
		int b = 34;
		int c = 36;
		
		if(a < c && a < b) {
			System.out.println("a is smallest");
		}
		else if(b < c && b < a) {
			System.out.println("b is smallest");
		}
		else {
			System.out.println("c is smallest");
		}

	}

}
