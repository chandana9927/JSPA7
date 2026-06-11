package practise;
class Sample extends Thread{
	public void run() {
		System.out.println("Hello");
	}
}

class Demo implements Runnable{
	public void run() {
		System.out.println("Bye!");
	}
}
public class Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample a1 = new Sample();
		Thread th1 = new Thread(a1);
		th1.start();
		
		Demo d1 = new Demo();
		Thread th2 = new Thread(d1);
		th2.start();

	}

}
