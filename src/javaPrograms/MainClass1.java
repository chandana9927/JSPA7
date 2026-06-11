package javaPrograms;

class Sample{
	void disp() {
		System.out.println("Hi this is display");
	}
}

class Ampules extends Sample{
	void tata() {
		System.out.println("Hi this is tata");
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------UpCasting--------");
		Sample s1 = new Ampules();
		s1.disp();
		System.out.println("-------DownCasting------");
		Ampules a1 = (Ampules) s1;
		a1.tata();
		a1.disp();

	}

}
