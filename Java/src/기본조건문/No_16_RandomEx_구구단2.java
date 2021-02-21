package 기본조건문;

import java.util.Random;
import java.util.Scanner;

/*
 * 구구단 게임[2단계](01:59.38)
 * 1.구구단 문제 출제를 위해 숫자 2개를 랜덤하게 저장
 * 2.저장된 숫자로 구구단 문제 출력
 * 3.정답 입력
 * 4.정답을 비교하여 정답 또는 땡 출력
 */
public class No_16_RandomEx_구구단2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(8) + 2;
		int y = ran.nextInt(9) + 1;
		int answer = x * y;
		
		System.out.println(x + " * " + y + " = ?");
		int me = scan.nextInt();
		
		if (me == answer) {
			System.out.println("정답");
		} else {
			System.out.println("땡");
		}

	}

}
