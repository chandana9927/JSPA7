package assignment;

interface Animal{
	void noise();
}
class Dog implements Animal{
	public void noise() {
		System.out.println("Bark...");
	}
}
class Cat implements Animal{
	public void noise() {
		System.out.println("Meowwww...");
	}
}
class Snake implements Animal{
	public void noise() {
		System.out.println("Hisssss....");
	}
}
class Stimulator{
	static void sound(Animal a1) {
		a1.noise();
		
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Snake s1 = new Snake();
		
		Stimulator.sound(c1);
		Stimulator.sound(s1);
//		Stimulator.sound(null);
		Stimulator.sound(d1);
//		Stimulator.sound(null);
	}
	
}
