package oopPolymorphism;

public class TestCal {

	public static void main(String[] args) {
		Calculator cal1=new Calculator();
		
		System.out.println(cal1.areaOfLand(5,10));
		
		System.out.println(cal1.areaOfLand(6,12,24));
		
		
		
		Calculator cal2=new Calculator();
		
		System.out.println(cal2.areaOfLand(33,22 ,"samsung"));
		
		
		
		
		ModernCal cal3=new ModernCal();
		
		System.out.println(cal3.areaOfLand(6,12,24));
		
		
		
	}

}
