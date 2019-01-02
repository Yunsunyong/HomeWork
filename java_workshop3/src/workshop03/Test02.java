package workshop03;

public class Test02 {

	public static void main(String[] args) {
		int result = Integer.parseInt(args[0]);
		if(result > 4 && result < 11)
			System.out.println("결과 : " + new Calc().calculate(result));
		else
			System.out.println("다시 입력하세요");
	}

}
