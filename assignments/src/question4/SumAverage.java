package question4;

public class SumAverage {
	int[] numbers;
	
	public SumAverage(int a) {
		numbers = new int[a];
	}
	
	public double[] getSumAvgOfOdd(int[] b) {
		double[] sum = new double[2];
		int len = 0;
		for(int i=0; i<b.length;i++) {
			if(i%2==1) {
				sum[0]+=b[i];
				len++;
			}
		}
		sum[1] = sum[0]/len;
		return sum;
	}
	
	public double[] getSumAvgOfEven(int[] b) {
		double[] sum = new double[2];
		int len = 0;
		for(int i=0; i<b.length;i++) {
			if(i%2==0) {
				sum[0]+=b[i];
				len++;
			}
		}
		sum[1] = sum[0]/len;
		return sum;
	}
}
