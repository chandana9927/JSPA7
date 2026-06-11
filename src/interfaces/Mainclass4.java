package interfaces;

interface Geometric_shape{
	void side();
}
class Triangle implements Geometric_shape{
	public void side() {
		System.out.println("Triangle");
	}
}
class Rectangle implements Geometric_shape{
	public void side() {
		System.out.println("Rectangle");
	}
}
class Pentagon implements Geometric_shape{
	public void side() {
		System.out.println("Pentagon");
	}
}
class Figure{
	static void shape(Geometric_shape f1) {
		f1.side();
	}
}

public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle();
		Rectangle r1 = new Rectangle();
		Pentagon p1 = new Pentagon();
		Figure.shape(t1);
		Figure.shape(r1);
		Figure.shape(p1);
		

	}

}

