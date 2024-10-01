package javaLessons;

public class VariablesDemo {
	
	public static void main(String[] args) {
		VariablesDemo vb = new VariablesDemo();
		vb.setSpeed(80);
		System.out.println("Max speed: " + vb.maxSpeed);
		System.out.println("Current speed: " + vb.currentSpeed);
		}
		
	// Initialisation
	int speed= 80; 

	int distance = 20;
	static int maxSpeed = 120; // Static variable
	int currentSpeed; // Instance variable

	void setSpeed(int speed) {
	int tempSpeed = speed; // Local variable
	currentSpeed = tempSpeed;
	}
}



