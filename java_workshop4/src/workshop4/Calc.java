package workshop4;

public class Calc {
	
	public int calculate(int data) {
		int sum = 0;
		for(int i = 1; i <= data; i++) {
			if(i % 2 == 1) {
				continue;
			}
			sum += i;
		}
		return sum;
	}
}
