package workshop4;

public class Test05 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int total = 0;
		if (num > 0 && num < 6) {
			for (int i = num; i <= 10; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					continue;
				}
				total += i;
				System.out.print(i + " ");
			}
			System.out.println("\n결과 : " + total);
		}else {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
	}
}
