package javaPrograms;

class Demo10{
	double z = 253.243;
	int r = 342;
}

class Dumataka3 extends Demo10{
	int x = 67;
}

public class MainClass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo10 d1 = new Dumataka3();
		System.out.println(d1.z);
		System.out.println(d1.r);
		Dumataka3 du1 = (Dumataka3) d1;
		System.out.println(du1.x);
		System.out.println(du1.z);
		System.out.println(du1.r);
	}

}
