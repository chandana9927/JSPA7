package wrapper;

import java.util.Scanner;

public class w1 {
	static boolean isPrime(int n) {
		for(int i = 2; i<=n; i++) {
			if(n % i == 0) {
				return false;
				
			}
			else {
				return true;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the Number:");
		int n2 = sc.nextInt();
		int res = n1 - n2;
		res = Math.abs(res);
		if(res == 2 && isPrime(n1) && isPrime(n2)) {
			System.out.println("Is a twin prime number");
		}
		else {
			System.out.println("Is not twin prime");
		}
	}

}
//197
//971
//719-> rev
