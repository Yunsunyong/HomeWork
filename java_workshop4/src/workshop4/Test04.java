package workshop4;

public class Test04 {

	public static void main(String[] args) {
		int data = Integer.parseInt(args[0]);
		int total = new Calc().calculate(data);
		if (data > 4 && data < 11) {
			System.out.print("짝수: ");
			for (int i = 1; i <= data; i++) {
				if (i % 2 == 1) {
					continue;
				}
				System.out.print(i + " ");
			}
			System.out.println("\n결과: " + total);
		}else {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
	}
}
