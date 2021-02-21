package 기본반복문;

import java.util.Random;
import java.util.Scanner;

/*
 * 구구단 게임[3단계] (소요시간 03:42.12)
 * 1.구구단 게임을 5회 반복
 * 2.정답을 맞추면 20점
 * 3.게임 종료 후, 성적 출력
 */
public class No_03_WhileEx_구구단3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 20;
		int cnt = 0;
		
		int i = 1;
		
		while (i <= 5) {

			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			
			int answer = x * y;
			
			System.out.println("[" + i + "]" + x + " * " + y + " = ?");
			int me = scan.nextInt();
			
			if (me == answer) {
				cnt++;
			}
			i++;
		}
		
		int tot = score * cnt;
		
		System.out.println("총점 = " + tot + "점");

	}

}
