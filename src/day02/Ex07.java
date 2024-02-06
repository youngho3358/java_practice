package day02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		String name = null;
		// String 자료형은 0 으로 초기화 할 수 없다
		// String 자료형은 null 로 초기화해야 한다
		int kor = 0, eng = 0, math = 0, sum = 0;
		double dou = 0;
		// 자료형의 첫번째 글자가 소문자인 자료형들은 0으로 초기화를 진행해준다
		
		System.out.println(name);
		System.out.println(sum);
		// 위 코드 3줄은 해당 자료형들이 초기화되지 않으면 오류가 발생한다
		// 초기화가 되어있지 않기 때문! 그래서 입력값을 받은 후 코드를 작성하던가
		// 변수를 선언할때 바로 초기화를 진행해버린다.
		
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? ");
		name = input.next();
		System.out.print(name +" 님의 국어 점수 : ");
		kor = input.nextInt();
		System.out.print(name +" 님의 영어 점수 : ");
		eng = input.nextInt();
		System.out.print(name +" 님의 수학 점수 : ");
		math = input.nextInt();
		
		sum = kor + eng + math;
		
		System.out.println("===============");
		System.out.println("이 름 : " + name.charAt(0) + " " + name.charAt(1) + " " + name.charAt(2));
		System.out.println("===============");
		System.out.println("국 어 : " + kor);
		System.out.println("영 어 : " + eng);
		System.out.println("수 학 : " + math);
		System.out.println("===============");
		System.out.println("합 계 : " + sum);
		System.out.println("===============");
		
		
		
	}
}
