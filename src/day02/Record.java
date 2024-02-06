package day02;

import java.util.Scanner;

public class Record {
	public static void recordScore() {
		
		System.out.print("당신의 이름은 무엇입니까 ? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        
        String[] subjects = {"국어", "영어", "수학"};
        final int SIZE = subjects.length;
        int[] scores = new int[SIZE];
        
	}
	
	public static void recordInput(String name, String[]subjects, int[] scores, int SIZE) {
		
		for (int i=0; i<=SIZE; i++ ) {
			Scanner scanner = new Scanner(System.in);
			scores[i] = scanner.nextInt();
			System.out.println(subjects[i] + "의 점수를 입력하세요 : ");
			
		}
	}
	
	public static void printScore(String name, String[]subjects, int[] scores, int SIZE ) {
		
		
		
	}
}
