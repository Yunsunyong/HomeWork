package workshop1;

public class Test01 {

	public static void main(String[] args) {
		double first = Double.parseDouble(args[0]);
		double second = Double.parseDouble(args[1]);
		if ((first > 0 && first < 11) && (second > 0 && second < 11)) {
			if (first % second <= 1) {
				System.out.println("나머지가 1보다 작거나 같다!");
			} else if (first % second > 1) {
				System.out.println("나머지가 1보다 크다!");
			}
		}else {
			System.out.println("1부터 10까지의 정수값을 입력하세요.");
		}

	}
}
