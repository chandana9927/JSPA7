package javaPrograms;

class Sample21{
	void co() {
		System.out.println("This is coo...");
		int r = 24;
		System.out.println(r);
	}
}

class Hahoha extends Sample21{
	void disp() {
		System.out.println("Hi, this is disp");
	}
}

public class MainClass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample21 s1 = new Hahoha();
		s1.co();
		Hahoha h1 = (Hahoha) s1;
		h1.disp();
		h1.co();

	}

}
