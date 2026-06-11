package Assignment2;

class CanaraBank{
	private int pin = 1234;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
}

public class Mainclass4 {
	public static void main(String[] args) {
		CanaraBank p1 = new CanaraBank();
		System.out.println(p1.getPin());
		p1.setPin(2432);
		System.out.println(p1.getPin());
	}

}
