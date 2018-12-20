package ncs.test2;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		
		String[] st = str.split(",");
		int count = 0;
		for(String std : st) {
			double d = Double.parseDouble(std);
			data[count] = d;
			sum += data[count];
			count++;
		}		
		System.out.printf("합계 : %.3f",sum);
		System.out.printf("\n평균 : %.3f",sum/data.length);
		
		
	}

}
