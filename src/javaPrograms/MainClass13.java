package javaPrograms;

class Cola13{
	int f = 354;
	void disp() {
		System.out.println("This is disp");
	}
}

class Chungacha12 extends Cola13{
	int d = 67;
}

public class MainClass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola13 c1 = new Chungacha12();
		c1.disp();
		System.out.println(c1.f);
		Chungacha12 ch1 = (Chungacha12) c1;
		System.out.println(ch1.d);
		ch1.disp();
		System.out.println(ch1.f);
	}

}
