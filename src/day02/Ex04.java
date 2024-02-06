package day02;

public class Ex04 {
	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println(ch);
		int num = ch; // 자동 형변환
		System.out.println(num);
		// char ch02 = num;
		// 위 코드는 더 큰 단위 자료형인 int 에서 더 작은 자료형인 char 자료형으로 형변환이
		// 불가하기 때문에 에러 발생
		char ch02 = (char)num; // 강제 형변환
		System.out.println(ch02);
		
		double d = 1.111;
		float f = 1.111F;
		// 기본 실수 자료형은 double 이기 때문에 뒤에 F를 붙여 float형(4byte) 자료형으로
		// 강제 형변환 함을 명시함
		float f1 = (float)1.111;
		// 일반적인 강제 형변환 형태로도 사용이 가능하다.
		
	}
}
