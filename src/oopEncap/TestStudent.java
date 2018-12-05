package oopEncap;

public class TestStudent {

	public static void main(String[] args) {
		Student st1=new Student();
		st1.setRoll(102);
		st1.setStId(11);
		st1.setStName("Tasneem");
		st1.setStDob("11-12-1978");
		
		System.out.println( st1.getRoll()+   " \n "   + st1.getStDob() + "\n "+ st1.getStId()+
				"\n " +st1.getStName()
				);
		
	 Student st2= new Student();
	 st2.setStName("tahsan");
	 st2.setStDob("21-11-89");;
		
		System.out.println( st2.getStName() + "\n" + st2.getStDob());
		
		
		
		Student st4=new Student("Rony",25);
		System.out.println(st4.getStName()+"\n" + st4.getStId());
		
		
		
		
	}

}