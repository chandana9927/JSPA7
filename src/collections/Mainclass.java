package collections;

import java.util.Arrays;
class Emp implements Comparable{
	int id;
	String name;
	double sal;
	public Emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public String toString() {
		return id + " " + name + " " + sal;
	}
	
	public int compareTo(Object obj) {
		Emp e = (Emp) obj;
//		return this.id-e.id;
		return (int) (this.sal - e.sal);
//		return this.name-compareTo(e.name);
		
	}
}

public class Mainclass {
	public static void main(String[] args) {
		Emp e1 = new Emp(5, "Irwin", 5600.99);
		Emp e2 = new Emp(7, "Rowan", 8999.99);
		Emp e3 = new Emp(3, "Albert", 10000.99);
		Emp arr[] = {e1, e2, e3};
//		System.out.println(e1.toString());
//		System.out.println(e2.toString());
//		System.out.println(e3.toString());
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
