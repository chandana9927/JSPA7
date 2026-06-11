package javaPrograms;

class Cool2{
	void disp() {
		System.out.println("Hi, this is disp");
	}
}

class Dinga extends Cool2{
	void tata() {
		System.out.println("This is tata");
		int x =47;
		System.out.println(x);
	}
}

public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cool2 c1 = new Dinga();
		c1.disp();
		Dinga d1 = (Dinga) c1;
		d1.tata();
		d1.disp();
		
		

	}

}
