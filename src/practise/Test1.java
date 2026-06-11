package practise;

public class Test1 {
	String name;
	int cost;
	String color;
	Test1(String name,int cost,String color)
	{
		this.name=name;
		this.cost=cost;
		this.color=color;
	}
	public boolean equals(Object obj)
	{
		Test1 t=(Test1) obj;
		return this.cost==t.cost;
	}
	public static void main(String[] args) {
		Test1 t1=new Test1("abc",500,"efg");
		Test1 t2=new Test1("abc",560,"efg");
		if(t1.equals(t2))
		{
			System.out.println("ok");
		}
		else
		{
			System.out.println("not ok");
		}
	}
}
