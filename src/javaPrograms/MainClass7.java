package javaPrograms;

class Tester1{
	int x = 35;
	void disp() {
		System.out.println("Display x "+ x);
	}
}

class Huliyacha extends Tester1{
	void ho() {
		System.out.println("Hi, this is Hooooo....");
	}
}

public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester1 t1 = new Huliyacha();
		System.out.println(t1.x);
		t1.disp();
		Huliyacha h1 = (Huliyacha)t1;
		h1.ho();
		h1.disp();
		System.out.println(h1.x);

	}

}
