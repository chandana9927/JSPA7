package javaPrograms;

class Demo{
	int x = 90;
}

class PemoCha extends Demo{
	void ho() {
		System.out.println("This is ho");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------UpCasting--------");
		Demo d1 = new PemoCha();
		System.out.println(d1.x);
		System.out.println("-------DownCasting------");
		PemoCha p1 = (PemoCha) d1;
		p1.ho();
		System.out.println(p1.x);

	}

}
