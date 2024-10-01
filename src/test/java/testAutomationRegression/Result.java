package testAutomationRegression;

public class Result  {
	
public static void main(String []arg) {
	Result result = new Result();
	result.addNumbers();
	//int j=result.addNumWithParameters(50, 100);
	System.out.println(result.addNumWithParameters(50, 100));
	}
	public void addNumbers() {
		int a =10;
		int b=12;
		int d=a+b;
		System.out.println(d);
				}
	public int addNumWithParameters(int x,int y) {
		
		int z = x+y;
		return z;
	}

}
