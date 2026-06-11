package wrapper;

//import java.util.Scanner;

public class w2 {
	static boolean isPrime(int num) {
//		isCircular(num);
		if(num <= 1) {
			return false;
		}
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				return false;
			}
			else return true;
		}
		return true;
	}
	static boolean isCircular(int n){
		int num = n;
		int count = 0;
		int temp = num;
		while(n != 0) {
			n = n / 10;
			count++;
		}
		
		while(num != 0) {
			int power = (int) Math.pow(10, count-1);
			temp = (temp % power) * 10 + temp / power;
		}
		
		for(int i = 1; i <= count; i++ ) {
			if(isPrime(num) == false) {
				return false;
			}
			else {
				return true;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int num = 719;
//		isCircular(num);
		if(isCircular(num)) {
			System.out.println("Circular Prime No");
		}
		else {
			System.out.println("Not Circular Prime No");
		}
	}
}


