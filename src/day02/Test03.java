package day02;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		System.out.println("======================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("올해의 년도를 4자리로 입력하세요 > ");
		int year = sc.nextInt();
		System.out.print("당신이 태어난 년도를 4자리로 입력하세요 > ");
		int birth = sc.nextInt();
		System.out.println("당신의 나이는 " + (year - birth +1) + "입니다.");
		System.out.println("======================================");

		System.out.println("\n");

		System.out.println("======================================");
		double weight = 600;
		System.out.print("첫 번째 물건의 무게를 입력 하시오 > ");
		double thing1 = sc.nextDouble();
		weight -= thing1;
		System.out.print("두 번째 물건의 무게를 입력 하시오 > ");
		double thing2 = sc.nextDouble();
		weight -= thing2;
		System.out.println("현재 엘리베이터에 허용 무게는 " + weight + "kg 입니다.");
		
	}
}
