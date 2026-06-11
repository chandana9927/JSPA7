package practise;

public class Prac2 {
	public static void main(String[] args) {
		//exponential, base and exponent.
		int b = 2;
		int exp = 10;
		int power = 1;
		for(int i = exp; i > 0; i--) {
			power = power * b;
		}
		System.out.println("Power = " +power);
	}
}
