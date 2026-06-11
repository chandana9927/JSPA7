package Assignment2;

class Gmail{
	private String logpsw = "Abc12@123";

	public String getLogpsw() {
		return logpsw;
	}

	public void setLogpsw(String logpsw) {
		this.logpsw = logpsw;
	}
	
}

public class Mainclass1 {
	public static void main(String[] args) {
		Gmail g1 = new Gmail();
		System.out.println(g1.getLogpsw());
		g1.setLogpsw("Xyz12@123");
		System.out.println(g1.getLogpsw());
	}

}
