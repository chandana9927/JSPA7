package practise;

public class StaticToNonStatic {
	static int disp() {
//		int x = 12;
		int y = 13;
		int x = y * y;
		return x;
	}
	void test(int y) {
		int ans = 25 + 13;
		System.out.println("This is test");
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		disp();
		//test method object creation.
		StaticToNonStatic s1 = new StaticToNonStatic();
		s1.test(35);

	}

}
