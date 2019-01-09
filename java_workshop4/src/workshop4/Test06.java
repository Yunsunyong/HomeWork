package workshop4;

public class Test06 {

	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		double sum = 0,avg = 0;
		int count = 0;
		int[][] arr = new int[first][second];
		
		if(args.length < 2 || args.length > 2) {
			System.out.println("다시 입력하세요");
		}else {
			if((first > 0 && first < 6) || (second > 0 && second < 6)) {
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j <arr[i].length; j++) {
						arr[i][j] = (int)(Math.random() * 5) + 1;
						sum += arr[i][j];
						count++;
					}
				}
				avg = sum/count;
				System.out.println("sum="+sum);
				System.out.println("avg="+avg);
			}else {
				System.out.println("숫자를 확인 하세요");
			}
		}
	}

}
