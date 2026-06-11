package practise;

public class Prac3 {
	public static void main(String[] args) {
		//prime numbers....
		//need to practise
		int no = 97;
		int flag = 1;
		for(int i = 2; i < no; i++) {
			if(no % i == 0) {
				flag = 0;
				break;
			}
		}
		if(flag == 1) {
			System.out.println(no + " is a prime no");
		}
		else
			System.out.println(no + " is not prime");
	}
}
