package javaPrograms;

class Cool{
	void add() {
		int a = 10, b = 20;
		System.out.println(a + b);
	}
}

class Goolata extends Cool{
	void dispu() {
		System.out.println("This is disp");
	}
}

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cool c1 = new Goolata();
		c1.add();
		Goolata g1 = (Goolata) c1;
		g1.dispu();
		g1.add();
		

	}

}
