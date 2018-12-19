package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		
		System.out.print("상품명 : ");
		p.setName(sc.nextLine());
		System.out.print("가격 : ");
		p.setPrice(sc.nextInt());
		System.out.print("수량 : ");
		p.setQuntity(sc.nextInt());
		String str = p.information();
		
		System.out.println(str + "\n총 구매 가격 : "+
		(p.getPrice()*p.getQuntity()) + "원");				
	}
}
