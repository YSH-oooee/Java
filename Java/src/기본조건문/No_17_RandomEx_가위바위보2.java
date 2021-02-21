package 기본조건문;

import java.util.Random;
import java.util.Scanner;

/*
 * 가위(0)바위(1)보(2) 게임[2단계](04:08.30)
 * 1.com은 0~2 사이의 랜덤 숫자 저장
 * 2.me는 0~2 사이의 숫자를 입력받는다
 * 3.com과 me를 비교하여,
 * 		1)비겼다
 * 		2)me가 이겼다
 * 		3)me가 졌다		를 출력한다
 */
public class No_17_RandomEx_가위바위보2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(3);
		
		System.out.print("가위(0)바위(1)보(2) 입력 : ");
		int me = scan.nextInt();
		
		System.out.print("com = ");
		if (com == 0) {
			System.out.println("가위");
		} else if (com == 1) {
			System.out.println("바위");
		} else if (com == 2) {
			System.out.println("보");
		}
		
		if (me == 0 && com == 1 || me == 1 && com == 2 || me == 2 && com == 0) {
			System.out.println("me가 졌다");
		} else if (me == 0 && com == 2 || me == 1 && com == 0 || me == 2 && com == 1) {
			System.out.println("me가 이겼다");
		} else {
			System.out.println("비겼다");
		}

	}

}
