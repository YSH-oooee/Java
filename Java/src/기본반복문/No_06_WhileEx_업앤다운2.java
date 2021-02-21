package 기본반복문;

import java.util.Random;
import java.util.Scanner;

/*
 * Up & Down[2단계] (소요시간 03:03.15)
 * 1.정답을 맞추면 게임 종료
 * 2.100점부터 시작해, 오답을 입력할 때마다 5점 감점
 * 3.게임 종료 후, 점수 출력
 */
public class No_06_WhileEx_업앤다운2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 100;
		int answer = ran.nextInt(100) + 1;
		
		while (true) {
			System.out.print("정답 입력[1~100] : ");
			int me = scan.nextInt();
			
			if (me < answer) {
				System.out.println("UP");
			} else if (me > answer) {
				System.out.println("Down");
			} else if (me == answer) {
				System.out.println("Bingo!");
				break;
			}
			score -= 5;
		}
		
		System.out.println("점수 : " + score + "점");

	}

}
