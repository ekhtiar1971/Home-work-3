package oopPolymorphism;

public class Calculator {
	
	public int areaOfLand(int a,int b) {
		int total=a+b;
		return total;
	}

   public int areaOfLand(int a,int b,int c) {
	int total=a+b+c;
	return total;
	}
   public String areaOfLand(int a,int b,String name) {
	String total=a+b+name;
	return total;
}
}