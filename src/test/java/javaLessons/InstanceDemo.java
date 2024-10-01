package javaLessons;

public class InstanceDemo {
	
	public static void main(String[] args) {
	

	VariablesDemo vd = new VariablesDemo();
	vd.setSpeed(80);
	System.out.println("Max speed: " + vd.maxSpeed);
	System.out.println("Current speed: " + vd.currentSpeed);
	
}
}