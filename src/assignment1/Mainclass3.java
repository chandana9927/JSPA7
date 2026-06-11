package assignment1;
class Geometric_shape{
	void side() {
		System.out.println("Side");
	}
}
class Triangle extends Geometric_shape{
	void side() {
		System.out.println("Triangle");
	}
}
class Rectangle extends Geometric_shape{
	void side() {
		System.out.println("Rectangle");
	}
}
class Pentagon extends Geometric_shape{
	void side() {
		System.out.println("Pentagon");
	}
}
class Figure{
	static void shape(Geometric_shape f1) {
		f1.side();
	}
}

public class Mainclass3 {

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
