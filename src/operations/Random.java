package operations;

public class Random {
	int randid;
	String randname;
	float randprice;
	Random(int a, String b, float c){
		randid = a;
		randname = b;
		randprice = c;
		System.out.println("Hi this is contructor");
		
	}
	{
		System.out.println("Hi this is random");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random(123, "hafdf", 254.25f);
		System.out.println(r1.randid);
		System.out.println(r1.randname);
		System.out.println(r1.randprice);

	}

}
