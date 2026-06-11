package interfaces;

interface B_Tech{
	void stream() ;
}
class CSE implements B_Tech{
	public void stream() {
		System.out.println("CSE");
	}
}
class ECE implements B_Tech{
	public void stream() {
		System.out.println("ECE");
	}
}
class EEE implements B_Tech{
	public void stream() {
		System.out.println("EEE");
	}
}
class Student{
	static void engineering(B_Tech s1) {
		s1.stream();
	}
}

public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSE c1 = new CSE();
		ECE ec1 = new ECE();
		EEE ee1 = new EEE();
		Student.engineering(c1);
		Student.engineering(ec1);
		Student.engineering(ee1);

	}

}
