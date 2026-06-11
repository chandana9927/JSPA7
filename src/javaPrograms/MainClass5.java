package javaPrograms;

class Sample2
{
	void co() {
		System.out.println("Hi, this is co");
	}
}

class Guleyluu extends Sample2{
	void disp() {
		System.out.println("Hi this is disp");
	}
}

public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s1 = new Guleyluu();
		s1.co();
		Guleyluu g1 = (Guleyluu) s1;
		g1.disp();
		g1.co();

	}

}
