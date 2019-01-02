package workshop1;

public class Test02 {
	public static void main(String[] args) {
		double dnum = Double.parseDouble(args[0]);
		double dsum = 0, dmul = 1;
		if(dnum > 4 && dnum < 11) {
			for(int i = 1; i <= dnum; i++) {
				dsum += i;
				dmul *= i;
			}
			System.out.println("합 : " + dsum);
			System.out.println("곱 : " + dmul);
			System.out.println("평균 : " + dsum / dnum);
		}else {
			System.out.println("다시 입력하세요.");
		}
	}
}
