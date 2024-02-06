package day02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next(); // 문자열을 입력받을때 사용
		
		System.out.print("수 입력 : ");
		num = input.nextInt(); // 정수를 입력받을때 사용
		
		System.out.println("이름 : " + name);
		System.out.println("입력 수 : " + num);
		
		double dou;
		System.out.println("실수 입력 : ");
		dou = input.nextDouble();
		System.out.println("실수 : " + dou);
		
	}
}
