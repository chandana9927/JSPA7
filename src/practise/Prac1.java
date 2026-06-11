package practise;

//perfect numbers. factors of a no. summed together
//Gotta redo perfect nos.
public class Prac1 {
	public static void main(String[] args) {
		int n = 6;
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
		if(n == sum) {
			System.out.println(n + " is Perfect no");
		}
		else {
			System.out.println(n + " is Not perfect");
		}
	}
}
