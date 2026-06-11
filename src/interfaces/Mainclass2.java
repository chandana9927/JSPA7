package interfaces;


interface Communication{
	
	void via();
}
class Kannada implements Communication{
	public void via(){
		System.out.println("Kannada");
	}
}
class English implements Communication{
	public void via() {
		System.out.println("English");
	}
}
class Hindi implements Communication{
	public void via() {
		System.out.println("Hindi");
	}
}
class Language{
	static void speak(Communication l1) {
		l1.via();
	}
}

public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kannada k1 = new Kannada();
		English e1 = new English();
		Hindi h1 = new Hindi();
		Language.speak(k1);
		Language.speak(e1);
		Language.speak(h1);

	}

}

