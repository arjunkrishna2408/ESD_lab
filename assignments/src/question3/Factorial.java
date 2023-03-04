package question3;

public class Factorial {
	private int a;
	
	Factorial(int a){
		this.a = a;
	}
	
	public int getFactorial(int b) {
		if(b==1)
			return 1;
		else
			return (b*getFactorial((b-1)));
	}
}
