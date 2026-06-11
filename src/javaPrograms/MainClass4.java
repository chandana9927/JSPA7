package javaPrograms;

class Demo1{
	double z = 35.4352;
}

class Dumataka extends Demo1{
	int x = 364;
}

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Dumataka();
		System.out.println(d1.z);
		Dumataka du1 = (Dumataka) d1;
		System.out.println(du1.x);
		System.out.println(du1.z);
		

	}

}
