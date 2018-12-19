package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			System.out.println(cal.getSum(num));
		}catch(InvalidException e) {
			System.out.println(e.getMessage());
		}

	}

}
