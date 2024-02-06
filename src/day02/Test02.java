package day02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요 > ");
		num = sc.nextInt();
		
		String div2 = (num % 2 == 0)? num + " = 짝수" : num + " = 홀수";
		System.out.println(div2);
		String div3 = (num % 3 == 0)? num + " = 3의 배수입니다." : num + " = 3의 배수가 아닙니다.";
		System.out.println(div3);
		
		System.out.println("수를 입력하세요 > ");
		int num1 = sc.nextInt();
		System.out.println("수를 입력하세요 > ");
		int num2 = sc.nextInt();
		
		String moreLarge = (num1 > num2)?
				num1 + "이 " + num2 + "보다 크다." : num1 + "이 " + num2 + "보다 작다.";
		System.out.println(moreLarge);
		
	}
}
