package trial;

class Animal{
	void noise() {
		System.out.println("Some noise...");
	}
}
class Dog extends Animal{
	void noise() {
		System.out.println("Bark...");
	}
}
class Cat extends Animal{
	void noise() {
		System.out.println("Meowwww...");
	}
}
class Snake extends Animal{
	void noise() {
		System.out.println("Hisssss....");
	}
}
class Stimulator{
	static void sound(Animal a1) {
		if(a1 instanceof Animal) {
		a1.noise();
		}
	}
}
public class Mainclass {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Snake s1 = new Snake();
		
		Stimulator.sound(c1);
		Stimulator.sound(s1);
		Stimulator.sound(null);
		Stimulator.sound(d1);
		Stimulator.sound(null);
	}
	
}
