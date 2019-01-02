package month;

public class MonthsTest {

	public static void main(String[] args) {
		int result = Integer.parseInt(args[0]);
		if(args.length > 1) {
			System.out.println("다시 입력하세요");
		}else if(args.length == 1) {
			if(result > 0 && result < 13) {
				System.out.println("입력받은월 : " + args[0] + "월");
				System.out.println("마지막일자 : " + new Months().getDays(result) + "일");
			}else {
				System.out.println("입력된 값이 잘못 되었습니다");
			}
		}
	}

}
