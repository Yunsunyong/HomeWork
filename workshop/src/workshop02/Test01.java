package workshop02;

public class Test01 {

	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int third = Integer.parseInt(args[2]);
		int max=0,min=0;
		
		//max값 구하기
		if(first > second && first > third) {
			max = first;
		}else if(second > first && second > third) {
			max = second;
		}else if(third > first && third > second) {
			max = third;
		}
		
		//min값 구하기
		if(first < second && first < third) {
			min = first;
		}else if(second < first && second < third) {
			min = second;
		}else if(third < first && third < second) {
			min = third;
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
