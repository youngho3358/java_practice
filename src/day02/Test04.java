package day02;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		double standard = (height - 100) * 0.9;
		System.out.println("표준 체중은 " + standard + "kg 입니다.");
		
		
		System.out.println("\n\n");
		
		
		System.out.print("현재 체중을 입력하세요 : ");
		double weight = sc.nextDouble();
		double obesity = (weight / standard) * 100;
		System.out.printf("표준 체중은 %.1fkg 이고 비만도는 %.2f입니다.", standard, obesity);
		
	}
}
