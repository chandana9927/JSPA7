package javaPrograms;

class Tester3{
	int r = 34;
		void disp() {
			System.out.println("Hi, this is disp");
		}
}

class Tista1 extends Tester3{
	void uliya() {
		System.out.println("Helloooooooooo");
	}
}

public class MainClass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester3 t1 = new Tista1();
		System.out.println(t1.r);
		t1.disp();
		Tista1 ti1 = (Tista1) t1;
		ti1.uliya();
		ti1.disp();
		System.out.println(ti1.r);
	}

}
