package interfaces;


interface Seasons{
	void weather();
}
class Summer implements Seasons{
	public void weather() {
		System.out.println("Summer");
	}
}
class Rainy implements Seasons{
	public void weather() {
		System.out.println("Rainy");
	}
}
class Winter implements Seasons{
	public void weather() {
		System.out.println("Winter");
	}
}
class Climate{
	static void season(Seasons c1) {
		c1.weather();
	}
}

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rainy r1 = new Rainy();
		Summer s1 = new Summer();
		Winter w1 = new Winter();
		Climate.season(w1);
		Climate.season(s1);
		Climate.season(r1);

	}

}
