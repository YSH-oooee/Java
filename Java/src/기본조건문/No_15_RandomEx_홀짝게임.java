package 기본조건문;

import java.util.Random;
import java.util.Scanner;

/*
 * 홀짝게임(02:36.02)
 * 1.1~100 사이의 랜덤 숫자 저장
 * 2.저장된 랜덤 숫자를 보여주고
 * 3.해당 숫자가 홀수인지, 짝수인지 맞추는 게임
 */
public class No_15_RandomEx_홀짝게임 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int r = ran.nextInt(100) + 1;
		
		int answer = 0;
		if (r % 2 == 0) {
			answer = 2;
		} else if (r % 2 == 1) {
			answer = 1;
		}
		
		System.out.println("[" + r + "]");
		System.out.println("1.홀수");
		System.out.println("2.짝수");
		
		System.out.print("번호 선택 : ");
		int choice = scan.nextInt();
		
		if (choice == answer) {
			System.out.println("정답");
		} else {
			System.out.println("땡");
		}

	}

}
