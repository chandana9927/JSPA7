package javaPrograms;

class Cool4{
	void add() {
		System.out.println("Hi this is add");
	}
}

class Goolate extends Cool4{
	void dispu() {
		System.out.println("This is dispu");
		int r = 43;
		System.out.println(r);
	}
}
public class MainClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cool4 c1 = new Goolate();
		c1.add();
		Goolate g1 = (Goolate) c1;
		g1.dispu();
		g1.add();

	}

}
