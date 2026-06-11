package Assignment2;

class Verifcation{
	private int otp = 123456;

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
	
}

public class Mainclass5 {
	public static void main(String[] args) {
		Verifcation v1 = new Verifcation();
		System.out.println(v1.getOtp());
		v1.setOtp(232521);
		System.out.println(v1.getOtp());
		
	}

}
