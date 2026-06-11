package operations;

public class NewOperation {
	void consume(int a ) {
		System.out.println(a + " Consumed");
	}
	static void consume(float a) {
		System.out.println("Consumed static " + a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewOperation n1 = new NewOperation();
		n1.consume(8);
		NewOperation.consume(27.34f);

	}

}
