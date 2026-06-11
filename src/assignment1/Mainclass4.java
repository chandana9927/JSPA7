package assignment1;
class Fabric{
	void variety() {
		System.out.println("Variety");
	}
}
class Cotton extends Fabric{
	void variety() {
		System.out.println("Cotton");
	}
}
class Silk extends Fabric{
	void variety() {
		System.out.println("Silk");
	}
}
class Velvet extends Fabric{
	void variety() {
		System.out.println("Velvet");
	}
}
class Textile{
	static void cloth(Fabric t1) {
		t1.variety();
	}
}

public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cotton c1 = new Cotton();
		Silk s1 = new Silk();
		Velvet v1 = new Velvet();
		Textile.cloth(c1);
		Textile.cloth(s1);
		Textile.cloth(v1);

	}

}
