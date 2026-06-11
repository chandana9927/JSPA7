package javaPrograms;

class Tester{
	int r = 354;
}

class Tista extends Tester{
	void uliya() {
		System.out.println("Hi, this is uliya");
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester t1 = new Tista();
		System.out.println(t1.r);
		
		Tista ti1 = (Tista) t1;
		System.out.println(ti1.r);
		ti1.uliya();

	}

}
