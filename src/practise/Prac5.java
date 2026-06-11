package practise;

public class Prac5 {
	//palindrome
	public static void main(String[] args) {
		int n = 4224;
		int n1 = n;
		int rev = 0;
		for(int i = n; n != 0; i--) {
			int rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		if(n1 == rev) {
			System.out.println("is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
	
}
