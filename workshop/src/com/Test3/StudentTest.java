package com.Test3;

public class StudentTest {

	public static void main(String[] args) {
		double ageSum = 0, heiSum = 0, weiSum = 0;
		Student studentArray[] = new Student[3];
		
		studentArray[0] = new Student("홍길동",15,170,80);
		studentArray[1] = new Student("한사람",13,180,70);
		studentArray[2] = new Student("임걱정",16,175,65);
	
		System.out.println("이름    나이   신장   몸무게");
		for(int i = 0; i < studentArray.length; i++) {			
			System.out.println(studentArray[i].studentInfo());
			ageSum += studentArray[i].getAge();
			heiSum += studentArray[i].getHeight();
			weiSum += studentArray[i].getWeight();
		}
		
		System.out.printf("\n나이 평균 : %.3f", ageSum/3);
		System.out.printf("\n신장 평균 : %.3f", heiSum/3);
		System.out.printf("\n몸무게 평균 : %.3f",weiSum/3);
		System.out.println();
		System.out.println("\n나이가 가장 많은 학생 : " + studentArray[2].getName());
		System.out.println("나이가 가장 적은 학생 : " + studentArray[1].getName());
		System.out.println("신장이 가장 큰 학생 : " +studentArray[1].getName());
		System.out.println("신장이 가장 작은 학생 : " + studentArray[0].getName());
		System.out.println("몸무게가 가장 많이 나가는 학생 : " + studentArray[0].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생 : " + studentArray[2].getName());
	}
}
