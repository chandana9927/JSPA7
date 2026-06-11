package Assignment2;

class PhonePe{
	private int pin = 1234;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
}

public class Mainclass3 {
	public static void main(String[] args) {
		PhonePe p1 = new PhonePe();
		System.out.println(p1.getPin());
		p1.setPin(7383);
		System.out.println(p1.getPin());
	}

}
