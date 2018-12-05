package oopAbst;

public abstract class MotorCar implements Car1,Car2 {
	
	public abstract void autostart();
	
	public void manualStart() {
		System.out.println("can start manually");
	}

}
