package assignment1;
class B_Tech{
	void stream() {
		System.out.println("Stream");
	}
}
class CSE extends B_Tech{
	void stream() {
		System.out.println("CSE");
	}
}
class ECE extends B_Tech{
	void stream() {
		System.out.println("ECE");
	}
}
class EEE extends B_Tech{
	void stream() {
		System.out.println("EEE");
	}
}
class Student{
	static void engineering(B_Tech s1) {
		s1.stream();
	}
}

public class Mainclass2 {

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
