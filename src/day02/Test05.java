package day02;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 > ");
		String name = sc.nextLine();
		
		System.out.print("국어 점수를 입력하세요 > ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 > ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 > ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double aver = (double)(kor + eng + math) / 3;
		
		System.out.println("==================학생 정보==================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("--------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f", name, kor, eng, math, sum, aver);
		
	}
}
