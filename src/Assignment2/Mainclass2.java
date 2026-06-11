package Assignment2;

class Amazon{
	private String logpsw = "am@123";

	public String getLogpsw() {
		return logpsw;
	}

	public void setLogpsw(String logpsw) {
		this.logpsw = logpsw;
	}
	
}

public class Mainclass2 {
	public static void main(String[] args) {
		Amazon a1 = new Amazon();
		System.out.println(a1.getLogpsw());
		a1.setLogpsw("amazon@123");
		System.out.println(a1.getLogpsw());
	}

}
