package javaPrograms;


interface Hope {
	void disp();
	void cool();
}

class Urban implements Hope{
	public void disp() {
		System.out.println("Hello");
	}
	public void cool() {
		System.out.println("Bye");
	}
}

public class Inty {
	public static void main(String[] args) {
		Urban u1 = new Urban();
		u1.disp();
		u1.cool();
	}
}
