package javaPrograms;

interface A{
	void fin();
	void ret();
}

abstract class Up implements A{
	public void fin() {
		System.out.println("Hiii");
	}
}

public class Samm extends Up{
	public void ret() {
		System.out.println("Byeee");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Samm s1 = new Samm();
		s1.fin();
		s1.ret();
		

	}

}
