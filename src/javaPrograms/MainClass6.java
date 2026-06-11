package javaPrograms;

class Cola1{
	int f = 263;
}

class Chungacha extends Cola1{
	int d = 373;
}

public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola1 c1 = new Chungacha();
		System.out.println(c1.f);
		Chungacha ch1 = (Chungacha) c1;
		System.out.println(ch1.d);
		System.out.println(ch1.f);
	}

}
