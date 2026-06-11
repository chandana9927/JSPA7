package practise;

public class Prac4 {
	//reverse of nos.
	public static void main(String[] args) {
		int rev = 0;
		int no = 1234;
//		while(no != 0) {
//			int rem = no % 10;
//			rev = (rev * 10) + rem;
//			no = no / 10;
//		}
		for(int i = no ; no != 0 ; i--) {
			int rem = no % 10;
			rev = (rev * 10) + rem;
			no = no / 10;
		}
		System.out.println(rev);
	}

}
