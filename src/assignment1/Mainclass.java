package assignment1;

class Seasons{
	void weather() {
		System.out.println("Weather");
	}
}
class Summer extends Seasons{
	void weather() {
		System.out.println("Summer");
	}
}
class Rainy extends Seasons{
	void weather() {
		System.out.println("Rainy");
	}
}
class Winter extends Seasons{
	void weather() {
		System.out.println("Winter");
	}
}
class Climate{
	static void season(Seasons c1) {
		c1.weather();
	}
}

public class Mainclass {

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
